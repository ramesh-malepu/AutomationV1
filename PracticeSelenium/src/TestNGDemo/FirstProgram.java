package TestNGDemo;
/*
1.Open app
2.login
3.Logout
 */

import org.testng.annotations.Test;

public class FirstProgram {
	@Test(priority=1)
	void OpenApp()
	{
		System.out.println("Open the application....");
	}
	
	@Test(priority=2)
	void Login()
	{
		System.out.println("Login the application...");
	}
	
	@Test(priority=3)
	void Logout()
	{
		System.out.println("Logout the application...");
	}
	
	
	
	

}
