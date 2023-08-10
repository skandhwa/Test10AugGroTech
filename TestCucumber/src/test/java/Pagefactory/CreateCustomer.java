package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class CreateCustomer {
	
	
	
	public CreateCustomer(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//a[@href='addcustomerpage.php']")
	WebElement NewCustomerLink;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement CustomerName;
	
	@FindBy(xpath="//input[@ name='rad1' and @value='m']")
	WebElement Gender;
	
	

	public void ClickOnNewCustomer() throws InterruptedException
	{
		NewCustomerLink.click();
		Thread.sleep(5000);
	}
	
	

	public void enterCustomerName(String text4)
	{
		CustomerName.sendKeys(text4);
	}
	

	public void selectgender()
	{
		Gender.click();
		
	}
	

	
	
	
	
	

}
