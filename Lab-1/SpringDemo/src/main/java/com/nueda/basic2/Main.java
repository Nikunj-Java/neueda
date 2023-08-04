package com.nueda.basic2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.nueda.basic2")
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		GreetingBot greeter = context.getBean(GreetingBot.class);
		greeter.print();
		
	}
}
