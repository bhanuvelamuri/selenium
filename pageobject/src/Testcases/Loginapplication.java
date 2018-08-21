package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objrepo.RediffLoginPage;
import objrepo.RediffLoginPagepf;
import objrepo.Rediffhomepage;

public class Loginapplication {
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd = new RediffLoginPage(driver);
		RediffLoginPagepf rp = new RediffLoginPagepf(driver);
		Rediffhomepage rh = new Rediffhomepage(driver);
		rp.emaid().sendKeys("bhanu");
		rp.password().sendKeys("password");
		rp.home().click();
		rh.search().click();
		rh.searchkey().sendKeys("modi");
		rh.submit().click();

	}

}
