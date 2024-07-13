package TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 1.Open Application
 2.Verify Display name
 3.Login
 4.Logout 
 */

public class TestAutomation {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void LaunchApp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://jntuhaac.in/Account/Logon?ReturnUrl=%2fNewOnlineRegistration%2fViewFacultyDetails");
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	public void verifylogo()
	{
		boolean logo=driver.findElement(By.xpath("//img[@alt='JNTU Hyderabad Logo']")).isDisplayed();
		System.out.println("Logo is displayed.." +logo);
	}
	
	@Test(priority=3)
	public void login() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("ramesh.malepu@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("9573437438");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}
	
	@Test(priority=4)
	public void logout() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	
	@Test(priority=5)
	public void closeApp() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}

}
