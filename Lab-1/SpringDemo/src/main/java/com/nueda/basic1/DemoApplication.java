package com.nueda.basic1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nueda.basic1")
public class DemoApplication {

    public static void main(String[] args) {
        // Load the Spring context using the AppConfig class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class);

        // Retrieve the HelloWorld bean from the context
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        
        HelloWorld helloWorld1 = context.getBean(HelloWorld.class);
        
        System.out.println(helloWorld==helloWorld1);

        // Use the HelloWorld object to call the print method
        helloWorld.print();
        
        String message = context.getBean("greeting", String.class);
        System.out.println(message);

        // Close the context
        context.close();
    }
    
    @Bean
    public String greeting() {
        return "Good Morning...!!!";
    }
    
}
