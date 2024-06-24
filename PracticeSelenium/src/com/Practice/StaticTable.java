package com.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		//Number of rows in a table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		System.out.println("Number of rows in BookTable:"+rows);
		
		//Number of columns in a table
		
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of clos in table:" +cols);
		
		//print specific data from table
		
		//String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[2]")).getText();
		//System.out.println(authorName);

		/*// read the data from all rows and cols
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String values=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(values+ "  ");
			}
			System.out.println();
		} */
		
		//Print the bookname whose author is Mukesh
		
		/*for(int r=2;r<=rows;r++)
		{
			String AuthorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();			
			
			if(AuthorName.equals("Mukesh"))
			{
				String BookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(BookName+ "  "+AuthorName);
			}
		}*/
		
		// Print the total price of books
		int total=0;
		for(int r=2;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();			
			total=total+Integer.parseInt(price);
			
		}	
		System.out.println("Total price of the books:"+total);
	}
	
}


