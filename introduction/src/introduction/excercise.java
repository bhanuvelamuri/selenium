package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//*[@id=\'terms-link\']")).click();
		System.out.println("before switching");
		System.out.println(driver.getTitle());
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid= it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println("after switching");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div[2]/div[1]/div/a")).click();
		driver.close();
		Set<String>ids1=driver.getWindowHandles();
		Iterator<String> it1=ids1.iterator();
		String parentid1= it1.next();
		String childid1 = it1.next();
		driver.switchTo().window(childid1);
		System.out.println("switching from child to child 1");
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println("switch to parent");
		System.out.println(driver.getTitle());
		
		

	}

}
