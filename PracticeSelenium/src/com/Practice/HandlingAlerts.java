package com.Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		//Normal Alert
		/*Alert myalerts=driver.switchTo().alert();
		System.out.println(myalerts.getText());
		myalerts.accept();
		*/
		//Confirmation alert
		
		//driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		//Thread.sleep(5000);
		
     	//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		/*Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		*/
		/*Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.dismiss();
		*/
		// prompt alert
		/*driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("welcome");
		alert.accept();
		*/
		//without using switchTo().alert() and Using explicity wait.
		Alert alert=mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alert.getText());
		alert.accept();
		
		
	}

}
