package com.crm.GenericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyzer_Implementation_class implements IRetryAnalyzer {
	
	int count=0;
	int retry_count=5;
	public boolean retry(ITestResult result) {
		
		if(count<retry_count) {
			count++;
			return true;
		}
		return false;
	}
	

}
