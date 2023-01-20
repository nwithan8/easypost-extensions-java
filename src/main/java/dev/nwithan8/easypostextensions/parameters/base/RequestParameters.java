package dev.nwithan8.easypostextensions.parameters.base;

import dev.nwithan8.easypostextensions.internal.annotations.Parameter;
import dev.nwithan8.easypostextensions.internal.enums.Necessity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public abstract class RequestParameters implements IRequestParameters {

    private @NotNull Map<String, @Nullable Object> parametersDictionary;

    protected RequestParameters() {
        this.parametersDictionary = new HashMap<>();
    }

    protected RequestParameters(@NotNull Map<String, Object> overrideParameters) {
        this.parametersDictionary = overrideParameters;
    }

    // TODO: Account for API versioning
    public Map<String, @Nullable Object> toDictionary() {
        // Verify that all required parameters are set in the dictionary
        validate();

        // Construct the dictionary of all parameters for this API version

        // Get all fields in this class that are annotated with @Parameter
        Stream<Field> parameters =
                Arrays.stream(this.getClass().getFields()).filter(field -> field.isAnnotationPresent(Parameter.class));

        for (Field parameter : (Iterable<Field>) parameters::iterator) {
            // Get the annotation for this parameter
            Parameter annotation = parameter.getAnnotation(Parameter.class);

            // Ignore any optional parameters that are null
            if (annotation.necessity() == Necessity.OPTIONAL && parametersDictionary.get(parameter.getName()) == null) {
                continue;
            }

            // All required parameters should be set at this point

            try {
                // Get the value of the parameter
                Object value = parameter.get(this);

                // Get the necessity of the parameter
                Necessity necessity = annotation.necessity();

                // Get the path to the parameter in the JSON
                Stream<String> jsonPath = Arrays.stream(annotation.jsonPath());

                if (parameter.getType().isAssignableFrom(RequestParameters.class)) {
                    // If the value is a RequestParameters object, recursively add its parameters
                    value = ((RequestParameters) value).toDictionary();
                } else if (parameter.getType().isAssignableFrom(List.class)) {
                    // If the value is a list of RequestParameters object, add each item in the list to the dictionary
                    List<Map<String, Object>> newValues = new ArrayList<>();
                    for (RequestParameters item : (List<RequestParameters>) value) {
                        Map<String, Object> newValue = item.toDictionary();
                        newValues.add(newValue);
                    }
                    value = newValues;
                }
                parametersDictionary = updateMap(parametersDictionary, jsonPath, value);
            } catch (IllegalAccessException e) {
                // Ignore bad parameters
                continue;
            }
        }


        // Return the dictionary, removing any null values now that we've verified all required parameters are set
        // Anything still null at this point is an optional parameter that was not set that can be stripped from the request
        return parametersDictionary;
    }

    public void validate() {
        // Get all fields in this class that are annotated with @Parameter
        Stream<Field> parameterStream =
                Arrays.stream(this.getClass().getFields()).filter(field -> field.isAnnotationPresent(Parameter.class));
        List<Field> parameters = new ArrayList<>();
        parameterStream.forEach(parameters::add);

        // Check that all required parameters are set
        for (Field parameter : parameters) {
            // If the field is marked required
            if (parameter.getAnnotation(Parameter.class).necessity() == Necessity.REQUIRED) {
                try {
                    // If the field is required but not set, throw an exception
                    if (parameter.get(this) == null) {
                        throw new IllegalStateException("Required parameter " + parameter.getName() + " is not set");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            // TODO: Handle overridden parameters during validation
        }
    }

    private Map<String, Object> updateMap(@NotNull Map<String, Object> map, Stream<String> path, Object value) {
        List<String> pathList = new ArrayList<>();
        path.forEach(pathList::add);

        if (pathList.size() == 0) {
            // Don't need to go down
            return map;
        }

        if (pathList.size() == 1) {
            // Last key left
            String soloKey = pathList.get(0);
            if (map.containsKey(soloKey)) {
                // Key-value pair already exists in dictionary (likely because of override parameters)
                // Only change the value if the existing value is null
                map.putIfAbsent(soloKey, value);
            } else {
                // Key does not exist, so we can just add it
                map.put(soloKey, value);
            }
            return map;
        }

        // Need to go down another level
        // Get the key and update the list of keys
        String key = pathList.get(0);
        pathList.remove(0);
        if (!map.containsKey(key)) {
            // Key does not exist, so we can just add it
            Object subValue = updateMap(new HashMap<>(), pathList.stream(), value);
            map.put(key, subValue);
        }

        Object subMap = map.get(key);
        if (subMap instanceof Map) {
            // If the subMap is a Map, update it
            Map<String, Object> subMapCast = (Map<String, Object>) subMap;
            map.put(key, subMapCast);
        } else {
            // If the subMap is not a Map, we can't update it
            throw new IllegalStateException("Found a non-map while traversing the map");
        }

        return map;
    }
}
