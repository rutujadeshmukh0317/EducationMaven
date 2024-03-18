package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base 
{
	
	public WebDriver OpenCromeBrowser()
	{
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rutuja\\Downloads\\chromedriver_win32");
	  
WebDriver driver=	new  ChromeDriver();
return driver;

	
	
	}
	
	public WebDriver OpenFirefoxBrowser()
	{
		WebDriver driver=	new  FirefoxDriver();
		return driver;
		
	}
	
}