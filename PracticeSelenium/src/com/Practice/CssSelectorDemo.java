package com.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.cssSelector("#name")).sendKeys("Ramesh");
		driver.findElement(By.cssSelector("input#email")).sendKeys("ramesh@malepu");
		 
		List<WebElement> we=driver.findElements(By.cssSelector("input.form-control"));
		System.out.println(we.size());
		
		

	}

}
