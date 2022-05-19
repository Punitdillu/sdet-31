package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatenewVendor {
	
	//initialization of WebElement

	public CreatenewVendor(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//declaration or web element

	@FindBy(name="vendorname")
	private WebElement vendorName;
	@FindBy(name="street")
	private WebElement streetName;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	//providing getters for using in Script

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getVendorName() {
		return vendorName;
	}

	public WebElement getStreetName() {
		return streetName;
	}
	//business logic to utilize

		public void createVendorname(String vendor) {
			vendorName.sendKeys(vendor);
		}
		public void address(String address) {
			streetName.sendKeys(address);	
			
		}
		public void save() {
			saveButton.click();
		}


	
}
