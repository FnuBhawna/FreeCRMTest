package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath="//a[contains(text(),'Companies')]")
	WebElement companiesLink;
	
	@FindBy(xpath="//a[contains(text(),'CONTACTS')]")
	WebElement contactsLink;

@FindBy(xpath="//a[contains(text(),'DEALS')]")
WebElement dealsLink;

@FindBy(xpath="//a[contains(text(),'REPORTS')]")
WebElement reportsLink;
//Intializing the page objects
public HomePage(){
	PageFactory.initElements(driver, this);
}
//Methods
public   String verifyHomePageTitle(){
	return driver.getTitle();
}
public CompaniesPage clickonCompaniesLink(){
	 companiesLink.click();
	 return new CompaniesPage();
}
public ContactsPage clickonContactsLink(){
	contactsLink.click();
	return new ContactsPage();
}
public DealsPage clickondealsLink(){
	dealsLink.click();
	return new DealsPage();
}


}//page libraries i have created