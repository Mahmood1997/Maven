package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BroswerStorage {
 static WebDriver driver;
	public static WebDriver startBrowser(String browsername, String urls)
	{
		if(browsername.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("IE"))
		{
			driver= new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(urls);
		return driver;
	}
	
}
