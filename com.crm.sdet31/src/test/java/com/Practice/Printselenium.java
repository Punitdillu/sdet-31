package com.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Printselenium {
	public static void main(String[] args) {
		
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		List<WebElement> wb = driver.findElements(By.xpath("//ul[@class=\"navbar-nav mr-4 mb-2 mb-lg-0 pl-4 pl-lg-2\"]"));
		
		for (WebElement webElement : wb) {
			
			System.out.println(webElement.getText());
		}
		driver.quit();
	}
}
