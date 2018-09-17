package com.spring.mvc.validation.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
	implements ConstraintValidator<CourseCode, String>{
	
	private String corusePerfix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		corusePerfix = theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, 
						ConstraintValidatorContext theConstraintValidatorContext) {
			boolean result; 
			if(theCode!=null)
			result = theCode.startsWith(corusePerfix);
			else result = true;
		return result;
	}

}
