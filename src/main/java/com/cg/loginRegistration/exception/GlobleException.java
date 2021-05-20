package com.cg.loginRegistration.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobleException {

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<String> handleException(Exception e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = RegistrationException.class)
	public ResponseEntity<String> handleException(RegistrationException re) {
		return new ResponseEntity<String>(re.getMessage(), HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(value = UserException.class)
	public ResponseEntity<String> handleException(UserException ue) {
		return new ResponseEntity<String>(ue.getMessage(), HttpStatus.NOT_FOUND);
	}

}
