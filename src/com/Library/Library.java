package com.Library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

import xls.ShineXlsReader;

public class Library extends TestBase{

	@Test
	public void checkloginfunctionality(String row, String col) throws Throwable
	{
		driver.findElement(By.xpath(prop.getProperty("Username"))).sendKeys("admin");
		l.info("Entered Username");
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys("manager");
		l.info("Entered Password");
		driver.findElement(By.xpath(prop.getProperty("LoginButton"))).click();
		l.info("Clicked on Login");
		//File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcFile, new File(".\\src\\com\\ScreenShots\\OrangeHRM_Test_Pass.png"), true);
		l.info("ScreenShot Captured");
		
	}
	/*@Test(priority=1,dataProvider = "getdata")
	public void checkloginfunctionality(String row, String col) throws Throwable
	{
		driver.findElement(By.xpath(prop.getProperty("Username"))).sendKeys(row);
		l.info("Entered Username");
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(col);
		l.info("Entered Password");
		driver.findElement(By.xpath(prop.getProperty("LoginButton"))).click();
		l.info("Clicked on Login");
		//File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcFile, new File(".\\src\\com\\ScreenShots\\OrangeHRM_Test_Pass.png"), true);
		l.info("ScreenShot Captured");
		
	}*/
	
	/*@Test(priority=1,dataProvider = "getdata")
	public void checkloginfunctionalityusingdatapool(String cn, String cp) {
		System.out.println("The values are: " + cn + cp);
	}*/

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
	
	/*@DataProvider
	public Object[][] getdata() {
		ShineXlsReader xls = new ShineXlsReader(".\\src\\com\\Datapool\\DataPool.xlsx");
		int rowCount = xls.getRowCount("Sheet1");
		int colCount = xls.getColumnCount("Sheet1");

		System.out.println("The row count is: " + rowCount + " The Column cunt is: " + colCount);
		Object obj[][] = new Object[rowCount - 1][colCount];

		for (int i = 2; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				obj[i - 2][j] = xls.getCellData("Sheet1", j, i);
			}
		}
		return obj;
	}*/
	
	
	public void mousehoveronUsers() throws Throwable
	{
		Actions act = new Actions(driver);
		
		WebElement admin = driver.findElement(By.xpath(prop.getProperty("Admin")));
		act.moveToElement(admin).perform();
		l.info("mousehover on admin");
		Thread.sleep(2000);
		WebElement User_mgmt = driver.findElement(By.xpath(prop.getProperty("User_Management")));
		act.moveToElement(User_mgmt).perform();
		l.info("mousehover on User Management");
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath(prop.getProperty("User")));
		act.moveToElement(user).click().build().perform();
	}
	
	public void createAdmin()
	{
		driver.findElement(By.xpath(prop.getProperty("AddButton"))).click();
		WebElement ele = driver.findElement(By.xpath(prop.getProperty("Select_Usertype")));
		Select sel_dd = new Select(ele);
		sel_dd.selectByValue("1");
		driver.findElement(By.xpath(prop.getProperty("Enter_Name"))).sendKeys("Jasmine Morgan");
		driver.findElement(By.xpath(prop.getProperty("Enter_Username"))).sendKeys("Jasmin");
		//driver.findElement(By.xpath(".//*[@id='systemUser_status']")).click();
		driver.findElement(By.xpath(prop.getProperty("Enabling_Type"))).click();
		driver.findElement(By.xpath(prop.getProperty("Enter_UserPassword"))).sendKeys("abcd@123");
		driver.findElement(By.xpath(prop.getProperty("Confirm_Enter_UserPassword"))).sendKeys("abcd@123");
		driver.findElement(By.xpath(prop.getProperty("SaveUser"))).click();
	}
}
