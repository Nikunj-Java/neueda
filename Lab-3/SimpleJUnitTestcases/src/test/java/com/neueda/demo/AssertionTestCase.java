package com.neueda.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AssertionTestCase {

	public boolean checkAge(int age) {
		
		return age>=18;
	}
	 
	@Test
	 public void testAssertion1() {
		
		 assertTrue(checkAge(20));
	 }
	
	@Test
	public void testAssertion2() {
		assertEquals(6, 4+2); 
	}
	@Test
	public void testAssertion3() {
		assertNotEquals(10, 9);
	}
	
	@Test
	public void testAssertion4() {
		int a=65;
		int b=89;
		assertTrue(b>a);
	}
	
	@Test
	public void testAssertion5() {
		int a=65;
		int b=89;
		assertFalse(b<a); //89<65
	}
	@Test
	public void testAssertion6() {
		String name=null;
		assertNull(name);
	}
	
	@Test
	public void testAssertion7() {
		String name1="Nikunj Soni";
		assertNotNull(name1);
	}

}
