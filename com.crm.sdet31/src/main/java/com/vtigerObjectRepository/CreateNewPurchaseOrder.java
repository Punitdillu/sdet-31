package com.vtigerObjectRepository;

import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtility.WebDriverUtility;

public class CreateNewPurchaseOrder {
	//initialization of WebElement

	public CreateNewPurchaseOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//declaration or web element
	
		@FindBy(id="searchIcon1")
		private WebElement clickonProducticon;
		@FindBy(xpath = "//input[@onclick='return copyAddressRight(EditView)']")
		private WebElement clickonBillingradiobutton;

		@FindBy(id="qty1")
		private WebElement qntitybox;

		@FindBy(name="subject")
		private WebElement subjectTextfield;
		
		@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
		private WebElement vendorAddicon;
		
		@FindBy(name="postatus")
		private WebElement statusvalue;
		
		@FindBy(name="bill_street")
		private WebElement billAddress;
		
		@FindBy(name="ship_street")
		private WebElement shippingAddress;
		
		@FindBy(xpath = "//img[@id='searchIcon1']")
		private WebElement itemName;
		
		@FindBy(xpath = "//input[@title='Save [Alt+S]']")
		private WebElement saveButton;
		@FindBy(xpath = "//input[@name='cpy']")
		private WebElement clickShippingAddresson;
		
		//providing getters for using in Script
		

		public WebElement getSaveButton() {
			return saveButton;
		}
		public WebElement getClickonBillingradiobutton() {
			return clickonBillingradiobutton;
		}
		public WebElement getClickonProducticon() {
			return clickonProducticon;
		}
		public WebElement getQntitybox() {
			return qntitybox;
		}

		public WebElement getItemName() {
			return itemName;
		}

		public WebElement getSubjectTextfield() {
			return subjectTextfield;
		}

		public WebElement getVendorAddicon() {
			return vendorAddicon;
		}

		public WebElement getStatusvalue() {
			return statusvalue;
		}

		public WebElement getBillAddress() {
			return billAddress;
		}

		public WebElement getShippingAddress() {
			return shippingAddress;
		}
		
		
		
		public WebElement getClickShippingAddresson() {
			return clickShippingAddresson;
		}
		//business logic to utilize


		public void insertSubject(String subject) {
			subjectTextfield.sendKeys(subject);
		}
		WebDriverUtility wlib= new WebDriverUtility();
		public void clickAddiconVendorname() {
			vendorAddicon.click();
			
		}
		
		public void giveStatus(String status ) {
			wlib.selectWebelementByvalue(statusvalue, status);
		}
		
		public void billingAddress(String billaddress) {
			billAddress.sendKeys(billaddress);
		}
		
		public void shipingAddress(String Shipaddress) {
			shippingAddress.sendKeys(Shipaddress);
		}
		public void clickoncopyshippingAddress() {
			clickShippingAddresson.click();
		}
		public void clickOnproductsymbol() {
			clickonProducticon.click();
		}
		public void enterquantityofproduct(double x) {
			qntitybox.sendKeys(String.valueOf(x));
		}
		public void save() {
			saveButton.click();
		}
		public void clickBillingRadiobutn() {
			clickonBillingradiobutton.click();
		}
}
