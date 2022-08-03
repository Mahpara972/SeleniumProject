package Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgTutorial {
	
	
	
	@Test(description="verify test", groups="regression", dataProvider ="dataProviderName")
	
	void verifyTest(String val) throws InterruptedException {
		//System.out.println(c);
		System.out.print(val);
		//System.out.println(d);
		//Assert.assertTrue(false);
		System.out.println("test");
		
		
	}
	
	@Test(description="verify test", enabled=true,groups ="smoke")
	void verifyTest1() {
		System.out.println("test1");
		
		
	}
	
	@DataProvider(name="dataProviderName")
		public Object[][] dataProviderMethod(){
			return new Object[][] {{"firstValue"},{"secondValue"}};
		}
	}
	
	


