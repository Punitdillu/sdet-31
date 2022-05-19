package com.CreateContactWithOrganisation;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.GenericUtility.Base_Class;
import com.vtigerObjectRepository.ContactPage;
import com.vtigerObjectRepository.CreateNewContactPage;
import com.vtigerObjectRepository.CreateNewOrganization;
import com.vtigerObjectRepository.HomePage;
import com.vtigerObjectRepository.OganizationValidationPage;
import com.vtigerObjectRepository.OrganizationPage;
import com.vtigerObjectRepository.OrganizationPopupPAge;

	@Listeners(com.crm.GenericUtility.Listneres_Implementation_Class.class)
public class CreateContactWithOrganizationTest extends Base_Class {
	@Test(retryAnalyzer = com.crm.GenericUtility.Retry_Analyzer_Implementation_class.class)
	public  void create_contact_with_organization() throws Throwable {
		
		String organizationName=jexl.getExcelsheetdata("Sheet2", 6, 2)+jLib.getRandomNum();
		String industryName=jexl.getExcelsheetdata("Sheet2", 6, 3);
		String lastname=jexl.getExcelsheetdata("Sheet2", 6, 1)+jLib.getRandomNum();
		
			
			HomePage homepage=new HomePage(driver);
			homepage.clickOnOrganizationlink();
			OrganizationPage organizationicon=new OrganizationPage(driver);
			organizationicon.clickOnOrganisationIcon();
			CreateNewOrganization createnewOrganization=new CreateNewOrganization(driver);
			
			createnewOrganization.createOrganisationName(organizationName, industryName);
			OganizationValidationPage orgConfirmation=new OganizationValidationPage(driver);
			String Actualtext=orgConfirmation.organizationInformationText();
			if(Actualtext.contains(organizationName))
			{
				System.out.println("organisation  created successfully");
			}
			else {
				System.out.println("organisation not created ");

			}
			//Assert.fail();
			homepage.getContactsLink();
			wlib.waitForElementToBeClickable(driver,homepage.getContactsLink());
			homepage.clickOnContactslink();
			ContactPage contact=new  ContactPage(driver);
			contact.clickContactIcon();
			CreateNewContactPage createNewCon= new CreateNewContactPage(driver);
			createNewCon.enterLastNAme(lastname);
			createNewCon.clickOnorganisationAddIcon();
			OrganizationPopupPAge orgpopup=new OrganizationPopupPAge(driver);
			orgpopup.insertOrganizationName(driver, organizationName);
			createNewCon.toSave(driver);
			String ActualcontactName=createNewCon.getcontactConfirmationText();
			
			if(ActualcontactName.contains(lastname)) {
				
				System.out.println("Contact verification pass");
			}
			else {
				System.out.println("Contact verification fails");

			}
}}
