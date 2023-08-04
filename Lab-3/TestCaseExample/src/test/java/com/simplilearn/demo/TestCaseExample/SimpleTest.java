package com.simplilearn.demo.TestCaseExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All ");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	void test() {
		System.out.println("Test 1");
	}
	
	@Test
	void test1() {
		System.out.println("Test 2");
	}
	
	@Test
	void test3() {
		System.out.println("Test 3");
	}

}
