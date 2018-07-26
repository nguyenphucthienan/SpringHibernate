package com.nguyenphucthienan.springmvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface CourseCode {
    // Define default value
    String value() default "ABC";

    // Define default error message
    String message() default "must start with ABC";

    // Define default groups
    Class<?>[] groups() default {};

    // Define default payload
    Class<? extends Payload>[] payload() default {};
}
