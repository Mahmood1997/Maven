package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
WebDriver driver;
	//sign in, contact us, email, password, sign in button
	WebElement signIn = driver.findElement(By.xpath("//a[@class= 'login' ]"));//click
	WebElement contact = driver.findElement(By.xpath("//a[@title= 'Contact Us' ]"));//click
	WebElement email = driver.findElement(By.xpath("//input[@id= 'email' ]"));//sendkeys
	WebElement password = driver.findElement(By.xpath("//input[@name= 'passwd' ]"));//sendkeys
	WebElement signInConfirm = driver.findElement(By.xpath("//button[@id= 'SubmitLogin' ]"));//click
	
	
}
