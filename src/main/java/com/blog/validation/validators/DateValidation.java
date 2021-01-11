package com.blog.validation.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ FIELD, METHOD, PARAMETER })

@Constraint(validatedBy = { DateValidatorImpl.class })
public @interface DateValidation {
	 public String message() default "Invalid datetime!";
	    public String format() default "MMyy";
	    public Class<?>[] groups() default {};
	    public Class<? extends Payload>[] payload() default {};
}

