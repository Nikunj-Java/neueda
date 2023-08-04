package com.simplilearn.demo.TestCaseExample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;


@DisplayName("Conditional Test")
class ConditionalTestCaseExample {

	
	@Test
	@EnabledOnOs({OS.WINDOWS})
	void test() {
		System.out.println("Conditional Test on windows");
	}

	@Test
	@EnabledOnOs({OS.LINUX})
	void test1() {
		System.out.println("Conditional Test on linux");
	}
	
	@Test
	@EnabledOnOs({OS.MAC})
	void test2() {
		System.out.println("Conditional Test on mac");
	}
}
