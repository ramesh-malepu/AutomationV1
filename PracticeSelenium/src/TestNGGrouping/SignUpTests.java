package TestNGGrouping;

import org.testng.annotations.Test;

public class SignUpTests {
	
	@Test(priority=1,groups= {"Regression"})
	void SignUpByEmail()
	{
		System.out.println("This is signup by email..");
	}
	
	@Test(priority=2,groups= {"Regression"})
	void SignUpByLinkedIn()
	{
		System.out.println("This is signup by LinkedIn..");
	}
	@Test(priority=3,groups= {"Regression"})
	void SignUpByIndeed()
	{
		System.out.println("This is signup by Indeed..");
	}

}
