package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OganizationValidationPage {
	//For initialization of web Element
	public OganizationValidationPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	//declaration of web Element
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement confirmationText;
	//providing getter for using in script
	
	public WebElement getConfirmationText() {
		return confirmationText;
	}
	//business logic for utilization
	
	public String  organizationInformationText()
	{ 	
		
	return  confirmationText.getText();
		
	}
		
}
