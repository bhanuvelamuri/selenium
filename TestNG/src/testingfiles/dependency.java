package testingfiles;

import java.io.IOException;

import org.testng.annotations.Test;

public class dependency extends Testbase{
	@Test
	public void OpeningBrowser() throws IOException {
		Login();
		System.out.println("opening browser");
	}
	

}
