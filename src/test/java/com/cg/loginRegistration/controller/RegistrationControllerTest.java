package com.cg.loginRegistration.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.cg.loginRegistration.entities.Registration;
import com.cg.loginRegistration.service.RegistrationServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(RegistrationController.class)
class RegistrationControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private RegistrationServiceImpl registrationserviceImpl;
	
	/*Employee Registration Test Case*/
	
	@Test
	void EmployeeRegistrationTest() throws Exception {
		
		Registration reg = new Registration();
		
		reg.setFirstname("jay");
		
		Mockito.when(registrationserviceImpl.EmployeeRegistration(Mockito.any())).thenReturn("str");
		
		mockMvc.perform(post("/api/Registration/EmployeeRegistration")
											.contentType(MediaType.APPLICATION_JSON)
											.content(new ObjectMapper().writeValueAsString(reg)))
				.andExpect(MockMvcResultMatchers.status().isCreated());
	}
	

}
