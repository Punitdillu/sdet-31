package com.vtigerObjectRepository;

import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCampaignPage {
	//initilization of web element 

	public CreateNewCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//declaration of web element

	@FindBy(name="campaignname")
	private WebElement campaigntextField;
	
	@FindBy(xpath = "//img[@title='Select']")
	private WebElement productAddicon;
	
	@FindBy(xpath ="//input[@title='Save [Alt+S]']")
	private WebElement saveButon;
	
	// providing getters for utilizing in script

	public WebElement getCampaigntextField() {
		return campaigntextField;
	}

	public WebElement getProductAddicon() {
		return productAddicon;
	}
	public WebElement getSaveButon() {
		return saveButon;
	}
	//business logic for utilization
	
	public void enterCampaignname(String campaign) {
		campaigntextField.sendKeys(campaign);
	}
	public void clickonProductAddicon() {
		productAddicon.click();
	}
	public void clicksaveButton()
	{
		saveButon.click();
	}

	
}
