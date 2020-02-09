package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class APLogin {
	
	WebDriver driver;
	public APLogin(WebDriver Pdriver)
	{
		this.driver= Pdriver;
	}

	//option 1
	@FindBy(id="email")
	WebElement username;
	//option 2
	@FindBy(how=How.ID,using="passwd")
	WebElement password;

	@FindBy(how=How.XPATH,using="//*[@id='SubmitLogin']/span)")
	WebElement SignIn_button;

	@FindBy(how=How.XPATH,using="//a[@title='Recover your forgotten password']")
	WebElement forgotPassword;
	
	public void login_apsite(String uid, String pass)
	{
		username.sendKeys(uid);
		password.sendKeys(pass);
		SignIn_button.click();
	}
	
	

	

}
