package com.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.hits.ac.in/");
		
		driver.findElement(By.xpath("//input[@id='input_1_2']")).clear();
	
		driver.findElement(By.xpath("//input[@id='input_1_2']")).sendKeys("Kirthan");

		driver.findElement(By.xpath("//input[@id='input_1_7']")).clear();
		
		driver.findElement(By.xpath("//input[@id='input_1_7']")).sendKeys("Ramesh");
		
		driver.findElement(By.xpath("//input[@id='input_1_8']")).sendKeys("ramesh@gmail.com");
		
		Select stateDrop=new Select( driver.findElement(By.xpath("//select[@id='input_1_9']")));
		
		stateDrop.selectByVisibleText("Arunachal Pradesh");

	}

}
