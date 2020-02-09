package com.app.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.app.pages.APLogin;

import Helper.BroswerStorage;

public class VerifyValidLogin {
	
	@Test
	public void CheckUser()
	{
	WebDriver driver = BroswerStorage.startBrowser("chrome", "http://automationpractice.com/index.php?controller=authentication&back=my-account");
	
	APLogin login_page = PageFactory.initElements(driver, APLogin.class);
	
	login_page.login_apsite("testj3913", "abc123");
	}

}
