package dev.nwithan8.easypostextensions.internal.annotations;

import dev.nwithan8.easypostextensions.internal.enums.Necessity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention (RetentionPolicy.RUNTIME)
public @interface Parameter {
    @NotNull Necessity necessity();

    @Nullable String[] jsonPath() default { };
}
