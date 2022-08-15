package DemoQaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import util.Common;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(){
	
	 driver = Common.driver;
	}
	
	String loginButtonXpath ="//*[contains(text(),'Sign in')]";
	String emailIdField ="//input[@id='email_create']";
	String emailIdFieldAlreadyRegister ="//input[@id='email']";
	String submitButton ="//button[@id='SubmitCreate']";
	String signInButton ="//button[@id='SubmitLogin']";
	String createAnAccountForm ="//*[@id='account-creation_form']";
	String erroMessage ="//*[@id='create_account_error']/ol/li";
	String errorMessaageAlreadyRegister ="//div[@id='center_column']//child::li";
	Common common = new Common();
	
	public void clickLoginButton() throws InterruptedException {
		Thread.sleep(1000);
		common.waitTillElementVisible(driver.findElement(By.xpath(loginButtonXpath)));
		
		driver.findElement(By.xpath(loginButtonXpath)).click();
	}
	
	
	public void enterEmailIdForCreateAccount(String emailId) {
		driver.findElement(By.xpath(emailIdField)).sendKeys(emailId);
	}
	
	public void enterEmailIdForAlreadyRegister(String emailId) {
		driver.findElement(By.xpath(emailIdFieldAlreadyRegister)).sendKeys(emailId);
	}
	
	
	public void clickCreateAnAccountButton() {
		driver.findElement(By.xpath(submitButton)).click();;
	}
	
	public void clickSignIntButton() {
		driver.findElement(By.xpath(signInButton)).click();;
	}


	public void verifyCreateAnAccountFormDisplayed() {
		
		if(driver.findElements(By.xpath(createAnAccountForm)).size()>0) {
			Assert.assertTrue(true,"Create an account form is dispayed");
		}
		else {
			Assert.assertTrue(false,"Create an account form is not dispayed");
		}
		
		}


	public void verifyErrorMessage(String expctedErrorMessage) {
		String actualErrorMessage =driver.findElement(By.xpath(erroMessage)).getText();
		Assert.assertTrue(expctedErrorMessage.trim().equals(actualErrorMessage.trim()),"Error message is not correct");
		
		
	}
	
	public void verifyAlreadyRegisterError(String expectedError) {
		String actualErrorMessage =driver.findElement(By.xpath(errorMessaageAlreadyRegister)).getText();
		Assert.assertTrue(expectedError.trim().equals(actualErrorMessage.trim()),"Error message is not correct");
	}

}
