package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtility.WebDriverUtility;

public class CreateNewContactPage {
	//initialization of web element

	public CreateNewContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//declaration of web element
	
		@FindBy(name="lastname")
		private WebElement lastNameTextfield;
		@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
		private WebElement organiZationAddIcon;
		@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement saveButtonLink;
		@FindBy(className ="dvHeaderText")
		private WebElement confirmationText;
		
		//providing getters for using in Script
		public WebElement getLastNameTextfield() {
			return lastNameTextfield;
		}
		public WebElement getOrganiZationAddIcon() {
			return organiZationAddIcon;
		}
		public WebElement getSaveButtonLink() {
			return saveButtonLink;
		}
		public WebElement getConfirmationText() {
			return confirmationText;
		}
		//business logic to utilize

			public void enterLastNAme(String lastname) {
				lastNameTextfield.sendKeys(lastname);
			}
			public void clickOnorganisationAddIcon() {
				organiZationAddIcon.click();
			}
			public void toSave(WebDriver driver) {
				WebDriverUtility wlib=new WebDriverUtility();
				wlib.switchToWindow(driver, "Contacts");
				saveButtonLink.click();
			}
			public String getcontactConfirmationText() {
				return confirmationText.getText();
			}
}
