package com.nueda.basic1;

import org.springframework.stereotype.Component;

//Bean created
@Component
public class HelloWorld {

    public void print() {
        System.out.println("Hello, World!");
    }
}
