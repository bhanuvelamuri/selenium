package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());//1. LINKS COUNT OF WHOLE WEBSITE
		WebElement d= driver.findElement(By.id("gf-BIG"));
		System.out.println(d.findElements(By.tagName("a")).size());//2. LINKS COUNT OF FOOTER 
		d.findElement(By.xpath("//tr//td[1]//ul[1]"));
		WebElement c= d.findElement(By.xpath("//tr//td[1]//ul[1]"));//3. CHECKING IN COLUMN
		System.out.println(c.findElements(By.tagName("a")).size());
		
		
		
	}

}
