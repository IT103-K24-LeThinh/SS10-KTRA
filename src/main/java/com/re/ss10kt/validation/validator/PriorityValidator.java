package com.re.ss10kt.validation.validator;

import com.re.ss10kt.validation.annotation.ValidDeadline;
import com.re.ss10kt.validation.annotation.ValidPriority;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;

public class PriorityValidator implements ConstraintValidator<ValidPriority, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isBlank()) {
            return true;
        }

        return value.equalsIgnoreCase("high") || value.equalsIgnoreCase("medium") || value.equalsIgnoreCase("low");
    }
}
