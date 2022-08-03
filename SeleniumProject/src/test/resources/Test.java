import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test {

	public static void main(String[] args) {
		String str = "programming"; //gnimmargorp
		String reverse = "";
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			reverse = c+reverse;
		}

		System.out.println(reverse);
		
		List<WebElement> row = driver.findElements(By.xpath("//table"));
		
		for(WebElement e: row) {
			List<WebElement> column = e.findElements(By.tagName("td"));
			for(WebElement c: column) {
				System.out.println(c.getText());
			}
		}
	}

}
