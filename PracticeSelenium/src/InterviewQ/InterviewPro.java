package InterviewQ;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterviewPro {
	
	/*static void selectDateOfBirth(WebDriver driver,String year,String month)
	{
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("")).getText();
		}
	}*/

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div[@class='form-group'][1]//input")).sendKeys("ramesh");
		driver.findElement(By.xpath("//div[@class='form-group'][2]//input")).sendKeys("ramesh.malepu@gmail.com");
		driver.findElement(By.xpath("//div[@class='form-group'][3]//input")).sendKeys("Premalatha@2011!");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		WebElement drop=driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select dropdown=new Select(drop);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		
		WebElement datePicker = driver.findElement(By.xpath("//input[@name='bday']"));
			       
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='1987-08-06';", datePicker);
        Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();

	}	

}
