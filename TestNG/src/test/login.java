package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class login {
@Test
public void WebLoginhome() {
	//selenium
	System.out.println("WEBLOGIN");
}

@Test(groups= {"Smoke"})
public void WebSigninhome() {
	//selenium
	System.out.println("Signin");
}
@Test
public void WebSignouthome() 
{
	//selenium
	System.out.println("Signout");

}
@Test(groups= {"Smoke"})
public void MobileLogin() {
	//appium
	System.out.println("APPIUM");
}

@Test(dependsOnMethods= {"WebLoginhome","WebSignouthome"})
public void APIRest() {
	//Rest API
	System.out.println("API");
}
@BeforeTest
public void Webprerequisite() {
	//selenium
	System.out.println("before login testing");
}
@BeforeSuite
public void prerequisitebeforesuite()
{
	System.out.println("before suite");
	
	}
@AfterSuite
public void prerequisiteaftersuite()
{
	System.out.println("after suite");
	
	}
	
}

