package JavaSampleCodes;

class AA1
{
	int a=100;
	void display()
	{
		System.out.println(a);
	}
}

class BB1 extends AA1
{
	int b=300;
	void show()
	{
		System.out.println(b);
	}
}

class C extends BB1
{
	int c=500;
	void print()
	{
		System.out.println(c);
	}
}

class D1 extends C
{
	int d=600;
	void m()
	{
		System.out.println(d);
	}
	
}

public class MjultiLevelInheritance {

	public static void main(String[] args) {
		
		D1 ob =new D1();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
		ob.display();
		ob.show();
		ob.print();
		ob.m();

	}

}
