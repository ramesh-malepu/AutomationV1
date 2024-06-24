package com.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes12 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td[4]//input[@type='checkbox']"));
		
		System.out.println(checkboxes.size());
		
		for(int i=3;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).equals("Product 1"))
			{
			checkboxes.get(i).click();
			}
		}
		/* Pagination
		List<WebElement> check=driver.findElements(By.xpath("//ul[@id='pagination']//li//a"));
		System.out.println("Total no.of pages:"+check.size());
		
		for(int p=1;p<check.size();p++)
		{
			WebElement activepage=driver.findElement(By.xpath("//ul[@id='pagination' ]//li//a[text()='1']"));
			System.out.println("Active Page is:"+activepage.getText());
			activepage.click();
			String pageno=Integer.toString(p+1);
			driver.findElement(By.xpath("//ul[@id='pagination' ]//li//a[text()='"+pageno+"']")).click();
		}*/
		
	}

}
