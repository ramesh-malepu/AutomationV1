package com.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//Expected input date
		String year="2026";
		String month="April";
		String date="29";
		
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//month
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//year
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//next
		}
		
		//select Date
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
				
			}
		}
	}

}
