package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basics {
	@Test
	public void Demo() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}
	@Test
	public void demo2() {
		System.out.print("bye guru");
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
