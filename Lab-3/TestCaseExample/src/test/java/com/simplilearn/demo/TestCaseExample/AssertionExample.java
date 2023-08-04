package com.simplilearn.demo.TestCaseExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AssertionExample {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
		String str =null;
		String str2="Hello World";
		
		String [] a1= {"A", "B"};
		String [] a2= {"A", "B"};
		
		assertTrue(4>0);
		assertFalse(5<1);
		assertNull(str);
		assertNotNull(str2);
		
		assertSame(str, str);
		assertNotSame(str, str2);
		
		assertEquals(5, 5);
		assertNotEquals(str, str2);
		
		
		assertArrayEquals(a1,a2);
		
		assertThrows(RuntimeException.class, () ->{ 
			throw new RuntimeException();
			});
		
		
	}

}
