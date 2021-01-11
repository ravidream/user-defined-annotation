package com.blog.validation.validators;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateValidatorImpl implements ConstraintValidator<DateValidation, String> {

	public DateValidatorImpl() {

	}

	private String dateFormat;

    @Override
    public void initialize(DateValidation constraintAnnotation) {
        dateFormat = constraintAnnotation.format();
    }

    @Override
    public boolean isValid(String strDate, ConstraintValidatorContext context) {
    	boolean status = false;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMyy");
            simpleDateFormat.setLenient(false);
            Date expiry = simpleDateFormat.parse(strDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(expiry);
            calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
            expiry = calendar.getTime();
            Date currentDate = new Date();            
            
            boolean expired = expiry.after(currentDate);
            if (expired == true){
            	status = true;
            }else {
            	status = false;
            }
        } catch (Exception e) {
            status = false;
        }
        return status;
    }
}

