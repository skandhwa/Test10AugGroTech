package Pagefactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;


public class LoginPage extends BaseClass {
	WebDriver driver;
	BaseClass obj=new BaseClass();
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement login;

	public void enterUsername(String text1) throws IOException
	{
		username.sendKeys(text1);
		obj.takescreenshot();
		
		
		
	}

	public void enterPassword(String text2)
	{
		password.sendKeys(text2);
	}

	public void clickSubmit()
	{
		login.click();
	}
	
	

	
	
	
	
	
	
	

}
