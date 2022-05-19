package com.CampaignWithProduct;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.GenericUtility.Base_Class;
import com.vtigerObjectRepository.CampaignInformationPage;
import com.vtigerObjectRepository.CreateCampaignPage;
import com.vtigerObjectRepository.CreateNewCampaignPage;
import com.vtigerObjectRepository.HomePage;
import com.vtigerObjectRepository.Productwindow;

public class CreateCampaignWithProduct_Test extends Base_Class {
	@Test(groups = "regression")
	public  void create_campaign_with_product() throws Throwable {
		
		
		String campaignName=jexl.getExcelsheetdata("Sheet1", 1, 3);
		String productName=jexl.getExcelsheetdata("Sheet1", 2, 3);
		
		
		
		HomePage hompage=new HomePage(driver);
		hompage.clickOncmapaign(driver);
		CreateCampaignPage campn=new CreateCampaignPage(driver);
		campn.clickOnCampaignAddicon();
		CreateNewCampaignPage crnewpage=new CreateNewCampaignPage(driver);
		crnewpage.enterCampaignname(campaignName);
		crnewpage.clickonProductAddicon();
		Productwindow prowin= new Productwindow(driver);
		prowin.enterproductname(driver, productName);
		crnewpage.clicksaveButton();
		CampaignInformationPage campaginfo=new CampaignInformationPage(driver);
		String Actualtext=campaginfo.getheaderText();
		
//		if(Actualtext.contains(campaignName)) {
//			System.out.println("camapign created successfully");
//		}
//		else {
//			System.out.println("camapign not created ");
//
//		}
		
		//Assert.assertEquals(Actualtext.contains(campaignName), true);
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(Actualtext.contains(campaignName), true);
		sf.assertAll();
		
	}

}
