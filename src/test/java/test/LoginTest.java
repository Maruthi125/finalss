package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjects.AccountPage;
import Pageobjects.LandingPage;
import Pageobjects.LoginPage;
import resources.Base;

public class LoginTest extends Base {
	WebDriver driver;

	@Test(dataProvider = "getLoginData")
	public void login(String email, String password, String expectedStatus) throws IOException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

		LandingPage LandingPage = new LandingPage(driver);
		LandingPage.myaccountDropdown().click();
		LandingPage.loginbutton().click();

		LoginPage LoginPage = new LoginPage(driver);

		LoginPage.Email().sendKeys(email);

		LoginPage.password().sendKeys(password);

		LoginPage.clicklogin().click();

		AccountPage AccountPage = new AccountPage(driver);

		System.out.println(AccountPage.editAccountInformaton().isDisplayed());

	}

	@AfterMethod
	public void closure() {
		driver.close();

	}

	@DataProvider
	public Object[][] getLoginData() {

		Object[][] data = { { "987@gmail.com", "12345", "success" }, { "dummy@test.com", "12345", "failure" } };

		return data;
	}

}
