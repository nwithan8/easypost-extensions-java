package dev.nwithan8.easypostextensions.parameters;

import dev.nwithan8.easypostextensions.internal.annotations.Parameter;
import dev.nwithan8.easypostextensions.internal.enums.Necessity;
import org.jetbrains.annotations.Nullable;

public class Addresses {
    public static class Create extends dev.nwithan8.easypostextensions.parameters.base.RequestParameters {

        @Parameter (necessity = Necessity.REQUIRED, jsonPath = { "address", "carrier_facility" })
        public @Nullable String carrierFacility;

        public Create() {
            super();
        }

        public Create(java.util.Map<String, Object> overrideParameters) {
            super(overrideParameters);
        }
    }
}
