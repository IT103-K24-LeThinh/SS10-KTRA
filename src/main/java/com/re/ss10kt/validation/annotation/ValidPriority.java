package com.re.ss10kt.validation.annotation;

import com.re.ss10kt.validation.validator.DeadlineValidator;
import com.re.ss10kt.validation.validator.PriorityValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PriorityValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPriority {
    String message() default "Mức độ ưu tiên ko hợp lệ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
