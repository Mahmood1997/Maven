package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Demo extends TestBase {

	WebDriver driver;
	
	@FindBy(xpath = "//h2[text()='Mortgage Calculator']")
	WebElement Title;
	
	public Demo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle()
	{
		return Title.getText().trim();
	}
	
	
}
