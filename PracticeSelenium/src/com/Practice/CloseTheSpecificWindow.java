package com.Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseTheSpecificWindow {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.transport.telangana.gov.in/html/registration.html");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[@alt='Online Services']")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		System.out.println(windowIDs);
		
		for(String winid:windowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(driver.getTitle());
			if(title.equals("VEHICLE REGISTRATION | TRANSPORT DEPARTMENT GOVERNMENT OF TELANGANA - INDIA"))
			{
				driver.close();
			}
		}

	}

}
