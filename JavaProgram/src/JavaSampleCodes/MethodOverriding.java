package JavaSampleCodes;


	
	class Bank12
	{
		double roi()
		{
			return 0;
		}
	}
	
	class ICICI extends Bank12
	{
		double roi()
		{
			return 10.5;
		}
	}
	
	class SBI extends Bank12
	{
		double roi()
		{
			return 15.5;
		}
	}
	
	
	
	public class MethodOverriding {
	

	public static void main(String[] args) {
		
		
		ICICI ic=new ICICI();
		System.out.println(ic.roi());
		
		SBI sb = new SBI();
		System.out.println(sb.roi());
		

	}

}
