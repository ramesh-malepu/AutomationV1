package com.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Pagination {

	private static final Object Product1 = null;

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		 List<WebElement> pages=driver.findElements(By.xpath("//ul[@class='pagination']//li"));
		 int total_numOfPages=pages.size();
		
		 System.out.println(total_numOfPages);
		 System.out.println("ID  " + "  Name  " + "  Price  " + "  Select ");
		 for(int p=1;p<=total_numOfPages;p++) 
		 {
			if(p>1)
			{
			WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//li["+p+"]"));
			active_page.click();
			Thread.sleep(5000);
			}
			
			//read data from table
			int rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			int count=0;
			for(int r=1;r<=rows;r++)
			{
			//List<WebElement> ids=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[1]"));
			WebElement ids=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[1]"));	
			int number=Integer.valueOf(r);
			
			String name=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[2]")).getText();
									
			String price=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[3]")).getText();
			
			WebElement el=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[4]//input"));
			count++;
			el.click();
			//System.out.println(el.isSelected());
			
			/*List<WebElement> elements=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//input"));
			int ele=elements.size();
			System.out.println(ele);
			for(int i=0;i<=ele;i++)
			{
			driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr[\"+i+\"]//td[4]"));
			elements.get(i).click();
			}*/
			
			System.out.println(number+ "\t" +name+ "\t" +price+ "\t" +el.isSelected());
			
			}
			
		}

	}
}


