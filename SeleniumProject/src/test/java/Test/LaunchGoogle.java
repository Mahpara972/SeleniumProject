package Test;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LaunchGoogle {
	
	
	
	@Test
	void launchUrl() {
		System.setProperty("webdriver.chrome.driver",
			      "C:\\Users\\gauta\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/?client=safari&channel=iphone_bm");
		driver.findElement(By.name("q")).sendKeys("Naveen");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("btnK")).click();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions)
		
		Actions act = new Actions(driver);
	//	act.moveToElement(null, 0, 0)
		Set<String> s = driver.getWindowHandles();
		
	}

}
