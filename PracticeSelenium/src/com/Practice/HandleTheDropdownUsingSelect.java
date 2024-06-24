package com.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTheDropdownUsingSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://way2automation.com/way2auto_jquery/");
		
			
		WebElement CountryDrop=driver.findElement(By.xpath("//select[@name='country']"));
		
		//Using select method
		Select drop=new Select(CountryDrop);
		
//		drop.selectByVisibleText("Guyana");
		
//		drop.selectByValue("Anguilla");
		
//		drop.selectByIndex(5);
		
		//without using select method
		
		List<WebElement> allOptions=drop.getOptions();
		
		for(WebElement option:allOptions) 
		{
			if(option.getText().equals("Guyana"))
			{
				option.click();
			}
		}
		
			
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
