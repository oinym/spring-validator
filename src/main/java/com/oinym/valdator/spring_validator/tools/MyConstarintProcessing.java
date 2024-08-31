package com.oinym.valdator.spring_validator.tools;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

import org.springframework.stereotype.Component;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MyConstarintProcessing implements ConstraintValidator<MyConstraint, String> {
  private String pattern;

  @Override
  public void initialize(MyConstraint constraintAnnotation) {
    this.pattern = constraintAnnotation.pattern();
  }

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    if (value == null) {
      return true; // Handle null values separately if needed
    }
    if (value.isEmpty()) {
      return false; // Empty string is invalid
    }
    return value.matches(pattern); // Check if the value matches the pattern
  }

}