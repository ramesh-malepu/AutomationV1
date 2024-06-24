package com.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerAssignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://dummy-tickets.com/buyticket");
		
		driver.findElement(By.xpath("//a[text()='Both']")).click();
		
		
		
		driver.findElement(By.xpath("//input[@name='source[]']//parent::div[class='col-sm-12 p-0 suggestion-container']")).click();
		
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='col-sm-12 p-0 suggestion-container']//input//ul/li"));
		int ele=elements.size();
		System.out.println(ele);
		
	}

}
