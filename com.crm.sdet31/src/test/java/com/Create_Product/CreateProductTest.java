package com.Create_Product;

import org.testng.annotations.Test;

import com.crm.GenericUtility.Base_Class;
import com.crm.GenericUtility.JavaUtility;
import com.vtigerObjectRepository.CreateNewProductPage;
import com.vtigerObjectRepository.HomePage;
import com.vtigerObjectRepository.ProductCreationConfirmationPage;
import com.vtigerObjectRepository.ProductPage;

public class CreateProductTest extends Base_Class {
	@Test(groups = "sanity")
	
	public  void create_product() throws Throwable {
		
		JavaUtility jlib=new JavaUtility();
		String productname=jexl.getExcelsheetdata("Sheet4", 2, 2)+jlib.getRandomNum();
		
		HomePage home=new HomePage(driver);
		home.clickOnProductLink();
		ProductPage prodct=new ProductPage(driver);
		prodct.clickOnProductAddIcon();
		CreateNewProductPage crnewproduct=new CreateNewProductPage(driver);
		crnewproduct.enterProductname(productname);
		crnewproduct.clickOnSavebutn();
		ProductCreationConfirmationPage confrm=new ProductCreationConfirmationPage(driver);
		String Actualtext=confrm.getheaderText();
		if(Actualtext.contains(productname)) {
			System.out.println("product creation successfull");
		}
		else {
			System.out.println("product creation fail");

		}
	}

}
