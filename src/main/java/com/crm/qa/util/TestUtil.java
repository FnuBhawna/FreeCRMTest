package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;


public void switchtoFrame(){
	driver.switchTo().frame("mainpanel");
}
}


//all common method will be write here this method is applicable for all classes not a partic`ular class