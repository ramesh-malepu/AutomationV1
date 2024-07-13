package TestNGAnn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	@Test(dataProvider="np")
	void testLogin(String email,String pwd) throws InterruptedException
	{
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	@DataProvider(name="np")
	Object[][] loginData()
	{
		Object data[][]= {
				{"rams1@gmail.com","rams@123"},
				{"raj1@gmail.com","raj@123"},
				{"pavanol123@gmail.com","test@123"},
				{"ramesh1@gmail.com","ramesh@123"}
		};
		return data;
				
	}
}	
