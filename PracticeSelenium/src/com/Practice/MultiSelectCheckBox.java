package com.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelectCheckBox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect ')]")).click();
		
		//driver.findElement(By.xpath("//input[@value='Java']")).click();//select the option from drop down
		
		List<WebElement> ele=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		
		System.out.println(ele.size());
		
		for(WebElement el:ele)
		{
			System.out.println(el.getText());
			if(el.getText().equals("Java") || el.getText().equals("C#"))
			{
				el.click();
			}
		}
		

	}

}
