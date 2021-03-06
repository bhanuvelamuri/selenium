package seleniumcourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA_US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.xpath("//*[@id='H-destination']")).sendKeys("nyc");
		driver.findElement(By.xpath("//*[@id='H-destination']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//*[@id='H-fromDate']")).sendKeys(Keys.ENTER);
		WebDriverWait d= new WebDriverWait(driver, 5);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@target='18469']")));
		System.out.println(d.until(ExpectedConditions.titleContains("All Airports (NYC) Hotel Search Results | Alaska Air Trips")));
		driver.findElement(By.xpath("//*[@target='18469']")).click();
		
	}

}
