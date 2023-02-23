package com.macgyver.auth.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class EnumValidator implements ConstraintValidator<ValidEnum, Enum<?>> {

    private Set<String> allowedValues;

    @Override
    public void initialize(ValidEnum annotation) {
        Class<? extends Enum<?>> enumClass = annotation.enumClass();
        allowedValues = Arrays.stream(enumClass.getEnumConstants())
                .map(Enum::name)
                .collect(Collectors.toSet());
    }

    @Override
    public boolean isValid(Enum<?> value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // null values should be validated with @NotNull
        }
        return allowedValues.contains(value.name());
    }
}
