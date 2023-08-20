package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver driver;
	
	
	public  LoginPage(	WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(id="input-email")
	WebElement Email;
	
	@FindBy(id="input-password")
	WebElement password;

	
	@FindBy(xpath="//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	WebElement clicklogin;



	
	public WebElement Email() {
		
		return Email;
	
}
	
	
public WebElement password() {
		
		return password;
	
	}

public WebElement clicklogin() {
	
	return clicklogin;

	
}

}
