package Test;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class ElementsTab {
	
	@Test
	void VerifyTextBox() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
			      "C:\\Users\\gauta\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		Thread.sleep(1000);
//		driver.findElement(By.linkText("A/B Testing")).click();
//		String text =driver.findElement(By.xpath("//*[@class='example']/h3")).getText();
//		System.out.println(text);
//		Assert.assertTrue(text.equals("A/B Test Variation 1"));
	
//		Assert fail then test case will terminate

		
//		Verify.verify(text.equals("A/B Test Variation"));
//		Verify fail then test case will not terminate
//		driver.findElement(By.linkText("Add/Remove Elements")).click();;
//		driver.findElement(By.xpath("//button[text()='Add Element']")).click();
//		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		
//		driver.findElement(By.linkText("Checkboxes")).click();
//		
//		driver.findElement(By.xpath("(//*[@id='checkboxes']/input)[1]")).click();
//		Thread.sleep(1000);
		
		//Enter value in text field
		
		
//		driver.findElement(By.linkText("Inputs")).click();
//		
//		driver.findElement(By.xpath("//*[@type='number']")).sendKeys("1");
//		Thread.sleep(1000);
		
		//Select value from drop down
//		driver.findElement(By.linkText("Dropdown")).click();
//		Select s = new Select(driver.findElement(By.id("dropdown")));
//		
//		s.selectByIndex(1);
//		Thread.sleep(1000);
//		s.selectByValue("2");
//		Thread.sleep(1000);
//		s.selectByVisibleText("Option 1");
//		Thread.sleep(1000);
		
		
		//context menu or right click
//		driver.findElement(By.linkText("Context Menu")).click();
//		
//		Actions ac = new Actions(driver);
//		ac.contextClick(driver.findElement(By.id("hot-spot"))).build().perform();
//		Thread.sleep(1000);
		
		//drag and drop 
//		driver.findElement(By.linkText("Drag and Drop")).click();
//		Actions ac = new Actions(driver);
//		Thread.sleep(1000);
//		ac.dragAndDrop(driver.findElement(By.id("column-a")), driver.findElement(By.id("column-b"))).perform();;
//		Thread.sleep(1000);
		
		
		//Switch to frames 
//		driver.findElement(By.linkText("Frames")).click();
//		driver.findElement(By.linkText("iFrame")).click();
//		driver.switchTo().frame("mce_0_ifr");
//		String text=driver.findElement(By.xpath("//*[@id='tinymce']/p")).getText();
//		System.out.println(text);
//		driver.switchTo().defaultContent();
		
		
		//hover the element
//		driver.findElement(By.linkText("Hovers")).click();
//		Actions ac = new Actions(driver);
//		
//		ac.moveToElement(driver.findElement(By.xpath("(//*[@alt='User Avatar'])[1]"))).build().perform();
//		Assert.assertEquals(driver.findElement(By.xpath("(//div[@class='figcaption']/h5)[1]")).getText(), "name: user1");
//		Thread.sleep(1000);
		
		//multiple window
		
//		driver.findElement(By.linkText("Multiple Windows")).click();
//		
//		driver.findElement(By.linkText("Click Here")).click();
//		
//		String currentWindowId=driver.getWindowHandle();
//		Set<String> totalWindow =driver.getWindowHandles();
//		
//		for(String windowId:totalWindow) {
//			System.out.println(windowId);
//			
//			if(!windowId.equals(currentWindowId)) {
//				driver.switchTo().window(windowId);
//				break;
//			}
//			
//		}
//		
//		String newWindowText =driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
//		Assert.assertEquals(newWindowText, "New Window");
		
	//Difference between findelement and findelements
		
		//findelement use for single element but findelements use for multiple element
		//if element not found in dom incase of findelement no such element exception will occur and script will terminate
		//if no element found in dom incase of findelemets the empty list will return and script will not terminate at that place
		
		
		//print all the llinks on the page
//		List<WebElement> element= driver.findElements(By.tagName("a"));
//		
//		for(WebElement el:element ) {
//			System.out.println(el.getText());
//		}
		
		
//		
//		Syncronization
		
//		1.Implicit wait------it will be applicable for all the objects by default
//		2.Explicit wait-----it use if you want to wait for particular object 
//		3.Fluent Wait--------it is same as explicit wait but it check object after some interval time that we call poling time.
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//		driver.findElement(By.linkText("Sortable Data Tables")).click();
//		
//		
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("table"))));
//		driver.findElement(By.xpath("//table[@id='table1']//td[text()='Bach']//following-sibling::td//a[text()='edit']")).click();
//		
//		
//		Wait fwait = new FluentWait(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2));
//		
		
		
		
		
		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
