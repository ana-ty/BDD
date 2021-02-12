package page;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
	  this.driver = driver;
	 }
	 
	 // Element library
	 @FindBy(how = How.XPATH, using = "//input[@id='username']")
	 WebElement User_Name;
	 @FindBy(how = How.XPATH, using = "//input[@id='password']")
	 WebElement Password;
	 @FindBy(how = How.XPATH, using = "//button[@name='login']")
	 WebElement SignIn;
	 @FindBy(how = How.XPATH, using = "//i[@class='fa fa-university']")
	 WebElement Bank_Cash_Button;
	 @FindBy(how = How.XPATH, using = "//a[@href='https://techfios.com/billing/?ng=accounts/add/\']")
	 WebElement New_account_Button;
	 @FindBy(how = How.XPATH, using = "//input[@id='account']")
	 WebElement Account_title;
	 @FindBy(how= How.XPATH,using ="//input[@id='description']")
	 WebElement Description;
	  
	 @FindBy(how= How.CSS, using = "input#balance") WebElement Initial_Balance;
	 @FindBy(how=How.CSS, using = "input#account_number") WebElement Account_No;
		
     @FindBy(how= How.XPATH, using = "//input[@id='contact_person']")
	 WebElement Contact_Person;
		
	  @FindBy( how = How.CSS, using ="input#contact_phone")WebElement PhoneNo;
	    
	  @FindBy (how = How.XPATH, using = "//input[@id='ib_url']") WebElement Email_ID;
	   
	   @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']") WebElement Submit_Button;
	   @FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[2]/a") WebElement Account_List;
	   @FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[1]/h5") WebElement Manage_Account;
	   @FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement Account_Page;
	 

	// Interactive method
	 public void enterUserName(String userName) {
	  User_Name.sendKeys(userName);
	 }
	 public void enterPassword(String password) {
	  Password.sendKeys(password);
	  }
	 
	 
	 public void enterCredentials(String userName, String password) {
	  User_Name.sendKeys(userName);
	  Password.sendKeys(password);
	 }
	 public void clickOnSignInButton() {
	  SignIn.click();
	 }
	
	 public String getPageTitle() {
	  return driver.getTitle();
	
	 }
	
	 
	 public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		  TakesScreenshot ts = ((TakesScreenshot) driver);
		  SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		  Date date = new Date();
		  String label = formatter.format(date);
		  File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		  String currrentDir = System.getProperty("user.dir");
		  FileUtils.copyFile(sourceFile, new File(currrentDir + "/screenshots/" + label + ".png"));
		 }
		
	 public void bankAndCashButton() {
	 Bank_Cash_Button.click();	 
		 
	 }
		
     public void newAccountButton() {
    	 New_account_Button.click(); 
    	 
     }
	  
     public void accountTitle(String Name) { 
    	int genNum= randomGenerator(999);
    	 Account_title.sendKeys(Name + genNum);
	 
     }

   public void description(String description) {
	   Description.sendKeys(description);
	   
   }
   
   public void intial_balance(String initialBalance) {
	   Initial_Balance.sendKeys(initialBalance);
	   
   }
   
   public void accountNumber(String AccNumber) {
	   int genNum= randomGenerator(999);
	   Account_No.sendKeys(  genNum + AccNumber);
	   
   }
   public void contactPersonName(String fullName) {
	   Contact_Person.sendKeys(fullName);
	   
	   
   }

    public void contactNumber(String phoneNo){
    	PhoneNo.sendKeys(phoneNo);
    	
    }
   
    public void emailID(String emailID) {
    	
    	int genNum= randomGenerator(999);
    	Email_ID.sendKeys(genNum + emailID );
    	
    }
   public void submitButton() {
	   Submit_Button.click();
	   
   }
   
   public void AccountList() {
	  Account_List.click(); 
	   
   }
}
	 
	 

