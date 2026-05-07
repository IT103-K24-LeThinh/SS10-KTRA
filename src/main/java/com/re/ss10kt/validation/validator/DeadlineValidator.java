package com.re.ss10kt.validation.validator;

import com.re.ss10kt.validation.annotation.ValidDeadline;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;

public class DeadlineValidator implements ConstraintValidator<ValidDeadline, LocalDate> {

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        return value != null && !value.isBefore(LocalDate.now()) && !value.equals(LocalDate.now());
    }
}
