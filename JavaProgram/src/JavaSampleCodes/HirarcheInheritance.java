package JavaSampleCodes;

class Parent
{
	
	void m(int a)
	{
		System.out.println(a);
	}
}

class Child1 extends Parent
{
	
	void m1(int b)
	{
		System.out.println(b);
	}
}
class Child2 extends Parent
{
	
	void m2(int c)
	{
		System.out.println(c);
		
	}
}



public class HirarcheInheritance {

	public static void main(String[] args) {

		Child1 c1=new Child1();
		
		c1.m(100);
		c1.m1(200);
		
		Child2 c2=new Child2();
		c2.m(300);
		c2.m2(400);
	}

}
