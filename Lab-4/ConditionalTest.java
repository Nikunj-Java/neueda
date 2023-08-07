package com.neueda.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class ConditionalTest {

	
	@Test
	@EnabledOnOs({OS.WINDOWS})
	public void runOnWindows() {
		System.out.println("This is Running on Windows");
	}
	
	
	@Test
	@DisabledOnOs({OS.MAC})
	public void donotrunOnMAC() {
		System.out.println("This is not Running on MAC");
	}
	
	 
	@Test
	@EnabledOnOs({OS.MAC})
	public void runOnMAC() {
		System.out.println("This is Running on MAC");
	}
	 
	@Test
	@EnabledOnOs({OS.LINUX})
	public void runOnLINUX() {
		System.out.println("This is Running on LINUX");
	}

	
	
}
