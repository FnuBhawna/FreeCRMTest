package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;// we can use it anywhere
	public static Properties prop;// IT'S A global variable because we can use
									// it inside the child classes or under the
									// base classes also

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\os_56\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");

			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browserName");
		if  (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\os_56\\geckodriver-v0.18.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equals("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\os_56\\chromedriver_win32 (1)/chromedriver.exe");
				driver = new ChromeDriver();

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
