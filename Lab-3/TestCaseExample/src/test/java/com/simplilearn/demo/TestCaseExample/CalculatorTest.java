package com.simplilearn.demo.TestCaseExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator cal;

	 

	@BeforeEach
	void setUp() throws Exception {
		cal=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		cal=null;
	}

	@Test
	void addTest() {
		
		
		assertEquals(5, cal.add(2, 3));
		
	}
	
	@Test
	void subTest() {
		
	
		assertEquals(2, cal.sub(5, 3));
		assertNotEquals(2, cal.sub(6, 3));
		
	}
	

	@Test
	void multiplyTest() {
		
		 
		assertEquals(6, cal.multiply(2, 3));
		
	}
	
	@Test
	void divideTest() {
		
		 
		assertEquals(2, cal.divide(6, 3));
		
	}
	

}
