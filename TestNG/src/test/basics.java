package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basics {
	@BeforeClass
	public void beforeclass() {
		// TODO Auto-generated method stub
		System.out.println("Before class");
	}
	@AfterClass
	public void afterclass() {
		// TODO Auto-generated method stub
		System.out.println("after class");
	}
	@BeforeMethod
	public void prerequisitebeforemethod() {
		System.out.println("before passing method");
		
	}
	@AfterMethod
	public void prerequisiteaftermethod() {
		System.out.println("after passing method");
		
	}

	@Test(groups= {"Smoke"})
	public void Demo() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}
	@Test
	public void Demo1() {
		// TODO Auto-generated method stub
		System.out.println(" world");
	}
	
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("before testing");
	}
	@AfterTest
	public void postrequisite() {
		System.out.println("after testing");
	}
}
