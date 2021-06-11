package com.cg.loginRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.loginRegistration.entities.User;
import com.cg.loginRegistration.exception.UserException;
import com.cg.loginRegistration.service.UserServiceImpl;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;
	
	//UserLogin
	@PostMapping("/UserLogin")
	public ResponseEntity<String> UserLogin(@RequestBody User user) throws UserException {
		String str = userServiceImpl.UserLogin(user);
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}
	
	//AdminLogin
	@PostMapping("/AdminLogin")
	public ResponseEntity<String> AdminLogin(@RequestBody User user) throws UserException {
		String str = userServiceImpl.AdminLogin(user);
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}

	/*//UserLogout
	@DeleteMapping("/UserLogout")
	public ResponseEntity<String> UserLogout(@RequestBody User user ) throws UserException {
		String string = userServiceImpl.UserLogout(user);
		return new ResponseEntity<String>(string, HttpStatus.OK);
	}*/
	
	//UserLogout
		@DeleteMapping("/UserLogout/{userId}")
		public ResponseEntity<String> UserLogout(@PathVariable String userId) throws UserException {
			String string = userServiceImpl.UserLogout(userId);
			return new ResponseEntity<String>(string, HttpStatus.OK);
		}
	
	//AdminLogout
	@DeleteMapping("/AdminLogout")
	public ResponseEntity<String> AdminLogout(@RequestBody User user) throws UserException {
		String string = userServiceImpl.AdminLogout(user);
		return new ResponseEntity<String>(string, HttpStatus.OK);
	}

}
