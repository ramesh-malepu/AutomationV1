package PageObjectModelPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	//Constructor
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	// Locators
	By Username= By.xpath("//input[@placeholder='Username']");
	By Password= By.xpath("//input[@placeholder='Password']");
	By LginBtn=By.xpath("//button[normalize-space()='Login']");

	// Action Methods
	public void setUserName(String user)
	{
		driver.findElement(Username).sendKeys("user");
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(Password).sendKeys("pwd");
	}
	
	public void ClickOnLogin()
	{
		driver.findElement(LginBtn).click();
	}

}
