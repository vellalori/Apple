package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import applebase.TestBase;

public class SearchPage extends TestBase {
	@FindBy(xpath="//select[@id='searchDropdownBox']")
	WebElement searchBox;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement search;
	public SearchPage()
	{
		PageFactory.initElements(driver,this);
	}
	public void  clickSearchBox()
	{
		Select drpdown=new Select(searchBox);
		drpdown.selectByIndex(15);
		search.click();
	}

}
