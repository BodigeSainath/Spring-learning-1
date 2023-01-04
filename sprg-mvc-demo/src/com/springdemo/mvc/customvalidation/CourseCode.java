package com.springdemo.mvc.customvalidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CourseCodeConstraintValidator.class)//CourseCodeConstraintValidator is cls contaons business logic
@Target({ElementType.METHOD,ElementType.FIELD})// tells at wt levell CourseCode can we use
@Retention(RetentionPolicy.RUNTIME)// tells when CourseCode made available to jvm
public @interface CourseCode {

	public String value() default "LUV";
	
	public String message() default "must strat with LUV";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};
}
