package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignInformationPage {
	//initialization of WebElement

	public CampaignInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//declaration or web element
	
	@FindBy(className = "dvHeaderText")
	private WebElement headerText;

	//providing getters for using in Script
	public WebElement getHeaderText() {
		return headerText;
	}
	//business logic to utilize
	
	public String getheaderText() {
		return headerText.getText();
	}


}
