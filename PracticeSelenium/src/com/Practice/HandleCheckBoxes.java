package com.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		 System.out.println(checkboxes.size());
		 
		 //using normal for loop and select all checkboxes.
		 for(int i=0; i<=checkboxes.size();i++)
		 {
			 checkboxes.get(i).click();
		 }
		 
		 //using nested for loop select all check boxes.
		 /*for(WebElement checkbox:checkboxes)
		 {
			checkbox.click(); 
		 }*/
		 // select starting 3 checkboxes
		/* for (int i=0;i<3;i++) 
		 {
			 checkboxes.get(i).click();
		 }
		 Thread.sleep(5000);
		 
		 for(int i=0; i<checkboxes.size();i++)
		 {
			 if(checkboxes.get(i).isSelected())
			 {
			 checkboxes.get(i).click();
			 }
		 }
		 
		 */
		 //sarting index=total size of index- count of selected checkboxes(from last) 
		 //select last 3 checkboxes ex:total checkboxes are 7 - select last 3 checkboxes=starting index.
		 //7-3=4
		 /*for(int i=4;i<checkboxes.size();i++)
		 {
			 checkboxes.get(i).click();
		 }*/
		 
//		 driver.close();
		
	}

}
