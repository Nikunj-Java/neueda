package com.neueda.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

class DynamicTestCase {

	@TestFactory
	Collection<DynamicTest> dynamicTestDemo(){
		
		return Arrays.asList(
				dynamicTest("Test 1", ()->assertTrue(12>0)),
				dynamicTest("Test 2", ()->assertFalse(0>1)),
				dynamicTest("Test 3", ()->assertEquals(12, 8+4)),
				dynamicTest("Test 4", ()->assertNull(null))
				
				
				);
	}

}
