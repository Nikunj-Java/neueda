package com.neueda.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calc;
	
	@BeforeEach
	public void setup() {
		calc= new Calculator();
		System.out.println("Calculator Initiated....!!");
		
	}
	@Test
	public void addTest() {
		assertEquals(7, calc.add(4, 3));
		assertNotEquals(7, calc.add(5, 3));
	}
	
	@Test
	public void multiplyTest() {
		assertEquals(12, calc.mult(4, 3));
		 
	}
	@Test
	public void divisionTest() {
		assertEquals(5, calc.divide(10, 2));
		 
	}
	@Test
	public void subTest() {
		assertEquals(5, calc.sub(10, 5));
		 
	}
	
	@AfterEach
	public void tearDown() {
		calc=null;
		System.out.println("Calculator Terminated....!!");
	}

}
