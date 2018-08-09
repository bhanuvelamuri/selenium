package seleniumcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autodropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://www.ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BEN");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
		
		
			
		
		/*if(int i=0;i<count;i++)
		{
			int count=driver.findElements(By.xpath("//input[@id='fromPlaceName'])")).size();
			
		}*/
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text=(String)js.executeScript(script);
		System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT")) {
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text=(String)js.executeScript(script);
			System.out.println(text);
			if(i>10) {
				break;
			}
			
			
		}
		if(i>10) {
			System.out.println("element not found");
		}
		else {
			System.out.println("element found");
		}
		
		
		
		

	}

}
