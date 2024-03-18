package TestNG;

import java.net.SocketException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Education.Login;
import Education.Logout;
import Education.Teacher;

public class Validation_Asserts 
{
	WebDriver driver;
	  Login login;
	  Teacher teacher;
	  Logout logout;
	  SoftAssert soft;
	  
	  @BeforeClass // before class and after class can execute only single time
	  public void beforeClass()
	  {
		  driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.khanacademy.org/");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod()
	  {
		  login=new Login(driver);
		  
		  login.loginLink();
		  login.userName();
		  login.PassWord();
		  login.loginButton();
	  }
	  
	  @Test
	  public void To_verify_the_TeacherPage()
	  {
	  soft=new SoftAssert();
		  
	  teacher = new Teacher(driver);
	 
	  teacher.Teach();
	  String title = driver.getTitle();
	  
	  System.out.println(title);
	  
	  String url=driver.getCurrentUrl();

soft.assertEquals(url,"https://www.khanacademy.org/profile/me/teachers","Teachers page url not found");
	 //instead of if else we use assertEquals

	//  boolean result=url.equals("https://www.khanacademy.org/profile/me/teachers");
	//  Assert.assertTrue(result);	
	  soft.assertAll();
	  }
	  
	  @AfterMethod
	  public void afterMethod()
	  {
	  logout=new Logout(driver);  
	  logout.ClickOnProfile();
	  logout.LoginOut();  
	  }
	  
	  @AfterClass
	  public void afterClass() throws SocketException
	  {
		  driver.close();
		  }

	  
}
