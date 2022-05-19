package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	//initialization of WebElement

	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//declaration or web element
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement productAddicon;
	// providing getters for utilization in script
	public WebElement getProductAddicon() {
		return productAddicon;
	}
	
	//business logic for utilization
	
	public void clickOnProductAddIcon() {
		productAddicon.click();
	}
}
