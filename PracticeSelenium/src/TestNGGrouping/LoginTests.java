package TestNGGrouping;

import org.testng.annotations.Test;

public class LoginTests {
	
	@Test(priority=1,groups= {"Sanity"})
	void loginByEmail()
	{
		System.out.println("This is login by email..");
	}

	@Test(priority=2,groups= {"Sanity"})
	void loginByLinkedIn()
	{
		System.out.println("This is login by linkedin..");
	}
	@Test(priority=3,groups= {"Sanity"})
	void loginByIndeed()
	{
		System.out.println("This is login by Indeed..");
	}
	
	
}
