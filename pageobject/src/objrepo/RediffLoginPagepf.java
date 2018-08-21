package objrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagepf {

		// TODO Auto-generated method stub
		WebDriver driver;
		public RediffLoginPagepf(WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		/*By username = By.xpath("//*[@id=\'login1\']");
		By password = By.xpath("//*[@id=\'password\']");
		By go = By.cssSelector("div.margTop10:nth-child(6) > div:nth-child(1) > input:nth-child(1)");
		By home = By.cssSelector(".head-wrapper > div:nth-child(2) > a:nth-child(1)");
		*/
		@FindBy(xpath="//*[@id=\'login1\']") 
			WebElement username;
		@FindBy(xpath="//*[@id=\'password\']")
			WebElement password;
		@FindBy(css=".head-wrapper > div:nth-child(2) > a:nth-child(1)")
			WebElement home;
		
		@FindBy(css="div.margTop10:nth-child(6) > div:nth-child(1) > input:nth-child(1)")
			WebElement go;
		public WebElement emaid() 
		{
			return username;
		}
		public WebElement password() 
		{
		 return password;	
		}
		public WebElement home()
		{
			return home;
		}
		public WebElement submit()
		{
			return go;
		}


	

}
