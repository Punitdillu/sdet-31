package com.createOrganizationIndustry;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.GenericUtility.Base_Class;
import com.vtigerObjectRepository.CreateNewOrganization;
import com.vtigerObjectRepository.HomePage;
import com.vtigerObjectRepository.OrganizationPage;

public class CreateOrganizationwithIndustryTest extends Base_Class {
	@Test
	public void create_organization_with_industry() throws Throwable {
		
		
	String organizationName= jexl.getExcelsheetdata("Sheet2", 6, 2)+jLib.getRandomNum();
	String industryname=jexl.getExcelsheetdata("Sheet2", 6, 3);
		HomePage hom=new HomePage(driver);
		hom.clickOnOrganizationlink();
		OrganizationPage orgpg=new OrganizationPage(driver);
		orgpg.clickOnOrganisationIcon();
		CreateNewOrganization crorgnam=new CreateNewOrganization(driver);
		crorgnam.createOrganisationName(organizationName, industryname);
	
	String text=driver.findElement(By.className("dvHeaderText")).getText();
	if(text.contains(organizationName))
	{
		System.out.println("organization creation successfull: passed");
	}
	else {
		System.out.println("organization not created : failed");}
		
		}

}
