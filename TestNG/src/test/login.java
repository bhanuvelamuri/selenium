package test;

import org.testng.annotations.Test;

public class login {
@Test
public void WebLoginhome() {
	//selenium
	System.out.println("WEBLOGIN");
}
@Test
public void WebSigninhome() {
	//selenium
	System.out.println("Signin");
}@Test
public void WebSignouthome() {
	//selenium
	System.out.println("Signout");
}
@Test
public void MobileLogin() {
	//appium
	System.out.println("APPIUM");
}

@Test
public void APIRest() {
	//Rest API
	System.out.println("API");
}
}
