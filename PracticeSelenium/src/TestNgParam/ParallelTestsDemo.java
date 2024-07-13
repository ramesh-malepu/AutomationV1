package TestNgParam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestsDemo {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br, String url) throws InterruptedException
	{
		switch(br.toLowerCase())
		{
		case "chrome":driver = new ChromeDriver();
		break;
		case "edge":driver=new EdgeDriver();
		break;
		default:System.out.println("Invalid browser name:");
		return;
		}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get(url);
	Thread.sleep(3000);	
	}
	
	@Test(priority=1)
	void testlogo()
	{
	boolean img_status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	Assert.assertEquals(img_status,true);
	}
	
	@Test(priority=2)
	void testTitle()
	{
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");	
	}
	@Test(priority=3)
	void testUrl()
	{
	Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
