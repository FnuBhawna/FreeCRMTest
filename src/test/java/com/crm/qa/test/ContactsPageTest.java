package com.crm.qa.test;

public class ContactsPageTest {
	
	package com.crm.qa.test;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.crm.qa.base.TestBase;
	import com.crm.qa.pages.CompaniesPage;
	import com.crm.qa.pages.HomePage;
	import com.crm.qa.pages.LoginPage;
	import com.crm.qa.util.TestUtil;

	public class ContactsPageTest extends TestBase {
		LoginPage loginPage;
		HomePage homepage;
		CompaniesPage companiespage;
			TestUtil testUtil;
			ContactsPage contactsPage;
		public ContactsPageTest(){
			super();
		}
		@BeforeMethod
		public void setUp() {
			initialization();
			loginPage = new LoginPage();
			homepage = new HomePage();
			companiespage = new CompaniesPage();
			testUtil = new TestUtil();
			contactsPage = new ContactsPage();

	}
		@Test
		
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		
		


}
