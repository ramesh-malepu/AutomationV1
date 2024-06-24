package com.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions123 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		
		WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
		
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions act=new Actions(driver);//Actions:it is a class and it is used for perform mouse actions
		box1.clear();					//Action:is a interface and it is used for store the created actions
		box1.sendKeys("RAMESH");
		Thread.sleep(5000);
		act.doubleClick(button).perform();
		String text=box2.getAttribute("value");
		System.out.println("Attribute value is:"+text);
		if(text.equals("RAMESH"))
		{
			System.out.println("Value is copied properly..");
		}else
		{
			System.out.println("Value is not copied properly..");
		}

	}

}
