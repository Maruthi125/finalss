package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

public class LandingPage {
	
	WebDriver driver;
	
	
	public LandingPage(	WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	WebElement myaccountDropdown;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement loginbutton;
	

	
	public WebElement myaccountDropdown() {
		
		return myaccountDropdown;
	
}
	
	
public WebElement loginbutton() {
		
		return loginbutton;
	




	
}
}
