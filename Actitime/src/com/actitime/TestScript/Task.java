package com.actitime.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.genericlibrary.Baseclass;
import com.actitime.genericlibrary.FileLibrary;
import com.actitime.objectRepository.Homepage;
import com.actitime.objectRepository.Taskpage;

public class Task extends Baseclass{
	
	@Test 
	public void createCustomer() throws EncryptedDocumentException, IOException
	{
		Homepage hp=new Homepage(driver);
		hp.getTasktab().click();
		Taskpage tp=new Taskpage(driver);
		tp.getAddnewbtn().click();
		tp.getNewcust().click();
		
		FileLibrary f=new FileLibrary();
		String createcustomer = f.ReadDatafromExcelFile("sheet1", 2, 1);
		tp.getEntercustname().sendKeys(createcustomer);
		
		String discription = f.ReadDatafromExcelFile("sheet1", 1, 2);
		tp.getCustdisc().sendKeys(discription);
		tp.getCreatecust().click();
		 String expectedresult = createcustomer;
		 String Actualresult = driver.findElement(By.xpath("(//div[.='"+createcustomer+"'])[3]")).getText();
		SoftAssert s= new SoftAssert();
		s.assertEquals(Actualresult, expectedresult);
		s.assertAll();
		
		
	}
	

	
}
