package testingfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testbase {
	public WebDriver driver=null;
	@BeforeSuite
	public void Login() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\bhanu\\selenium course\\selenium\\TestNG\\src\\testingfiles\\datadriven.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
		if(prop.getProperty("browser").contains("chrome")) {
		    driver= new ChromeDriver();
		    driver.get(prop.getProperty("url"));
		    //driver.findElement(By.xpath("")).sendKeys(username);
		    driver.close();
	}
		else if(prop.getProperty("browser").contains("firefox")) {
			driver= new FirefoxDriver();
			}
		else
		{
			driver= new InternetExplorerDriver();
			}
		}
	@Test
	public void software() {
		System.out.println("UserName");
	}
	@AfterSuite
	public void uninstallsoftware() {
		System.out.println("UserName");
	
	}
}
