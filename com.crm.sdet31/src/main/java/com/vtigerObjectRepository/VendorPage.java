package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorPage {
	
	//initialization of WebElement

	public VendorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//declaration or web element
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement vendorAddicon;

	//providing getters for using in Script

	public WebElement getVendorAddicon() {
		return vendorAddicon;
	}
	//business logic to utilize

		public void clickaddVendoricon() {
			vendorAddicon.click();
		}
	

	
}
