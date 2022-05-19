package com.Practice;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.GenericUtility.FileUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatePurchaseOrder {

	@Test
	
		public void create_organization() throws Throwable {
			Random ran=new Random();
			int x=ran.nextInt(1000);
			String orgnam="Apple"+x;
			FileUtility flib=new FileUtility();
			String browser=flib.getCommonProperty("browser");
			String url=System.getProperty("url");
			String username=System.getProperty("username");
			String password=System.getProperty("password");
			WebDriver driver=null;
			
			if(browser.equals("chrome")) {
			
				WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
			}
			else if(browser.equals("firefox")) {
				
				WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
			}
			else{
				
				WebDriverManager.edgedriver().setup();
				 driver=new EdgeDriver();
			}
	}
}
