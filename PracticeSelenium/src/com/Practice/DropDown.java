package com.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement Countrydrop=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drop=new Select(Countrydrop);
		
		//drop.selectByVisibleText("Canada");
		
		List<WebElement> options=drop.getOptions();
		
		System.out.println("Dropdown size is:"+options.size());
		
		/*for(int i=0;i<=options.size();i++)
		{
			 String str=options.get(i).getText();
			 System.out.println(str);
		}*/
		
		for(WebElement option:options)
		{
			if(option.getText().equals("Canada"))
			{
				option.click();
			}
		}

	}

}
