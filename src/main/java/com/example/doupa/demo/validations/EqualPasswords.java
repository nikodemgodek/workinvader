package com.example.doupa.demo.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {EqualPasswordValidation.class})
public @interface EqualPasswords {

    String message() default "dupa";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}