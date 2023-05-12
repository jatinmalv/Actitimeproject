package com.actitime.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	//decleration
	
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasktab;
	
	@FindBy(xpath ="//div[.='Reports']")
	private WebElement Reportstab;
	
	@FindBy(xpath ="//div[.='Users']")
	private WebElement userstab;
	
	@FindBy(id ="logoutLink")
	private WebElement logoutlink;
	
	//initilization
	
	public Homepage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	
	//utilization
	public WebElement getTasktab() {
		return tasktab;
	}

	public WebElement getReportstab() {
		return Reportstab;
	}

	public WebElement getUserstab() {
		return userstab;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}
	
	
	
	

}
