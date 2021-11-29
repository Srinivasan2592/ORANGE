package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Orange_HRM.Baseclass;

public class Logindetailss extends Baseclass {

	public Logindetailss() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement loginbutton;
	
	@FindBy(id = "username_show")
	private WebElement loginVerify;
	
	@FindBy(linkText = "Logout")
	private WebElement logout;
	
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public  WebElement getLoginverify() {
		return loginVerify;
	}
	public  WebElement getLogout() {
		return logout;
	}
}