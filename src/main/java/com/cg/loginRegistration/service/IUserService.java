package com.cg.loginRegistration.service;

import com.cg.loginRegistration.entities.User;
import com.cg.loginRegistration.exception.UserException;

public interface IUserService {

	public String UserLogin(User user) throws UserException;
	
	public String AdminLogin(User user) throws UserException;

	//public String UserLogout(User user) throws UserException;
	
	public String UserLogout(String userId) throws UserException;
	
	
	
	public String AdminLogout(User user) throws UserException;
	
	

}
