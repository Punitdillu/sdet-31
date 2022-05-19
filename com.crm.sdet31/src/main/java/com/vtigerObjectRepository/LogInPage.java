package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	//initialization of web Element
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// declaration of web Element
     @FindBy(name="user_name")
     private WebElement userNameTextField;
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	@FindBy(id="submitButton")
	private WebElement loginButton;
	
	//providing getters for using in test Script
	
	public WebElement getUserNameTextField() {
		return userNameTextField;
		
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
		
	}
	public WebElement getLoginButton() {
		return loginButton;
		
	}
	// business logic for utilization 
	
	public void login(String username,String password) {
		userNameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}

}
