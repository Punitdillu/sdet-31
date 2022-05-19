package com.vtigerObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtility.WebDriverUtility;

public class VendorPurchaseorderwindow {
	
	//initialization of WebElement

	public VendorPurchaseorderwindow(WebDriver driver) {
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

		public void insertVendor(WebDriver driver, String vendorName) {
			WebDriverUtility wlib=new WebDriverUtility();
			wlib.switchToWindow(driver, "Vendors");
			searchtextField.sendKeys(vendorName);
			searchButton.click();
			driver.findElement(By.xpath("//a[text()='"+vendorName+"']")).click();
			wlib.switchToWindow(driver, "PurchaseOrder");


			
		}


}
