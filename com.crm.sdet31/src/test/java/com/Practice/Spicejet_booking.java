package com.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet_booking {
	
		public static void main(String[] args) {
	
			WebDriverManager.chromedriver().setup();
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			WebDriver driver=new ChromeDriver(option);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://www.spicejet.com/");
			driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']/descendant::*[name()='svg']")).click();
			driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).click();
			driver.findElement(By.xpath("//div[text()='Ahmedabad']")).click();
			WebElement wb = driver.findElement(By.xpath("//div[@data-testid='undefined-month-April-2022']/descendant::div[text()='7']"));
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(wb));
			wb.click();
			//driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();

			
		}

}
