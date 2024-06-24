package com.Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAuthAlert {

	public static void main(String[] args) {
		
				WebDriver driver = new ChromeDriver();
				
				//WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.manage().window().maximize();
				
				driver.get("username:password@https://the-internet.herokuapp.com/basic_auth");
				
				
	}

	
	}
