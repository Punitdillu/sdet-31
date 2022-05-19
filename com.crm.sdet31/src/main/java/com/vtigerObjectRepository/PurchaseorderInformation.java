package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseorderInformation {
	//initialization of WebElement

	public PurchaseorderInformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//declaration or web element

	@FindBy(className="lvtHeaderText")
	private WebElement Actualtext;

	//providing getters for using in Script

	public WebElement getActualtext() {
		return Actualtext;
	}
	//business logic to utilize

	public String getText() {
		return Actualtext.getText();
	}


}
