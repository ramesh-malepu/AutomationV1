package JavaSampleCodes;

public class StaticKeyword {
	
	static int a=10; //static 
	int b=20; // non-static
	
	static void m1()
	{
		System.out.println("m1 is static method");
	}
	
	void m2()
	{
		System.out.println("m2 is non-static method");
	}
	
	void m3()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	

	public static void main(String[] args) {
		
		
//		System.out.println(a);
//		m1();
		
		StaticKeyword sk=new StaticKeyword();
		
//		System.out.println(sk.b);
//		sk.m2();
		
		sk.m3();
	}

}
