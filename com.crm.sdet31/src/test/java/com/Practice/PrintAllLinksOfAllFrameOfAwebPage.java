package com.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinksOfAllFrameOfAwebPage {

	public static void main(String[] args) {
		int hlinks=0;
		WebDriver driver=null;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		List<WebElement> lst = driver.findElements(By.xpath("//*"));
		
		for (WebElement wb : lst) {
			if(wb.getTagName().equals("a"))
			{
				hlinks++;
			}else if(wb.getTagName().equals("iframe"))
			{
				driver.switchTo().frame(wb);
				 List<WebElement> linklst = driver.findElements(By.xpath("//a"));
				 System.out.println(linklst.size());
				driver.switchTo().defaultContent();
			}
		}
		System.out.println(hlinks);
		driver.quit();
		
	}
}
