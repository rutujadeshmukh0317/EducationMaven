package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout 
{
	@FindBy(xpath="//span[@class='_wozql4 _13hnk7qk']") 
	private WebElement ProfileName;
	
	@FindBy(xpath="//a[@class='_71vn8x8']") 
	private WebElement LoginOut; 
	
	public Logout(WebDriver driver) //constructor
	{
		PageFactory.initElements(driver, this); 
	}
	public void ClickOnProfile()
	{
		ProfileName.click();
	}
	
	public void LoginOut()
	{
		LoginOut.click();
	}
}
