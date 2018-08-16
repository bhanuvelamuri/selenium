package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {

@Parameters({"URL","APIKey/usrname"})
@Test
public void Website(String carloan, String key) 
{
	//selenium
	System.out.println(carloan);
	System.out.println(key);
}

}
