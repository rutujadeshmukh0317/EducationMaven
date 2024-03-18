package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Education.Login;
import Education.Logout;
import Education.Profile;


public class Test_Profile_Annotation 
{
	WebDriver driver;
	int TestID;
	Login login;
	Profile profile;
	Logout logout;
	
	@BeforeClass
	public void beforeClass()
	{
        driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.khanacademy.org");
		
		driver.manage().window().maximize();
		
	}

	@BeforeMethod
	public void beforeMethod()
	{
		login = new Login(driver);
		login.loginLink();
		login.userName();
		login.PassWord();
		login.loginButton();
			}

	
   
	
	@AfterMethod
	public void AfterMethod()
	{
 logout=new Logout(driver);

logout.ClickOnProfile();
logout.LoginOut();

	}
	
	
	 @Test
		public void To_verify_the_Profile_Page()
		{
	     TestID=0457;
	     
	     System.out.println("Test is Running");
	     
	     profile=new Profile(driver);
	     profile.profile();
	     
	    String url= driver.getCurrentUrl();
	     
	     if(url.equals("https://www.khanacademy.org/profile/me/"))
	     {
	    	 System.out.println("Test case is passed");
	     }
	     else 
	     {
	    	 System.out.println("Test case is failed");
	     }
	}


	@AfterClass
	public void AfterClass()
	{
driver.close();		
	}



}
