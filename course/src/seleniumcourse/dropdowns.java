package seleniumcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		/*driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1_CTXT\']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_Unmr']")).isSelected());
		driver.findElement(By.xpath("//*[@id='ctl00nten_mainCot_chk_Unmr']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_Unmr']")).isSelected());*/
		int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
		for(int i=0; i<count; i++)
		{
			String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if(text.equals("Cheese"))
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
		
		
	}

}
