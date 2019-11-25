/**
 * 
 */
/**
 * @author AKASH
 *
 */
package com.banking.actitime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ActiTimeFirstPage {
	@FindBy(xpath = "//title[text()='actiTIME - Enter Time-Track']")
	private WebElement header;
	
	@FindBy(xpath = "//table[@id='topnav']/tbody/tr/td[5]//img")
	private WebElement taskButton;
	
	@FindBy(xpath = "//a[text() = 'Logout']")
	private WebElement logOut;
	
	WebDriver driver;
	
	public ActiTimeFirstPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	public String checkPageTile() {
		String title = driver.getTitle();
		return title;
	}
	public void ClickOnLogout() {
		logOut.click();
	}
	public boolean verifyTaskTab() {
		boolean result = taskButton.isEnabled();
		
		return result;
	}
}
