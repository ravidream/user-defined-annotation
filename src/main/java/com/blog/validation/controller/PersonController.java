package com.blog.validation.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blog.validation.model.ImmutablePerson;
import com.test.exception.InvalidDataException;

@RestController
@RequestMapping("/test")
public class PersonController {

	@RequestMapping(path = "/person", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> person(@Valid @RequestBody ImmutablePerson immutablePerson, BindingResult result) {
		if (result.hasErrors()) {
            throw new InvalidDataException(result);
        } else {
        	return new ResponseEntity(immutablePerson, HttpStatus.ACCEPTED);
        }		
	}

}
