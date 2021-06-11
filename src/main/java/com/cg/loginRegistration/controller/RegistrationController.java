package com.cg.loginRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.loginRegistration.entities.Registration;
import com.cg.loginRegistration.exception.RegistrationException;
import com.cg.loginRegistration.service.RegistrationServiceImpl;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class RegistrationController {

	@Autowired
	private RegistrationServiceImpl registrationServiceImpl;
	
	/*Employee Registration*/
	@PostMapping("/Registration")
	public ResponseEntity<String> EmployeeRegistration(@RequestBody Registration registration) throws RegistrationException {
		String str = registrationServiceImpl.EmployeeRegistration(registration);
		return new ResponseEntity<String>(str, HttpStatus.CREATED);
	}

}
