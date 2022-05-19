package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	//initialization of web element
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
// declaration of webelement
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createContactAddIcon;
	
	//Providing getter for utilization in script
	
	public WebElement getCreateContactAddIcon() {
		return createContactAddIcon;
	}
	//business logic for utilization
	
	public void clickContactIcon() {
		createContactAddIcon.click();
		
	}
}
