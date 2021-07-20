package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applebase.TestBase;

public class CartPage extends TestBase {
	
	@FindBy(xpath="//*[@id='nav-cart-count']")
	WebElement cart;

	@FindBy(xpath="//body/div[@id='a-page']/div[4]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement image;
	public CartPage()
	{
		PageFactory.initElements(driver,this);
	}
public boolean viewcart()
{
cart.click();
	boolean b=image.isDisplayed();
	System.out.println("added successfully to cart");
return b;
}

}
