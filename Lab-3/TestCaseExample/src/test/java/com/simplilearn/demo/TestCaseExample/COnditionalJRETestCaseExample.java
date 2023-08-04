package com.simplilearn.demo.TestCaseExample;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

class COnditionalJRETestCaseExample {

	@Test
	@EnabledOnJre(JRE.JAVA_8)
	void test() {
		System.out.println("This runs only on JRE 8");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_11)
	void test1() {
		System.out.println("This runs only on JRE 11");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_17)
	void test2() {
		System.out.println("This runs only on JRE 17");
	}
	
	

	@Test
	@EnabledIfSystemProperty(named= "os.version",matches=".*10.*")
	void runOnlyWindows10() {
		System.out.println("Windows 10 version");
	}
	

	@Test
	@EnabledIf("myCondition")
	void condition() {
		System.out.println("Execute test is returns true");
	}
	
	@Test
	@DisabledIf("myCondition")
	void condition1() {
		System.out.println("Execute test is returns false");
	}
	
	boolean myCondition() {
		return true;
	}
	
	
	 

}
