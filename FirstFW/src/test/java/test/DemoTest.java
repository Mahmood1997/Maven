package test;

import static org.testng.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import page.Demo;

public class DemoTest extends TestBase{
	
	TestBase testBase;
	WebDriver driver;
	Properties prop;
	Demo demoPage;
	
	
	@BeforeClass
	public void startBrowser()
	{
		testBase = new TestBase();
		testBase.initBrowser();
		demoPage  = new Demo(driver);
	}
	
	@Test(priority=0)
	public void verifyFirstPage()
	{
		String titleHeader = demoPage.getPageTitle();
		assertEquals("Mortgage Calculator", titleHeader);
	}
	
	

}
