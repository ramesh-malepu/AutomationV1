package JavaSampleCodes;

public class SuperKeyword {
	
	
	String color="white";
	
	void eat()
	{
		System.out.println("eating....");
	}
	
}
	class Dog extends SuperKeyword
	
	{
		String color="black";
		
		void display()
		{
			System.out.println(super.color);
			
		}
		
		void eat()
		{
//			System.out.println("eating mutton....");
			super.eat();
		}
		
	}
	
	
	
	
	


