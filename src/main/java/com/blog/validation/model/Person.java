package com.blog.validation.model;

import javax.validation.constraints.NotNull;

import org.immutables.serial.Serial;
import org.immutables.value.Value;
import org.springframework.validation.annotation.Validated;

import com.blog.validation.validators.DateValidation;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@Serial.Structural
@JsonSerialize(as = ImmutablePerson.class)
@JsonDeserialize(as = ImmutablePerson.class)
@Validated
public interface Person{

	long getLongVal();
	@NotNull
	int getId();
	@NotNull
	String getName();
	
	@DateValidation(format="MMyy", message="TEST")
	String getStrDate();
}
