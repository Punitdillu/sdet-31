package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProductPage {
	//initialization of WebElement

	public CreateNewProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//declaration or web element
	
		@FindBy(xpath = "//input[@title='Save [Alt+S]']")
		private WebElement saveButton;


		@FindBy(name="productname")
		private WebElement productTextfield;

		
		
	// providing getters for utilization in script
		public WebElement getProductTextfield() {
			return productTextfield;
		}
		public WebElement getSaveButton() {
			return saveButton;
		}
	//business logic for utilization
		public void enterProductname(String product) {
			productTextfield.sendKeys(product);
		}
		public void clickOnSavebutn() {
			saveButton.click();
		}

}
