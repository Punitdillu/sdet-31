package com.Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.reactivex.rxjava3.functions.Action;

public class InsertDatainExcelsheet {
	
	
public static void main(String[] args) throws Throwable, IOException {
	
	FileInputStream fi=new FileInputStream("C:\\Users\\Dell\\Desktop/Product.xlsx");
	Workbook wb=WorkbookFactory.create(fi);
	Sheet sh = wb.getSheet("Sheet1");
	Row row = sh.createRow(3);
	Cell cell = row.createCell(3);
	cell.setCellValue("Punit Ranjan");
	FileOutputStream fo=new FileOutputStream("C:\\Users\\Dell\\Desktop/Product.xlsx");
	wb.write(fo);
	wb.close();
//	WebDriver driver;
//	WebDriverWait wait = new WebDriverWait(driver, 20);
////	wait.until(ExpectedConditions.elementToBeClickable(wb));
	
	
	
}
}
