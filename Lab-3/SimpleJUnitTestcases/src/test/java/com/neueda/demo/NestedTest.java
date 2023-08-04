package com.neueda.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before ALL");
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
	void testOuter() {
		System.out.println("TestCase From OUTER");
	}
	
	@Nested
	class Inner{
		
		@BeforeEach
		void setUp() throws Exception {
			System.out.println("Before Each");
		}

		@AfterEach
		void tearDown() throws Exception {
			System.out.println("After Each");
		}
		
		@Test
		void testInner() {
			System.out.println("TestCase From INNER");
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
			void testInner() {
				System.out.println("TestCase From WhenX");
			}
		}
		
		
		
		
		
	}
	

}
