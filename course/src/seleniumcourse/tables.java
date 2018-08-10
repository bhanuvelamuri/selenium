package seleniumcourse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class tables {

	public static void main(String[] args) {
		int sum=0;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/19731/warks-vs-notts-north-group-t20-blast-2018");
		WebElement table = driver.findElement(By.xpath("//div[@class='cb-col cb-scrcrd-status cb-col-100 cb-text-complete ng-scope']"));
		int rowcount= table.findElements(By.xpath("//div[@id='innings_1']")).size();
		int count= table.findElements(By.xpath("//div[@id='innings_1']//div[1]//div[@class='cb-col cb-col-8 text-right text-bold']")).size();
		for(int i=1; i<count; i++)
		{
			
			String value=table.findElements(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-8 text-right text-bold']")).get(i).getText();
			System.out.println("runs of persons"+i);
			System.out.println(table.findElements(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-8 text-right text-bold']")).get(i).getText());
			int value1=Integer.parseInt(value);
			sum=sum+value1;
		}
			System.out.println(sum);
			//return sum;
		int total;
		String s=table.findElement(By.xpath("//div[@class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText();
		int s1=Integer.parseInt(s);
		total=sum + s1;
		System.out.println("extra runs");
		System.out.println(table.findElement(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText());
		System.out.println("adding all the value");
		System.out.println(total);
		System.out.println("Total value");
		System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		String total1=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int actualtotal = Integer.parseInt(total1);
		if(actualtotal== total){
			System.out.println("count matches");
		}		
		else
		{
			System.out.println("count failed");
		}	
		driver.close();
		}
	
		
}