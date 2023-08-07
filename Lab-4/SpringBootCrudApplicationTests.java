package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.neueda.demo.SpringBootCrudApplication;
import com.neueda.demo.entity.User;
import com.neueda.demo.service.UserService;

@SpringBootTest(classes = SpringBootCrudApplication.class)
class SpringBootCrudApplicationTests {

	
	@Autowired
	private UserService service;
	
	
	//@Disabled
	@Test
	 
	void addUser() {
		
		User u= new User();
		u.setName("Demo User 2");
		u.setEmail("demouser2@testmail.com");
		u.setCountry("Singapore");
		u.setPassword("demouser2@1234");
		u.setLogin(0);
		Assertions.assertNotNull(service.addUser(u));
		
	}
	//@Disabled
	@Test
	 
	void getAllUsers() {
		System.out.println("No.of Users:"+service.getAllUser().size());
		Assertions.assertEquals(5, service.getAllUser().size());
		Assertions.assertNotEquals(3, service.getAllUser().size());
	}
	//@Disabled
	@Test
	 
	void getUserbyIdString() {
		System.out.println(service.getUserById(1).getName());
		Assertions.assertEquals("Nikunj Soni", service.getUserById(1).getName());
	}
	//@Disabled
	@Test
	 
	void getUserByIdBoolean() {
		boolean val=true;
		Assertions.assertEquals(true, service.getUserById(1).getName().equalsIgnoreCase("Nikunj Soni"));
	}
	
	
	//@Disabled
	@Test
	 
	void updateUser() {
		
		User user=  new User();
		user.setName("HENRY NEO");
		user.setEmail("HENERYNEO@GMAIL.COM");
		user.setCountry("INDIA");
		user.setPassword("HelloWorld");
		user.setLogin(1);
		Assertions.assertNotNull(service.updateUser(5, user));
		
	}
	//@Disabled
	@Test
	void deletebyId() {
		Assertions.assertTrue(service.deleteUser(6));
		
	}
	
	 
	@TestFactory
	Collection<DynamicTest> dynamicTestDemo(){
		
		User user= new User();
		 user.setName("TEST2");
		 user.setEmail("TEST2@GMAIL.COM");
		 user.setCountry("UK");
		 user.setPassword("TestMe");
		 
		return Arrays.asList(
				dynamicTest("1. GetById", ()->assertTrue(service.getUserById(1).getName().equalsIgnoreCase("Nikunj Soni"))),
				dynamicTest("2. Delete User by Id", ()->assertFalse(service.deleteUser(7))),
				dynamicTest("3. GetAll", ()->assertEquals(3,service.getAllUser().size())),
				dynamicTest("4. Update User By Id", ()->assertNotNull(service.updateUser(3, user))
				//your own test cases
			)
		);
	}
	 
}
