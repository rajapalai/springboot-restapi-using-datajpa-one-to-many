package com.springbootdatajpaonetomany.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3019099250047822996L;

	public UserNotFoundException(String message) {
		super(message);
	}
}
