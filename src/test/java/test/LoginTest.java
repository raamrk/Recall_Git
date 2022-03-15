package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;






public class LoginTest extends BaseTest {
	//WebDriver driver;
	//Loginpage lp = new Loginpage(driver);
	//Products pp= new Products(driver);
	
// By default - priority = 0
	@Test(priority = 0)
	public void VerifyTitle() throws Exception {
		logger = extent.createTest("To verify Page Title ");
		String pgtitle = lp.getAppTitle();
		Assert.assertEquals(pgtitle, "Computers database");
	}

	
	@Test(priority = 1)
	public void DataDriven() throws IOException, Throwable {
		logger = extent.createTest("To verify Product is added");
		Thread.sleep(3000);
		pp.AddCompData();
	}
	
	

}
