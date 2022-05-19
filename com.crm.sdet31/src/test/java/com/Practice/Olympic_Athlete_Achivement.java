package com.Practice;

import static org.testng.Assert.expectThrows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Olympic_Athlete_Achivement {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://olympics.com/");
		driver.findElement(By.xpath("//button[text()='Yes, I am happy']")).click();
		driver.findElement(By.xpath("//section[@class='b2p-nav__extended']/descendant::span[text()='Athletes']")).click();
		driver.findElement(By.xpath("//input[@id='input-search-athletes']")).sendKeys("Nathan CHEN",Keys.ENTER);
		//driver.findElement(By.xpath("//button[@class='button-no-styles icon-close-button pvp-modal__close']")).click();

		driver.findElement(By.xpath("//a[text()='Nathan CHEN']")).click();
		driver.findElement(By.xpath("//img[@alt='Nathan CHEN']")).click();
		//Thread.sleep(2000);
		WebElement wb = driver.findElement(By.xpath("//li[@class='detail__item text-small detail__item--medals']"));
		System.out.print(wb.getText());
		driver.quit();
	}

}
