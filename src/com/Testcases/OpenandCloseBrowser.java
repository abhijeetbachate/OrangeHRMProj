package com.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import com.TestBase.TestBase;

public class OpenandCloseBrowser extends TestBase {

	@BeforeSuite
	public void OpenBroser() throws Throwable
	{
		OpenBrowser();
	}
	
	@AfterTest
	public void CloseBroser()
	{
		CloseBrowser();
	}
}
