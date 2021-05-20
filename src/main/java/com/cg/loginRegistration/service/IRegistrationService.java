package com.cg.loginRegistration.service;

import com.cg.loginRegistration.entities.Registration;
import com.cg.loginRegistration.exception.RegistrationException;

public interface IRegistrationService {

	public String EmployeeRegistration(Registration registration) throws RegistrationException;
	public String UserRegistration(Registration registration) throws RegistrationException;
}
