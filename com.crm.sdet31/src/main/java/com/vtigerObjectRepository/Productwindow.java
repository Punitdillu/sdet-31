package com.vtigerObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtility.WebDriverUtility;

public class Productwindow {
	
	//initialization of WebElement

	public Productwindow(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//declaration or web element
	
	@FindBy(name="search_text")
	private WebElement searchtextField;
	
	@FindBy(name="search")
	private WebElement searchButton;
	
	//providing getters for using in Script


	public WebElement getSearchtextField() {
		return searchtextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	//business logic to utilize

	WebDriverUtility wlib= new WebDriverUtility();

	public void enterproductname(WebDriver driver,String product) {
		wlib.switchToWindow(driver, "Products");
		searchtextField.sendKeys(product);
		driver.findElement(By.xpath("//a[text()='"+product+"']")).click();
		wlib.switchToWindow(driver, "Campaigns&action");

	}
	
	
	

}
