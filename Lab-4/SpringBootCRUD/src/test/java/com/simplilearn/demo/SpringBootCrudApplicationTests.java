package com.simplilearn.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.neueda.demo.SpringBootCrudApplication;
import com.neueda.demo.entity.User;
import com.neueda.demo.service.UserService;

@SpringBootTest(classes = SpringBootCrudApplication.class)
class SpringBootCrudApplicationTests {

	
	@Autowired
	private UserService service;
	
	
	@Disabled
	@Test
	@DisplayName("CREATE USER TEST")
	void addUser() {
		
		User u= new User();
		u.setName("Demo User");
		u.setEmail("demo@testmail.com");
		u.setCountry("Singapore");
		u.setPassword("demo@1234");
		u.setLogin(0);
		Assertions.assertNotNull(service.addUser(u));
		
	}
	
	@Test
	@DisplayName("RETRIVE ALL USER TEST")
	void getAllUsers() {
		System.out.println("No.of Users:"+service.getAllUser().size());
		Assertions.assertEquals(5, service.getAllUser().size());
		Assertions.assertNotEquals(3, service.getAllUser().size());
	}
	
	@Test
	@DisplayName("RETRIVE USER TEST-By ID_str")
	void getUserbyIdString() {
		System.out.println(service.getUserById(1).getName());
		Assertions.assertEquals("Nikunj Soni", service.getUserById(1).getName());
	}
	
	@Test
	@DisplayName("RETRIVE USER TEST-By ID_bol")
	void getUserByIdBoolean() {
		boolean val=true;
		Assertions.assertEquals(true, service.getUserById(1).getName().equalsIgnoreCase("Nikunj Soni"));
	}
	
	
	
	@Test
	@DisplayName("UPDATE USER By ID")
	void updateUser() {
		
		User user=  new User();
		user.setName("HENRY NEO");
		user.setEmail("HENERYNEO@GMAIL.COM");
		user.setCountry("INDIA");
		user.setPassword("HelloWorld");
		user.setLogin(1);
		Assertions.assertNotNull(service.updateUser(5, user));
		
	}
	@Test
	@DisplayName("DELETE USER By ID")
	void deletebyId() {
		Assertions.assertTrue(service.deleteUser(6));
		
	}
	
	
	
	 
}
