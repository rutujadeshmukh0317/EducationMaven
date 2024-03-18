package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home2GitChanges {

	@FindBy(xpath="//input[@maxlength='8']")
	private WebElement classCode;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement Cont;
	
	@FindBy(xpath="//a[@class='_1mwdd64y']")
	private WebElement back;
	
	public Home2GitChanges(WebDriver driver)
	{
		PageFactory.initElements(driver, this); 
	}

	public void classCode()
	{
  classCode.sendKeys("RD");	
}
	
	public void Continue()
	{
		Cont.click();
	}
	
	
}
