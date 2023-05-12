package com.actitime.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Taskpage{
	//decleration
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewbtn ;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newcust ;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustname ;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdisc ;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcust ;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelbtn ;
	
	//initilizaton
	public Taskpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//utilization
	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getEntercustname() {
		return entercustname;
	}

	public WebElement getCustdisc() {
		return custdisc;
	}

	public WebElement getCreatecust() {
		return createcust;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
