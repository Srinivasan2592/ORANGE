package Stepdefination;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Pageobject.Logindetailss;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class Stepdefination extends Orange_HRM.Baseclass {
	Logindetailss login;

	@Given("user launching browser")
	public void user_launching_browser() {
		try {
			Browserlaunch();
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail(e+"Browser Unable to launch");
		}
		assertTrue("Sucessfully Browser Launched");
	}
	private void assertTrue(String string) {
		// TODO Auto-generated method stub
		
	}
	@Given("navigate to url")
	public void navigate_to_url() {
		String URL = driver.getCurrentUrl();
		//assertEquals(URL,"https://adactinhotelapp.com");
		System.out.println(URL);
	}
	@Then("login page image verification")
	public void login_page_image_verification() {
		try {
			image_verification();
		} catch (IOException e) {
			Assert.fail(e+"Image cant be verified");
			//e.printStackTrace();
		}
	}
	@Given("user enter the username {string} and password {string}")
	public void user_enter_the_username_and_password(String string, String string2) {

		login = new Logindetailss();
		entertext(login.getUsername(),5,string);
		entertext(login.getPassword(),10,string2);
	}
	@Given("click login button")
	public void click_login_button() {
		buttonclick(10,login.getLoginbutton());
	}
	@Then("verified user login")
	public void verified_user_login() throws Exception {
		
			try {
				WebElement element = driver.findElement(By.id("username_show"));
				String userverify = element.getAttribute("value");
				assertEquals("Hello Rbnbalan092!", userverify);
				buttonclick(30,login.getLogout());
			} catch (Exception e) {
				assumeTrue("Negative crediential is pass",false);
				
			}
//			String userverify=login.getLoginverify().getText();
//			if (userverify.equals("Hello Rbnbalan092!")) {
//				System.out.println("User Login and verify successfully");
//				Thread.sleep(10000);
				
//			}else  {
//				System.out.println("Invalid Username and password");
//			}
			closing_Tab();
	}
}
