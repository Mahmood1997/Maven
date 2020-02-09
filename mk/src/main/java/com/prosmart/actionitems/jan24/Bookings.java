package com.prosmart.actionitems.jan24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bookings {
	
	WebDriver driver;
	
@BeforeTest
	public void OpenBrowser() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.booking.com/");
	
		
		driver.manage().window().maximize();
		Thread.sleep(100);
		
}
@Test
public void HandF() throws InterruptedException
{
		
driver.findElement(By.xpath("//*[@id='cross-product-bar']/div[1]/a[2]/span[2]")).click();
Thread.sleep(1000);


		String mon = "March 2020";
		String date = "20";
		driver.findElement(By.xpath("//*[@id='frm']/div/div[3]/div[1]")).click();

		while(true)
		{
			String text = driver.findElement(By.xpath("//*[@id='frm']/div/div[3]/div[2]/div/div/div[3]")).getText();
			// text = Mar 2020 but when i open the calander if i dont Mar 2020
			if(text.equals(mon))
			{
				break;
			}
			else
			{
		
					//driver.findElement(By.xpath()
				driver.findElement(By.xpath("//*[@id='frm']/div/div[3]/div[2]/div/div/div[2]/svg")).click();
			}

			List <WebElement> allCallDate = driver.findElements(By.xpath("//*[@id='frm']/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr/td"));

			for(WebElement elem:allCallDate)
			{
				System.out.println(elem.getText());
			}	
		}
	}
}
