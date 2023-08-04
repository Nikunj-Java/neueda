package com.simplilearn.demo.TestCaseExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestCaseExample {

	private Calculator calc=null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		
		System.out.println("Before Each");
		
		calc =new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
		calc =null;
	}

	@Test
	@DisplayName("Add Operation Test")
	@RepeatedTest(value=5,name="Testcase: {displayName} the currentCount is"
			+ "{currentRepetition} out of {totalRepetition}")
	
	void AddMethod() {
		
		assertEquals(8, calc.add(6, 2),"6+2 should equals to 8");
		
		System.out.println("========test passed==========");
	}

}
