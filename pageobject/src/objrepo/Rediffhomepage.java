package objrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffhomepage {
	WebDriver driver;
	public Rediffhomepage(WebDriver driver)
	{
		this.driver= driver;
	}
	By search = By.xpath("//*[@id=\"srch_show_hide_btn\"]");
	By searchkey = By.xpath("//*[@id=\"srchword\"]");
	By submit = By.cssSelector(".newsrchbtn");
	public WebElement search() 
	{
		return driver.findElement(search);
	}
	public WebElement searchkey() 
	{
		return driver.findElement(searchkey);
	}
	public WebElement submit() 
	{
		return driver.findElement(submit);
	}
	
}
