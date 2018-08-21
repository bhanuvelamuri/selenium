package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objrepo.RediffLoginPage;
import objrepo.Rediffhomepage;

public class Loginapplication {
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd = new RediffLoginPage(driver);
		Rediffhomepage rh = new Rediffhomepage(driver);
		rd.emaid().sendKeys("bhanu");
		rd.password().sendKeys("password");
		rd.home().click();
		rh.search().click();
		rh.searchkey().sendKeys("modi");
		rh.submit().click();;

	}

}
