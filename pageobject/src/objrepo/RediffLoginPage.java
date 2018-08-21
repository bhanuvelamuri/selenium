package objrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

		// TODO Auto-generated method stub
		WebDriver driver;
		public RediffLoginPage(WebDriver driver)
		{
			this.driver= driver;
		}
		By username = By.xpath("//*[@id=\'login1\']");
		By password = By.xpath("//*[@id=\'password\']");
		By go = By.cssSelector("div.margTop10:nth-child(6) > div:nth-child(1) > input:nth-child(1)");
		By home = By.cssSelector(".head-wrapper > div:nth-child(2) > a:nth-child(1)");
		
		public WebElement emaid() 
		{
			return driver.findElement(username);
		}
		public WebElement password() 
		{
		 return driver.findElement(password);	
		}
		public WebElement home()
		{
			return driver.findElement(home);
		}
		public WebElement submit()
		{
			return driver.findElement(go);
		}

	

}
