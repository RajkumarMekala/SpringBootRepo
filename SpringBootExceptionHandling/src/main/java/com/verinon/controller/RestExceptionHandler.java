package com.verinon.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.verinon.binding.APIError;
import com.verinon.exception.NoProductFoundException;

@RestController
@ControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler(value = NoProductFoundException.class)
	public ResponseEntity<APIError> handleNoProductFoundException() {
		APIError apiError = new APIError(404, "No Product found", new Date());
		return new ResponseEntity<APIError>(apiError, HttpStatus.BAD_REQUEST);

	}

}
