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
public class ActiTimeHomePage {	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginButton;
	public ActiTimeHomePage(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}	
	public void sendUsename(String data) {
		if(username.isDisplayed())
		{
			username.sendKeys(data);
		}
	}	
	public void sendPassword(String data) {
		if(password.isDisplayed())
		{
			password.sendKeys(data);
		}
	}
	public void clickLogin() {
		if(loginButton.isDisplayed()) 
		{
			loginButton.click();
		}
	}
}