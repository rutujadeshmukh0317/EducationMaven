package testUtility;

import java.io.IOException;
import java.net.SocketException;

	import org.openqa.selenium.WebDriver;
	import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	import Base.base;
	import Education.Login;
	import Education.Logout;
	import Education.Teacher;
import Utils.Utility;

	public class ValidationClass extends base
	{
		
			WebDriver driver;
			  Login login;
			  Teacher teacher;
			  Logout logout;
			  int testID;

			  @Parameters("browser")
			  
			  @BeforeTest 
			  public void openBrowser(String browsername)
			  {
	       System.out.println(browsername);		
	       
				  if(browsername.equals("Chrome"))
				  {
		 driver = OpenCromeBrowser();
				  
			  }
			  
			  if(browsername.equals("Firefox"))
			  {
				 driver=OpenFirefoxBrowser();
			  
			  }
	driver.manage().window().maximize();
			  
			  driver.get("https://www.khanacademy.org/");
			  
			  }
			  @BeforeClass
			  public void beforeClass()
			  {
				  login=new Login(driver);
				  teacher=new Teacher(driver);
				  logout=new Logout(driver);
			  }
			  
			  @BeforeMethod
			  public void BeforeMethod()
			  {
	login.loginLink();
	login.userName();
	login.PassWord();
	login.loginButton();

			  }
			  
			 @Test 
	public void To_Verify_TeachersPage()
	{
				 testID=1;
				 teacher=new Teacher(driver);
				 teacher.Teach();
				 Assert.fail();
				 //String url=driver.getCurrentUrl();
				 
				// Assert.assertEquals(url, "https://www.khanacademy.org/profile/me/teachers","Teachers page url not found");
	}
			 
			 

			  
			  @AfterMethod
			  public void afterMethod(ITestResult result) throws IOException
			  {
				  
				  
				  if( ITestResult.FAILURE==result.getStatus() )
				  {
					  Utility.captureScreenshot(driver, testID);
				  }
			  logout.ClickOnProfile();
			  logout.LoginOut();  
			  
			  
			  }
			  
			  @AfterClass
			  public void afterClass() throws SocketException
			  {
	logout=null;
	login=null;
	teacher=null;
	}

			  @AfterTest
			  public void afterTest()
			  {
				  System.gc(); //garbage collector object delete memory clear
				  driver.quit();
			  }
		

			
	}

