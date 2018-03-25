package com.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fip;
	public static Logger l;
	
	public void OpenBrowser() throws Throwable
	{
		l = Logger.getLogger("devpinoyLogger");
		fip = new FileInputStream(".\\src\\com\\Config\\Or.Properties");
		prop = new Properties();
		prop.load(fip);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     driver = new ChromeDriver();
	     l.info("Chrome Browser Launched");
		driver.get("http://opensource.demo.orangehrmlive.com/");
		 l.info("URL is Entered");
		driver.manage().window().maximize();
		l.info("Window size maximized");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	public void CloseBrowser()
	{
		driver.quit();
		l.info("Driver instance killed");
	}
}
