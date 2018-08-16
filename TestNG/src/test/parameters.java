package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class parameters {
private static final boolean False = false;
@Test
@Parameters({"URL","APIKey/usrname"})
public void WebsiteCarLoan(String urlname, String key) 
{
	//selenium
	System.out.println(urlname);
	System.out.println(key);
}
@Test(dataProvider="getData")
public void users(String username,String password)
{
	//selenium
	System.out.println("printing data");

	System.out.println(username);

	System.out.println(password);
	
}
@DataProvider
public Object[][] getData() {
	//list combination-username password - good credit history
	//user name and password - no credit history
	//bad credit history
	Object[][] data = new Object[3][2];
	data[0][0]="first username";//first row first column
	data[0][1]="password";//first row second column
	data[1][0]="second username";//second row first column
	data[1][1]="password";//second row second column
	data[2][0]="third username";//third row first column
	data[2][1]="password";//third row second column
	return data;
	
}
@Test
public void users1() {
	System.out.println("fail case");
	Assert.assertTrue(False);
}

}
 