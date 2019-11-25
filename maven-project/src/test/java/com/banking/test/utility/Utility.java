package com.banking.test.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void takeScreenshot(WebDriver driver, int TCID) throws IOException {
		String dateFormat = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\AKASH\\eclipse-workspace\\maven-project\\Screenshot\\img_"+TCID+"_"+dateFormat+"jpg");
		FileHandler.copy(source, dest);
	}
	
	public static void getExeclSheetData(int row, int coloumn) {
		String path = "C:\\Users\\AKASH\\Desktop\\Selenium Demo.xlsx";					// EXEL SHEET
	//	FileInputStream file = new FileInputStream(path);
	//	String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	//	System.out.println(value);
		
	}

}
