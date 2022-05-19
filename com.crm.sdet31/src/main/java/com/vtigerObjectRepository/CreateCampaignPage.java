package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {
	
	//initilization of web element 
	public CreateCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//declaration of web element
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement campaignAddicon;
	
	
	// providing getters for utilizing in script
	public WebElement getCampaignAddicon() {
		return campaignAddicon;
	}
	//business logic for utilization
	public void clickOnCampaignAddicon() {
		campaignAddicon.click();
	}

}
