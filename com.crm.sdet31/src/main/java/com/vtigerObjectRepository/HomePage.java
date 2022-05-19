package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtility.WebDriverUtility;

public class HomePage  {
	//initialization of webElement
		public  HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	//declaration of web element
		
	
	@FindBy(linkText="Organizations")
	private WebElement organisationLink;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;
	
	@FindBy(linkText = "Products")
	private WebElement productLink;
	
	@FindBy (xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement signImgsrcLink;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOutLinnk;
	
	@FindBy(linkText = "More")
	private WebElement moreLink;
	
	@FindBy(linkText = "Purchase Order")
	private WebElement Purchagelink;
	
	@FindBy(name="Vendors")
	private WebElement vendorLink;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaignslink;
	
	//providing getter for using in script
	
	public WebElement getCampaignslink() {
		return campaignslink;
	}
	public WebElement getVendorLink() {
		return vendorLink;
	}
	public WebElement getOrganisationLink() {
		return organisationLink;
	}
	public WebElement getContactsLink() {
		return contactsLink;
	}

		public WebElement getProductLink() {
			return productLink;
			
		}
		public WebElement getSignImgsrcLink() {
			return signImgsrcLink;
		}
		public WebElement getSignOutLinnk() {
			return signOutLinnk;
		}
		public WebElement getMoreLink() {
			return moreLink;
		}
		public WebElement getPurchagelink() {
			return Purchagelink;
		}
		
		//business logic for utilization
		
		public void clickOnOrganizationlink() {
			
			organisationLink.click();
		}
		public void clickOnContactslink() {
			
			contactsLink.click();
		}
		
		public void clickOnProductLink() {
			
			productLink.click();
		}
		WebDriver driver=null;
		WebDriverUtility wlib=new WebDriverUtility();
		public void logout(WebDriver driver ) {
			
			wlib.mouseOverOnElement(driver,signImgsrcLink );
			signOutLinnk.click();
		}
		
		public void mouseoverToPurchage(WebDriver driver) {
			wlib.mouseOverOnElement(driver, moreLink);
			Purchagelink.click();
		}
		public void clickOnVendor(WebDriver driver) {
			wlib.mouseOverOnElement(driver, moreLink);
			vendorLink.click();
		}
		
		public void clickOncmapaign(WebDriver driver) {
			wlib.mouseOverOnElement(driver, moreLink);
			campaignslink.click();
		}
}
