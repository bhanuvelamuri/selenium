package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code
		//create driver object for chrome browser
		// we will strictly implement meathods of webdriver
	/*	Class name= ChromeDriver,
				X driver=new X();*/
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		
		/*driver.get("http://google.com");
		System.out.println(driver.getTitle()); //validate title
		System.out.println(driver.getCurrentUrl()); //validate url
		System.out.println(driver.getPageSource());
		driver.get("http://iandrios.blogspot.ca");
		driver.navigate().back();//back to google
		driver.navigate().forward();//forward to website
		driver.close();//close the driver
		//driver.quit();//closes all browsers opend by selenium*/
		/*driver.get("http://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("bhanu1406");
		//driver.findElement(By.name("pass")).sendKeys("Bhanu_8686");
		//every object may not have ID, classname or name.xpath and css prefferred
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		*/
		
		
	}

}
