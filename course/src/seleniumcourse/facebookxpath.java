package seleniumcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://facebook.com");
		/*driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\'loginbutton\']")).click();*/
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("bhanu1406");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Bhanu_8686");
		driver.findElement(By.cssSelector("#loginbutton")).click();
		driver.findElement(By.xpath("")).click();
		/*driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("facebook");
		driver.findElement(By.xpath("//*[@name='btnK']")).click();*/
		driver.close();
	}
}
/* //tagname[@attribute='value']-- for xpath
 tagname[attribute='value']-- for CSS
*/