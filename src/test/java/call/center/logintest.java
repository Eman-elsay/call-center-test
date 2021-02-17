package call.center;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class logintest extends Testbase {
	WebDriver driver;
	loginpage logobj;
	@Test (priority = 1)
	public void loginuser() throws InterruptedException
	{
		logobj=new loginpage(driver);
		
		logobj.loginform("eman1@eman.com", "Mo.raeed");
	}
}
