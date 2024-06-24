package com.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestionsHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");//https://www.bjs.com
		
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("selenium");
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='OBMEnb']//ul//li//div//div[@class=\"pcTkSc\"]//div[@role='option']"));
		
		System.out.println(list.size());
		
		for(int i=0;i<=list.size();i++)
		{
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("selenium")) 
			{
				list.get(i).click();
				break;
			}
			
		}

	}

}
