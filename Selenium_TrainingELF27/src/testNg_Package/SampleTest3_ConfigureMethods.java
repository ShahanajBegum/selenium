package testNg_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest3_ConfigureMethods {
	@Test
	public void Test1() {
		System.out.println("Test-1");
	}
	@BeforeSuite
	public void Before_Suite() {
		System.out.println("Before_suite");
	}
	@AfterSuite
	public void After_Suite() {
		System.out.println("after_suite");
	}
	@BeforeTest
	public void before_Test() {
		System.out.println("Before_test");
	}
	@AfterTest
	public void after_Test() {
		System.out.println("after_test");
	}
	@BeforeClass
	public void before_class() {
		System.out.println("Before_class");
	}
	@AfterClass
	public void after_Class() {
		System.out.println("after_class");
	}
	@BeforeMethod
	public void before_Method() {
		System.out.println("Before_method");
	}
	@AfterMethod
	public void after_Method() {
		System.out.println("after_method");
	}
	
	
	

}
