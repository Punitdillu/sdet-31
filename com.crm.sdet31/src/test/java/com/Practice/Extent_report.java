package com.Practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.GenericUtility.Base_Class;

@Listeners(com.crm.GenericUtility.Listneres_Implementation_Class.class)
public class Extent_report extends Base_Class {
	@Test
	public void organization() {
		Assert.fail();
		System.out.println("organization created");
	}
	
	@Test
	public void contact() {
		System.out.println("contact created");
	}
	
	@Test(dependsOnMethods = "organization")
	public void product() {
		System.out.println("product created");
	}

}
