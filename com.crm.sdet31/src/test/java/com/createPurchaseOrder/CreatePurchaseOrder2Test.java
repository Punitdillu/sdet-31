package com.createPurchaseOrder;

import org.testng.annotations.Test;

import com.crm.GenericUtility.Base_Class;
import com.crm.GenericUtility.JavaUtility;
import com.vtigerObjectRepository.CreateNewPurchaseOrder;
import com.vtigerObjectRepository.CreatenewVendor;
import com.vtigerObjectRepository.HomePage;
import com.vtigerObjectRepository.Productwindow;
import com.vtigerObjectRepository.PurchageOrderPage;
import com.vtigerObjectRepository.PurchaseorderInformation;
import com.vtigerObjectRepository.VendorPage;
import com.vtigerObjectRepository.VendorPurchaseorderwindow;

public class CreatePurchaseOrder2Test extends Base_Class {
	
	@Test(groups = "CreatePurchaseOrder2Test")
public void create_purchase_order() throws Throwable {
		
		
		JavaUtility jlib=new JavaUtility();
		String subject=jexl.getExcelsheetdata("Sheet5", 0, 1);
		String vendorname=jexl.getExcelsheetdata("Sheet5", 1, 1)+jlib.getRandomNum();
		String status=jexl.getExcelsheetdata("Sheet5", 2, 1);
		String Address=jexl.getExcelsheetdata("Sheet5", 3, 1);
		String itemname=jexl.getExcelsheetdata("Sheet5", 5, 1);
		double quantity=jexl.getExcelsheetNumericdata("Sheet5", 6, 1);
		
		PurchageOrderPage pur_order=new PurchageOrderPage(driver);
		HomePage homepage=new HomePage(driver);
		homepage.clickOnVendor(driver);
		VendorPage page=new VendorPage(driver);
		page.clickaddVendoricon();
		CreatenewVendor newvendor=new CreatenewVendor(driver);
		newvendor.createVendorname(vendorname);
		//newvendor.address(Address);
		newvendor.save();
		homepage.mouseoverToPurchage(driver);
		pur_order.clickOnAddicon();
		CreateNewPurchaseOrder crnewPur=new CreateNewPurchaseOrder(driver);
		crnewPur.insertSubject(subject);
		crnewPur.clickAddiconVendorname();
		VendorPurchaseorderwindow vendorwin= new VendorPurchaseorderwindow(driver);
		vendorwin.insertVendor(driver, vendorname);
		crnewPur.giveStatus(status);
		crnewPur.billingAddress(Address);
		crnewPur.clickBillingRadiobutn();
		crnewPur.clickOnproductsymbol();
		Productwindow prdctwin=new Productwindow(driver);
		prdctwin.enterproductname(driver, itemname);
		//prdctwin.clickonSearch();
		wlib.switchToWindow(driver, "PurchaseOrder");
		crnewPur.enterquantityofproduct(quantity);
		crnewPur.save();
		PurchaseorderInformation purchaseinfrm=new PurchaseorderInformation(driver);
		String actualtext=purchaseinfrm.getText();
		if(actualtext.contains(subject))
		{
			System.out.println("Purchase order created successfully");
		}
		else {
			System.out.println("Purchase order not created ");
			

		}
	}


}
