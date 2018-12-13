package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	//Page Factory  - or
	
	
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement LoginBtn;
	
	@FindBy(xpath= "//button[contains(text(),'Sign UP')]")
	WebElement signUpButton;
	
	@FindBy(xpath= "//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	//how to initializing the page objects or  factory
	//interview question
	//how will you intilize your page factory
	//one method called pageFactory.intelements method is there
	//this means current class.objects all this objects initilize with driver
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	//Actions
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	public boolean validateCRMimage(){
		return crmLogo.isDisplayed();
	}
	public HomePage logIn(String un, String pw) throws Exception{
		/*if(un == null || "".equals(un)){
			System.out.println("user name is empty");
			throw new Exception("Illeagal Arugument user name");
		}
		if(pw == null || "".equals(pw)){
			System.out.println("Password is empty");
			throw new Exception("Illeagal Arugument Password");
		}*/
		
		
		userName.sendKeys(un);
		password.sendKeys(pw);
		LoginBtn.click();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
    	//js.executeScript("arguments[0].click();", LoginBtn);
    	/*HomePage hp = new HomePage();
    	hp.setLoginSuccessful(true);
    	
		return hp;*/
		return new HomePage();
		
		
	}
	
			

}

