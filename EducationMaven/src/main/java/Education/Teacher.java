package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teacher 
{
	@FindBy(xpath="//span[text()='Teachers']")
	private WebElement teacher;
	
	@FindBy(xpath="//a[@role='button']")
	private WebElement enterCode;

	public Teacher(WebDriver driver)
	{
		PageFactory.initElements(driver, this); 

	}
	
	public void Teach()
	{ 
		teacher.click();
	}
	
	public void EnterCode()
	{
		enterCode.click();
	}
}
 