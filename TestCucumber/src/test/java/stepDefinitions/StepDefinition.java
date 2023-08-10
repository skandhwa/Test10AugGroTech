package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pagefactory.CreateCustomer;
import Pagefactory.EditCustomer;
import Pagefactory.LoginPage;
import Utilities.BaseClass;
import Utilities.GetDataFromExcel;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends  BaseClass {
	
	
	WebDriver driver=BaseClass.InitializeDriver();
	LoginPage obj=new LoginPage(driver);
	CreateCustomer obj1=new CreateCustomer(driver);
	EditCustomer obj2=new EditCustomer(driver);
	
	
	
	@Given("User Open the URL for Orange HRM")
	public void user_open_the_url_for_orange_hrm() throws IOException  {
		
        System.out.println("Page is Loaded");
	
	   
	}

	@Then("User Enters the {string}")
	public void user_enters_the(String username) throws IOException {
		
		
		obj.enterUsername(username);
	    
	}

	@Then("the the User Enters the {string}")
	public void the_the_user_enters_the(String password) {
		
		obj.enterPassword(password);
	   
	}

	@When("User Clicks on Login Button")
	public void user_clicks_on_login_button() {
		
		obj.clickSubmit();
	   
	}

	@Then("User will be navigated to Orange Hrm Home page")
	public void user_will_be_navigated_to_orange_hrm_home_page() {
		
	String URL=	driver.getTitle();
	    
	}
	
	@Then("User Clicks on New Customer Link")
	public void user_clicks_on_new_customer_link() throws InterruptedException {
		
		
		obj1.ClickOnNewCustomer();
	    
	}

	@Then("User Enters Customer {string}")
	public void user_enters_customer(String customername) {
		
		obj1.enterCustomerName(customername);
	    
	}

	@Then("user will select the gender")
	public void user_will_select_the_gender() {
		
		obj1.selectgender();
	    
	}
	
	
	
	@Then("User will Click on Edit Customer Link")
	public void user_will_click_on_edit_customer_link() throws InterruptedException 
	
	{
		obj2.ClickonEditCustomer();
		Thread.sleep(3000);
	    
	}

	@Then("User will Enter the {string}")
	public void user_will_enter_the(String customer_id) 
	{
		obj2.enterCustomerNameforUpdation(customer_id);
	    
	}

	@Then("User will click on Submit")
	public void user_will_click_on_submit() {
		
		obj2.ClickOnSubmit2();
	   
	}

	@Then("User will update the field of City")
	public void user_will_update_the_field_of_city() throws InterruptedException {
		obj2.UpdateAddress();
	    
	}

	

	@Then("User Will again Click on Submit")
	public void user_will_again_click_on_submit() throws InterruptedException, IOException {
		obj2.ClickOnSubmit2();
		Thread.sleep(3000);
		BaseClass.takescreenshot();
		
	}
	
	


	
	
	

}
