package com.nueda.basic2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//use as bean 
@Component
public class GreetingBot {
	
	@Autowired
	private GreetingService service;
	
	//GreetingService service= new GreetingServiceImpl();

	public void print() {
		System.out.println(this.service.greet());
	}
	
	
}
