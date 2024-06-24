package com.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleVerticleSlider {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		Actions act =new Actions(driver);
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		//min slider
		/*WebElement min_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		
		System.out.println(min_slider.getLocation());//(59, 250)

		act.dragAndDropBy(min_slider, 200, 250).perform();
		
		System.out.println(min_slider.getLocation());*/
		
		//max slider
		
		WebElement max_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		
		System.out.println(max_slider.getLocation());//(766, 250)
		
		act.dragAndDropBy(max_slider, -66, 250).perform();
		
		System.out.println(max_slider.getLocation());
		
	}

}
