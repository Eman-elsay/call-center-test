package call.center;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage extends Pagebase{

	public loginpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"fuse-layout\"]/div/div/div/div/div[1]/div[2]/div/form/div[1]/div/div/div/input")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"fuse-layout\"]/div/div/div/div/div[1]/div[2]/div/form/div[2]/div/div/div/input")
	WebElement pass;
	
	@FindBy(xpath="//*[@id=\"fuse-layout\"]/div/div/div/div/div[1]/div[2]/div/form/button/span[1]")
	WebElement login;
	

	public void loginform( String mail ,String password) throws InterruptedException
	{
		Thread.sleep(2000);
		settxtelmenttxt(email, mail);
		settxtelmenttxt(pass, password);

		clickbtn(login);
	}
}
