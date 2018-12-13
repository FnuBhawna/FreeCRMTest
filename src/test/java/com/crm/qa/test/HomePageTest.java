package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CompaniesPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	CompaniesPage companiespage;
		TestUtil testUtil;
	public HomePageTest() {
		super();
	}
//test cases should be independed to each other
	//before each test cases  .....launch the browser
	//@test  execute test cases
	//after each test cases..... close the browser
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homepage = new HomePage();
		companiespage = new CompaniesPage();
		testUtil = new TestUtil();
		try{
			homepage = loginPage.logIn(prop.getProperty("userName"), prop.getProperty("password"));
		}catch(Exception e){
			System.out.println("Login Failed");
		}
		

	}

 
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO");
	}

	@Test(priority=2)
	public void clickonCompaniesLinkTest() {
		testUtil.switchtoFrame();
		companiespage = homepage.clickonCompaniesLink();
	

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
