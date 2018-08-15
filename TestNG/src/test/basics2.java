package test;

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
	

}
