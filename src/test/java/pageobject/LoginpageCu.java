package pageobject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageCu {
	@FindBy(id = "txtUsername")
	@CacheLookup
	WebElement textbox_username;
	
	@FindBy(id = "txtPassword")
	@CacheLookup
	WebElement textbox_Password;
	
	@FindBy(id = "btnLogin")
	@CacheLookup
	WebElement button_login;
	
	public LoginpageCu(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void verifyLogin(String username, String upassword) {
		textbox_username.sendKeys(username);
		textbox_Password.sendKeys(upassword);
		button_login.click();
	}

}
