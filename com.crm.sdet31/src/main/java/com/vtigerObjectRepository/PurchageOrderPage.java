package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchageOrderPage {
	
	//initialization of WebElement

	public PurchageOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//declaration or web element
	@FindBy(xpath = "//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement addPurchaseIcon;
	
	//providing getters for using in Script
	
	public WebElement getAddPurchaseIcon() {
		return addPurchaseIcon;
	}
	//business logic to utilize

		public void clickOnAddicon() {
			addPurchaseIcon.click();
		}
}
