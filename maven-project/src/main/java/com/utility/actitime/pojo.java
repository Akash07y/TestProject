
package com.utility.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pojo{
	
	static WebDriver driver2;
	
	public static WebDriver OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Automation Class\\chromedriver.exe");
		driver2 = new ChromeDriver();
		driver2.get("http://127.0.0.1/login.do");
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver2;
	}
}








