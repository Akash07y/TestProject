package com.banking.testscript;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.banking.actitime.ActiTimeHomePage;
import com.banking.actitime.ActiTimeFirstPage;
import com.utility.actitime.pojo;
public class TestClass extends pojo {
	//create Global variable 
	WebDriver driver;
	ActiTimeHomePage ActiTimeHomePage;
	ActiTimeFirstPage ActiTimeFirstPages;
	@BeforeClass					// Execute only once in class at starting
	public void beforeClass() {
		driver = OpenBrowser();
		ActiTimeHomePage = new ActiTimeHomePage(driver);	
		ActiTimeFirstPages = new ActiTimeFirstPage(driver);

	}
	@BeforeMethod					//Execute before every @Test (every test)
	public void beforeMethode() {
	
		ActiTimeHomePage.sendUsename("admin");
		ActiTimeHomePage.sendPassword("manager");
		ActiTimeHomePage.clickLogin();
	}
	@Test										// Test Case
	public void toVerifyActiTimeLogin() throws InterruptedException {
		Reporter.log("test 1 runnimg", false);
		SoftAssert soft = new SoftAssert();
		System.out.println("Verify ActiTime Login");
		Thread.sleep(3000);
		String s = ActiTimeFirstPages.checkPageTile();
		System.out.println(s);
		soft.assertEquals("actiTIME - Enter Time-Tr", s, "pass");
		System.out.println("Hard Assest done");
//		if(s=="actiTIME - Enter Time-Track")
//		{
//			System.out.println("Verification Complete");
//		}
//		else {
//			System.out.println("Verification Failed");
//			 }
	}
	@Test
	public void toVerifyTasksButton() {
		
		boolean result = ActiTimeFirstPages.verifyTaskTab();
		if(result == true) {
			System.out.println("result is " + result);
		}
	}
	@AfterMethod				//Execute after every @Test (every test)
	public void afterMethode(){
		ActiTimeFirstPages.ClickOnLogout();
	}
	@AfterClass						// Execute only once in class at ending
	public void afterClas() {
		
		driver.close();
		driver = null;
		ActiTimeHomePage = null;
		ActiTimeFirstPages = null;
	}
}