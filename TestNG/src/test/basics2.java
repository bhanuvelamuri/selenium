package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class basics2 {
	@Test(enabled=false)
	public void day() {
		System.out.println("good");
		
	}
	@Test(groups= {"Smoke"})
	public void day1() {
		System.out.println("bad");
		
	}
	@Parameters({"URL"})
	@Test
	public void day2(String personalloan) {
		System.out.println("personalloan.com");
		
	}
}
	


