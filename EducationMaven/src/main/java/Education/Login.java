package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	 //Step 1 - to declare DM(variable) globally
	@FindBy(xpath="//a[@id='login-or-signup']") 
	private WebElement loginlink;
	
	@FindBy(xpath="//input[@id='uid-login-form-0-wb-id-identifier-field']") 
	private WebElement userName; 
	
	@FindBy(xpath="//input[@type='password']") 
	private WebElement passWord; 
	
	@FindBy(xpath="//button[@role='button']") 
	private WebElement loginButton; 
	
	
	//Step 2 - Initialize DM(data member)
	public Login(WebDriver driver) //constructor 
	{
		PageFactory.initElements(driver, this); 
//this keyword bcoz we need to call same class variable
//driver bcoz we will work on webdriver and we need to apply all things on chromedriver
//initElements comes from PageFactory class and it will communicate with every @findBy and perform action
	}    
	
	
	//step 3 - method create
	public void loginLink()
	{
		loginlink.click(); //encapuslate DM to call
	}
	
	public void userName()
	{
		userName.sendKeys("Abhinavvelocity");
	}
	
	public void PassWord()
	{
		passWord.sendKeys("Abhi@1804");
	}
	
	public void loginButton()
	{
		loginButton.click();
	}
	
}
