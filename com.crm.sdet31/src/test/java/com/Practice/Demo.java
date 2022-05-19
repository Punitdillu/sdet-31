package com.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.GenericUtility.Base_Class;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	@Test
	public void m1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	}
}
