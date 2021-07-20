package appleTestCases;




import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mongodb.MapReduceCommand.OutputType;

import TestPages.CartPage;
import TestPages.LoginPage;
import TestPages.ProductPage;
import TestPages.SearchPage;
import applebase.TestBase;

public class TestCase extends TestBase {
	LoginPage loginpage;
	ProductPage productpage;
	SearchPage searchpage;
	 CartPage cartpage;
	

	public TestCase()
	{
		super();
		
	}
	@BeforeMethod
	public void SetUp() {
		Initialisation();
		loginpage=new LoginPage();
		productpage=new ProductPage();
		 searchpage = new SearchPage();
		  cartpage=new CartPage();
		
		loginpage.login();
	}
	@AfterMethod
	public void TearDown()
	{
	driver.quit();
	}
	@Test(priority=1,enabled=true)
		public void LoginTest() {
	 System.out.println("login successful");
	}
	@Test(priority=2,enabled=true)
	public void navigateToPage()
	{
		searchpage.clickSearchBox();
		
	}
	@Test(priority=3)
	public void chooseProduct() {
		searchpage.clickSearchBox();
		
		productpage.select();
		productpage.clickOnCheckbox();
		productpage.clickOnPrice();
		productpage.choose();
		cartpage.viewcart();
		
		
	}
	
	
	}
	




