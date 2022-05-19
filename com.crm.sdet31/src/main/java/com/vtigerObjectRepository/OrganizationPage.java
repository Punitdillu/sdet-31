package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	// Initialization or webelement
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// declaration of web Element
	@FindBy(xpath="//img[@title=\"Create Organization...\"]")
	private WebElement organizationAddIcon;
	
	//providing getter for using in test scripr
	
	public WebElement getOrganizationAddIcon() {
		return organizationAddIcon;
	}
	
	//business logic for utilization
	
	public void clickOnOrganisationIcon() {
		
		organizationAddIcon.click();
	}

}
