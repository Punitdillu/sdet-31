package com.crm.GenericUtility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.vtigerObjectRepository.CampaignInformationPage;
import com.vtigerObjectRepository.CreateCampaignPage;
import com.vtigerObjectRepository.CreateNewCampaignPage;
import com.vtigerObjectRepository.HomePage;
import com.vtigerObjectRepository.LogInPage;
import com.vtigerObjectRepository.Productwindow;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public WebDriver driver=null;
	public WebDriverUtility wlib= new WebDriverUtility();
	public FileUtility fil=new FileUtility();
	public ExcelUtility jexl=new ExcelUtility();
	public JavaUtility jLib=new JavaUtility();
	public static WebDriver sdriver;
	
	@BeforeSuite(groups = { "smoke","sanity","regression","CreatePurchaseOrder2Test"})
	public void database_connection() {
		
		System.out.println("data base connection ");
	}
	
	@BeforeTest(groups = { "smoke","sanity","regression","CreatePurchaseOrder2Test"})
	public void before_test() {
		System.out.println("execute script in parallel mode");
	}
	//@Parameters("browser")
	@BeforeClass(groups = { "smoke","sanity","regression","CreatePurchaseOrder2Test"})
	public void launch_browser( ) throws Throwable  {
		String browserName=fil.getCommonProperty("browser");
		String url=fil.getCommonProperty("url");
		if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			throw new Exception("not campatible browser");
}
			sdriver=driver;
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

}
	@BeforeMethod(groups = { "smoke","sanity","regression","CreatePurchaseOrder2Test"})
	public void login() throws Throwable {
		String username1=fil.getCommonProperty("username");
		String password=fil.getCommonProperty("password");
		LogInPage log=new LogInPage(driver);
		log.login(username1, password);
		}
	
	@AfterMethod(groups = { "smoke","sanity","regression","CreatePurchaseOrder2Test"})
	public void logout() {
		 HomePage hom=new HomePage(driver);
		 hom.logout(driver);
	}
	
	@AfterClass(groups = { "smoke","sanity","regression","CreatePurchaseOrder2Test"})
	public void close_browser() {
		driver.quit();
	}
	
	@AfterTest(groups = { "smoke","sanity","regression","CreatePurchaseOrder2Test"})
	public void close_parallel_execution() {
		System.out.println("parallel execution closed");
	}
	
	@AfterSuite(groups = { "smoke","sanity","regression","CreatePurchaseOrder2Test"})
	public void close_database_connection() {
		System.out.println("database connection closed");
	}

}
