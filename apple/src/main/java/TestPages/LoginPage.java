package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applebase.TestBase;

public class LoginPage extends TestBase  {
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement signin;
	@FindBy(id="ap_email")
	WebElement Email_or_phone;
	@FindBy(xpath="//input[@id='continue']")
	WebElement Continue;
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement sign_in;
	//initilaise OR
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	//Actions

	public void login() {
			signin.click();
			Email_or_phone.sendKeys(prop.getProperty("Email_or_phone"));
		Continue.click();
		password.sendKeys(prop.getProperty("password"));
	sign_in.click();
	}
	}

