package com.crm.qa.test;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	public LoginPageTest(){
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		 loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void LoginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
	@Test(priority=2)
	public void crmImageTest(){
		boolean flag = loginPage.validateCRMimage();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void LoginTest(){
	 try {
		homepage  = loginPage.logIn(prop.getProperty("userName"),prop.getProperty("pasword" ));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}
