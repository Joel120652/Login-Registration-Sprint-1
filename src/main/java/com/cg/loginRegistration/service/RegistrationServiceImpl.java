package com.cg.loginRegistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.loginRegistration.entities.Registration;
import com.cg.loginRegistration.exception.RegistrationException;
import com.cg.loginRegistration.repository.IRegistrationRepository;

@Service
public class RegistrationServiceImpl implements IRegistrationService {

	@Autowired
	private IRegistrationRepository iRegistrationRepository;

	
	/*Employee Registration Validation*/
	
	@Override
	public String EmployeeRegistration(Registration registration) throws RegistrationException {

		if (iRegistrationRepository.existsById(registration.getEmail())) {
			throw new RegistrationException("Email already Exist");
		}
		if (!(registration.getEmail().matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"))) {
			throw new RegistrationException("Give valid Email");
		}
		if (!(registration.getPassword().matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$"))) {
			throw new RegistrationException("Give valid password");

		}

		iRegistrationRepository.save(registration);
		return "Registration Successful";
	}
	
	
}
