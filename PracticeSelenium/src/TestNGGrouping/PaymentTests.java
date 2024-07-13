package TestNGGrouping;

import org.testng.annotations.Test;

public class PaymentTests {
	
	@Test(priority=1,groups= {"Sanity","Regression","Functional"})
	void PaymentInRupees()
	{
		System.out.println("This payment in Rupees..");
	}

	@Test(priority=2,groups= {"Sanity","Regression","Functional"})
	void PaymentInDollar()
	{
		System.out.println("This payment in Dollars..");
	}
}
