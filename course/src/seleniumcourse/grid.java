package seleniumcourse;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		//dc.setVersion(IE9);
		//dc.setPlatform(Platform.MAC);
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),dc);
		driver.get("http://google.com");
		
		
	}

}
