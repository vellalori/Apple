package TestPages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applebase.TestBase;

public class ProductPage extends TestBase {
	@FindBy(xpath="//body/div[@id='a-page']/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[6]/span[1]/a[1]/span[1]")
	WebElement laptops;
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[5]")
	WebElement checkBox;
	@FindBy(xpath="//span[contains(text(),'Over ₹50,000')]")
	WebElement price;
	@FindBy(xpath="//span[contains(text(),'2020 Apple MacBook Air (13-inch, Apple M1 chip wit')]")
	WebElement chooseProduct;
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addtocart;
	public ProductPage()
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnCheckbox()
	{
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);",checkBox);
		Actions action=new Actions(driver);
		action.moveToElement(checkBox);
		checkBox.click();
	}
	public void clickOnPrice() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",price);
		price.click();
	}
	public void choose()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",chooseProduct);
		chooseProduct.click();
		Set<String> handler=driver.getWindowHandles();
		Iterator<String>it=handler.iterator();
		String parentWindowId=it.next();
		System.out.println("parentid"+parentWindowId);
		String childWindowId=it.next();
		driver.switchTo().window(childWindowId);
		js.executeScript("arguments[0].scrollIntoView(true);",addtocart);
		
		addtocart.click();
		System.out.println("product added");
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());}
		
		public void select()
		{	JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",laptops);
			
			laptops.click();

	}
}



