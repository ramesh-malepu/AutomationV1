package PageObjectModelPattern;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	void testLogin()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName("admin");
		lp.setPassword("admin123");
		lp.ClickOnLogin();
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
