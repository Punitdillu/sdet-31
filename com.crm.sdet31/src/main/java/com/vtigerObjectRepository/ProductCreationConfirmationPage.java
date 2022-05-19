package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCreationConfirmationPage {
	//initialization of WebElement

	public ProductCreationConfirmationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//declaration or web element

		@FindBy(className ="lvtHeaderText")
		private WebElement confirmationHeader;

		
		//providing getters for using in Script
		
		public WebElement getConfirmationHeader() {
			return confirmationHeader;
		}
		
		//business logic to utilize
		
		public String getheaderText() {
			return confirmationHeader.getText();
			
		}

}
