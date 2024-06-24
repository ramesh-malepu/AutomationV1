package JavaSampleCodes;

class Test1
{
	void m(int a)
	{
		System.out.println(a);
	}
}

class Test2 extends Test1
{
	void m(int a)
	{
		System.out.println(a*a);
	}
}



public class FinalKeywordMethod {

	public static void main(String[] args) {
		
		Test2 ts=new Test2();
		ts.m(10);

	}

}
