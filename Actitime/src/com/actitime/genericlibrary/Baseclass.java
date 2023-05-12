package com.actitime.genericlibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.actitime.objectRepository.Homepage;
import com.actitime.objectRepository.Loginpage;

public class Baseclass {
	public static WebDriver driver;
	FileLibrary f = new FileLibrary();
	@BeforeSuite
	public void databaseConnection()
	{
		Reporter.log("database is connected",true);
	}
	@BeforeClass
	public void lounchBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String URL = f.ReadDataFromPropertyFile("url");
		driver.get(URL);
		Reporter.log("browser lounched",true);
	}
	@BeforeMethod
	public void login() throws IOException
	{  
		Loginpage lp=new Loginpage(driver);
		String UN = f.ReadDataFromPropertyFile("username");
		String PWD = f.ReadDataFromPropertyFile("password");
		lp.getUntbx().sendKeys(UN);
		lp.getPwtbx().sendKeys(PWD);
		lp.getLgbtn().click();
	    Reporter.log("login is successfully",true);
	}
	@AfterMethod
	public void lougout()
	{    Homepage hp=new Homepage(driver);
	     hp.getLogoutlink();
	     Reporter.log("logged out successfully",true);
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
		Reporter.log("browser closed",true);
	}
	@AfterSuite
	public void databasedisconnected()
	{
		Reporter.log("database is disconnected",true);
	}
	
	
	

}
