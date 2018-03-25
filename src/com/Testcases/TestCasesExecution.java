package com.Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Library.Library;

public class TestCasesExecution extends Library {

	/*@Test(priority=1)
	public void checkLoginFunctionbality() throws Throwable
	{
		checkloginfunctionality();
	}*/
	
	/*@Test(dataProvider = "getdata")
	public void checkloginfunctionality(String cn, String cp) {
		System.out.println("The values are: " + cn + cp);
	}*/
	
	@Test
	public void checkloginfunctionality(String cn, String cp) throws Throwable
	{
		driver.findElement(By.xpath(prop.getProperty("Username"))).sendKeys("Admin");
		l.info("Entered Username");
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys("admin");
		l.info("Entered Password");
		driver.findElement(By.xpath(prop.getProperty("LoginButton"))).click();
		l.info("Clicked on Login");
		//File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcFile, new File(".\\src\\com\\ScreenShots\\OrangeHRM_Test_Pass.png"), true);
		l.info("ScreenShot Captured");
		
	}
	
	/*@Test(priority=1,dataProvider = "getdata")
	public void checkloginfunctionality(String cn, String cp) throws Throwable
	{
		driver.findElement(By.xpath(prop.getProperty("Username"))).sendKeys(cn);
		l.info("Entered Username");
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(cp);
		l.info("Entered Password");
		driver.findElement(By.xpath(prop.getProperty("LoginButton"))).click();
		l.info("Clicked on Login");
		//File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcFile, new File(".\\src\\com\\ScreenShots\\OrangeHRM_Test_Pass.png"), true);
		l.info("ScreenShot Captured");
		
	}
	*/
	/*@DataProvider
	public Object[][] getdata() {
		ShineXlsReader xls = new ShineXlsReader(".\\src\\com\\Datapool\\DataPool.xlsx");
		int rowCount = xls.getRowCount("Test1");
		int colCount = xls.getColumnCount("Test1");

		System.out.println("The row count is: " + rowCount + " The Column cunt is: " + colCount);
		Object obj[][] = new Object[rowCount - 1][colCount];

		for (int i = 2; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				obj[i - 2][j] = xls.getCellData("Test1", j, i);
			}
		}
		return obj;
	}*/
	
	/*@Test(priority=2)
	public void CheckUserActions() throws Throwable
	{
		mousehoveronUsers();
	}
	
	@Test(priority=3)
	public void createadmintestcase()
	{
		createAdmin();
	}*/
}
