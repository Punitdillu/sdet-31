package com.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggetionHandling {
	public static void main(String[] args)  {
		
		WebDriver driver=null;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("bluestar");
		 List<WebElement> wb = driver.findElements(By.xpath("//div[@class=\"mkHrUc\"]/descendant::li[@class=\"sbct\"]"));
		 
		for (WebElement a : wb) {
			String s=a.getText();
			System.out.println(s);
		}
		driver.findElement(By.xpath("//*[name()='svg' and @class='gb_Ve']")).click();
		driver.quit();
		
		
		
	}

}
