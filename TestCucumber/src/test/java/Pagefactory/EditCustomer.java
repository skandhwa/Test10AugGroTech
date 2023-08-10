package Pagefactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class EditCustomer {
	
	BaseClass obj3=new BaseClass();
	
	public EditCustomer(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//a[@href='EditCustomer.php']")
	WebElement EditCustomerLink;
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement EnterCustomerId;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Submit2;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement NewUpdatedVal;
	
	public void ClickonEditCustomer()
	{
		EditCustomerLink.click();
	}
	
	public void enterCustomerNameforUpdation(String text5)
	{
		EnterCustomerId.sendKeys(text5);
	}
	
	public void ClickOnSubmit2()
	{
		Submit2.click();
	}
	
	public void UpdateAddress() throws InterruptedException
	{
		NewUpdatedVal.clear();
		Thread.sleep(2000);
		NewUpdatedVal.sendKeys("Kolkata New Gitanjali road");
		Thread.sleep(3000);
	}
	
	
	
	

}
