package com.vtigerObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtility.WebDriverUtility;

public class OrganizationPopupPAge {
	
	// Initialization or web element

	public OrganizationPopupPAge(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	// declaration of web Element
	@FindBy(name="search_text")
	private WebElement searchTextField;
	
	@FindBy(name="search")
	private WebElement searchButton;
	//providing getter for using in test script

		public WebElement getSearchTextField() {
			return searchTextField;
		}
		
		public WebElement getSearchButton() {
			return searchButton;
		}
		
		public void insertOrganizationName(WebDriver driver,String orgname) {
			WebDriverUtility wlib= new WebDriverUtility();
			wlib.switchToWindow(driver, "Accounts");
			searchTextField.sendKeys(orgname);
			searchButton.click();
			driver.findElement(By.linkText(orgname)).click();
		}
		
}
