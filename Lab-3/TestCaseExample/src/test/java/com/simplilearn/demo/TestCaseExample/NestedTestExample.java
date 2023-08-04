package com.simplilearn.demo.TestCaseExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedTestExample {

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
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	void test() {
		System.out.println("test case of outer class");
		
	}
	@Nested
	class Inner {
		
		@BeforeEach
		void setUp() throws Exception {
			System.out.println("Before each");
		}

		@AfterEach
		void tearDown() throws Exception {
			System.out.println("After Each");
		}

		@Test
		@DisplayName("Test of inner class")
		void test() {
			System.out.println("test case of inner class");
			
		}
		
		@Nested
		class WhenX{
			
			@BeforeEach
			void setUp() throws Exception {
				System.out.println("Before Each");
			}

			@AfterEach
			void tearDown() throws Exception {
				System.out.println("After Each");
			}

			@Test
			@DisplayName("Test of inner class")
			void test() {
				System.out.println("test case of WhenX class");
				
			}
			
		}
		
		
	}
}
