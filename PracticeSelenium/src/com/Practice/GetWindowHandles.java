package com.Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GetWindowHandles {

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
		
		//Approach1
		
		/*List<String> list=new ArrayList<String>(windowIDs);
		
		String parentID=list.get(0);
		String childID=list.get(1);
		
		//switch to child window
		driver.switchTo().window(childID);
		System.out.println("Child Window Title is:"+driver.getTitle());
		
		//switch to parent window
		driver.switchTo().window(parentID);
		System.out.println("Parent window Title is:"+driver.getTitle());
		*/
		//Approach2
		for(String winID:windowIDs)
		{
			String title=driver.switchTo().window(winID).getTitle();
			if(title.equals("Welcome To TRANSPORT DEPARTMENT GOVERNMENT OF TELANGANA - INDIA"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		
	}

}
