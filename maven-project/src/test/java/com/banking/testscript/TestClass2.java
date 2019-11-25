package com.banking.testscript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass2 {
	@Test
	void testExecl() throws  IOException {
	String path = "C:\\Users\\AKASH\\Desktop\\velocity.xlsx";					// EXEL SHEET
	FileInputStream file = new FileInputStream(path);
	String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);
}
}
