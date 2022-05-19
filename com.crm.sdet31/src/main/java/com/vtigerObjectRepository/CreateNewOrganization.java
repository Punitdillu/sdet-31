package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtility.WebDriverUtility;

public class CreateNewOrganization {
	
	//initialization of WebElement
	public CreateNewOrganization(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//declaration or web element
	@FindBy(name="accountname")
	private WebElement organisationNameTextField;
	@FindBy(name="industry")
	private WebElement industryDropDown;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement saveButton;
	
	//providing getters for using in Script
	
	public WebElement getOrganisationNameTextField()
	{
		return organisationNameTextField;
	}
	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}

	
	//business logic to utilize
	WebDriverUtility wlib= new WebDriverUtility();
	public void createOrganisationName(String organisationName,String dropDownValue) {
		organisationNameTextField.sendKeys(organisationName);
		wlib.selectWebelementByvalue(industryDropDown, dropDownValue);
		saveButton.click();
	}
}