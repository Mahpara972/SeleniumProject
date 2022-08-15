package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DemoQaPages.LoginPage;
import util.Common;



public class VerifyLoginPage {
	WebDriver driver = null;
	Common common = new Common();
	
	@BeforeMethod
	void beforeMethod() throws IOException {
		driver= common.getDriver();
		driver.get(Common.url);
	}

	@Test
	public void verifyCreateAnAccountWithValidEmailId() throws InterruptedException {
	
		LoginPage loginPage =new LoginPage();
		
		loginPage.clickLoginButton();
		loginPage.enterEmailIdForCreateAccount("naveen11234@gmail.com");
		loginPage.clickCreateAnAccountButton();
		loginPage.verifyCreateAnAccountFormDisplayed();
		
		
		Thread.sleep(1000);
		
		
		
	}
	
	@Test
	public void verifyErrorCreateAnAccountWithValidEmailIdAlreadyExist() throws InterruptedException {
		
		LoginPage loginPage =new LoginPage();
		loginPage.clickLoginButton();
		loginPage.enterEmailIdForCreateAccount("naveen1@gmail.com");
		loginPage.clickCreateAnAccountButton();
		loginPage.verifyErrorMessage("An account using this email address has already been registered. Please enter a valid password or request a new one. ");
		
		
		Thread.sleep(1000);
		
	}
	
	
	@Test
	public void verifyErrorCreateAnAccountWithInValidEmailIdAlreadyExist() throws InterruptedException {
		
		LoginPage loginPage =new LoginPage();
		loginPage.clickLoginButton();
		loginPage.enterEmailIdForCreateAccount("naveen1gmail.com");
		loginPage.clickCreateAnAccountButton();
		loginPage.verifyErrorMessage("Invalid email address.");
		
		
		Thread.sleep(1000);
		
	}
	
	
	@Test
	public void verifyErrorAlreadyRegisterWithBlankPassword() throws InterruptedException {
		
		LoginPage loginPage =new LoginPage();
		loginPage.clickLoginButton();
		loginPage.enterEmailIdForAlreadyRegister("naveen11234@gmail.com");
		loginPage.clickSignIntButton();
		loginPage.verifyAlreadyRegisterError("Password is required.");
		
		
		Thread.sleep(1000);
		
	}
	
	
	
	@AfterMethod
	void afterMethod() {
		common.quitDriver();
	}
	

}
