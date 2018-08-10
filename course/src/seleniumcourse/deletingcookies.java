package seleniumcourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;


public class deletingcookies {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // for deleting all cookies
		//driver.manage().deleteCookieNamed("asdf"); for particular cookie
		//driver.manage().deleteCookie("sesion key");// deleting session cookie
		//click on any link it should redirect to login page
		driver.get("http://google.com");
		File src=    ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\bhanu\\screenshot.png"));
		
	}

}
