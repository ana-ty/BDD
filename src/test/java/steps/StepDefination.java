package steps;




import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import util.BrowserFactory;

public class StepDefination {
	
	WebDriver driver;
	LoginPage loginPage;
	
	@Before
	
	public void beforeRun() {
	driver=BrowserFactory.init();
	loginPage=PageFactory.initElements(driver, LoginPage.class);	
	}
	
	 @Given("^User is on the Techfios login page$")
	 public void User_is_on_the_Techfios_login_page() throws InterruptedException {
		//driver= BrowserFactory.init(); 
		driver.get("https://techfios.com/billing/?ng=login/"); 
		 
		Thread.sleep(2000); 
		 
	 }

	 
	 @When("^User enters username as \"([^\"]*)\"$" )
	 public void User_enters_username_as(String username ) throws InterruptedException {
		// loginPage= PageFactory.initElements(driver,LoginPage.class);
		 loginPage.enterUserName(username);
		 Thread.sleep(2000);
		 
		 
		 
		 
	 }
	 @When("^User enters password as \"([^\"]*)\"$")
	 public void user_enters_password_as(String password) throws InterruptedException {
	     loginPage.enterPassword(password); 
		 
	     Thread.sleep(2000);
	 }

	 @When("^User clicks on Signin button$")
	 public void user_clicks_on_Signin_button()  {
	    loginPage.clickOnSignInButton();
	     
	 }

	 
	 @Then("^User should land on Dashboard page$")
	 public void user_should_land_on_Dashboard_page() throws InterruptedException, IOException{
	//	 String expectedTitle = "Dashboard- iBilling";
	//	 String actualTitle="loginPage.getPageTitle()";
		
	//	 if(expectedTitle.equalsIgnoreCase(actualTitle)) {
	//		 System.out.println("Titles matched");
			 
	//	 }else{
		//	System.out.println("Titles does not match"); 
	//	 }
		 
		 
		 Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
		 loginPage.takeScreenshotAtEndOfTest(driver);
		  
    	 Thread.sleep(2000);
		
	 }
     
	 
	 @When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	 public void user_enters_and(String username, String password) throws InterruptedException{
	    loginPage.enterCredentials( username,password );
	    Thread.sleep(2000); 
	    
	 }
	
	 @Then("^User move to Bank & Cash$")
	 public void user_move_to_Bank_Cash() throws InterruptedException {
	 Thread.sleep(2000);    
	     
	 }

	 @Then("^User clicks$")
	 public void user_clicks() throws InterruptedException  {
	 loginPage.bankAndCashButton();   
	 Thread.sleep(2000);
	    
	 }

	 @Then("^User click on New Account$")
	 public void user_click_on_New_Account() throws Throwable {
	     loginPage.newAccountButton();
	     Thread.sleep(2000);
	 
	 
	 }

	
	 @Then("^User enters details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	 public void user_enters_details_and_and_and_and_and_and(String Name, String description , String  initialBalance, String AccNumber, String fullName, String phoneNo, String emailID) throws InterruptedException {
	   loginPage.accountTitle(Name);
	   loginPage.description(description);
	   loginPage.intial_balance(initialBalance);
	   loginPage.accountNumber(AccNumber);
	   loginPage.contactPersonName(fullName);
	   loginPage.contactNumber(phoneNo);
	   loginPage.emailID(emailID);
	   
	     Thread.sleep(2000);
	 }


	 @And ("^User clicks on submit button$")
	 public void user_clicks_on_submit_button() throws InterruptedException{
	     loginPage.submitButton();
	     
	     
	     Thread.sleep(2000);
	     
	     }

	 @Then("^User should be able to validate new account$")
	 public void user_should_be_able_to_validate_new_account() throws IOException { 
	     Assert.assertEquals("Accounts- iBilling", loginPage.getPageTitle());
	     loginPage.takeScreenshotAtEndOfTest(driver);
    	 
	     
	 }
	 
	 
	 
	 
	// @After
	// public void tearDown() {
	//	 driver.close();
	//	 driver.quit();
		 
		 
	 }
     
	 




