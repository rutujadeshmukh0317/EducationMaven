package TestEducation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Education.Home;
import Education.Login;
import Education.Logout;
import Education.Profile;
import Education.Teacher;

public class TestEducation 
{
	public static void main(String[] args) 
	{
		
	//	System.setProperty("Webdriver.chrome.driver","C:\\Users\\Rutuja\\Downloads\\chromedriver_win32");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.khanacademy.org");
		
		driver.manage().window().maximize();
		
		Login login = new Login(driver);
		
		login.loginLink();
		login.userName();
		login.PassWord();
		login.loginButton();
		
	  Teacher teacher=new Teacher(driver);

	    teacher.Teach();
	    teacher.EnterCode(); 
	    
	    Profile profile=new Profile(driver);

	    profile.profile();
	  
	   Home home=new Home(driver);
	  
	   home.classCode();
	   home.Continue();
	   home.Back();
	    
	    Logout logout=new Logout(driver);
	    
	    logout.ClickOnProfile();
	    logout.LoginOut(); 
		
	}
}
