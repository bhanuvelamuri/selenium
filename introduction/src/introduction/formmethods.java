package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class formmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://makemytrip.com");
		/*System.out.println("before clicking");
		System.out.println(driver.findElement(By.xpath("//*[@id=\'hp-widget__return\']")).isDisplayed());
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/section/div[1]/div/div[3]/label")).click();
		System.out.println("after clicking");
		System.out.println(driver.findElement(By.xpath("//*[@id=\'hp-widget__return\']")).isDisplayed());
		int count=driver.findElements(By.xpath("//*[@id=\'hp-widget__]return\']")).size();
		if(count== 0)
		{
			System.out.println("none is present");
			
		}
		else  
		{
			System.out.println("false condition");
		}*/
		System.out.println(driver.findElement(By.xpath("//*[@id=\'deals_live_deals\']")).getText());
		driver.quit();
		
		
	}

}
