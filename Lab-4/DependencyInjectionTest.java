package com.neueda.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class DependencyInjectionTest {

	public DependencyInjectionTest(TestInfo info) {
		System.out.println("Value:"+info.getDisplayName());
	}
	
	@Test
	@DisplayName("My Method")
	public void myTest(TestInfo info) {
		System.out.println("Name of Test 1:"+info.getDisplayName());
		assertEquals("My Method", info.getDisplayName());
		assertNotEquals("My Method 1234", info.getDisplayName());
		assertNotNull(info.getDisplayName());
	}
	
	@Test
	@DisplayName("MyTag Test")
	@Tag("my_Tag")
	public void TagTest(TestInfo info) {
		System.out.println("Name of Test 2:"+info.getDisplayName());
		System.out.println(info.getTags().contains("my_Tag"));
		
		assertEquals("MyTag Test", info.getDisplayName());
		assertNotEquals("my_tag", info.getDisplayName());
		assertTrue(info.getTags().contains("my_Tag"));
		
	}
	
	
	

}
