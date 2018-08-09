package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotcaptcha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.google.com/recaptcha/api2/demo");
		int number=switchtoFrame(driver,By.xpath("//*[@id=\'recaptcha-anchor\']/div[5]"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath("//*[@id=\'recaptcha-anchor\']/div[5]")).click();
		driver.switchTo().defaultContent();
		
		int number1=switchtoFrame(driver,By.xpath("//*[@id='recaptcha-verify-button']]"));
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();
		

	}
	public static int switchtoFrame(WebDriver driver, By by)
	{
		int i;
		int f=driver.findElements(By.tagName("iframe")).size();
		for(i=0; i<f; i++)
		{
			driver.switchTo().frame(i);
			int count= driver.findElements(By.xpath("//*[@id=\'recaptcha-anchor\']/div[5]")).size();
			if(count>0)
			{
				//driver.findElement(By.xpath("//*[@id=\'recaptcha-anchor\']/div[5]")).click();
				break;
			}
			else
			{
				System.out.println("continue looping");
			}
			
		}
		driver.switchTo().defaultContent();
		return i;
	}

}
