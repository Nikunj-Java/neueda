package com.nueda.basic2;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService{

	public String greet() {
		return "Good Day...!!!";
	}

}
