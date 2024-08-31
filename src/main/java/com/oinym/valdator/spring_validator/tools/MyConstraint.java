package com.oinym.valdator.spring_validator.tools;

import java.lang.annotation.Target;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { MyConstarintProcessing.class })
public @interface MyConstraint {
  String message() default "Inavlid value must match field pattern";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

  String pattern(); 
}