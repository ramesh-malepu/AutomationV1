package JavaSampleCodes;

public class ArrayPro {

	public static void main(String[] args) {

//		int a[] = new int[5];
//		a[0]=100;
//		a[1]=200;
//		a[2]=300;
//		a[3]=400;
//		a[4]=500;
		
		
		int a[]= {100,200,300,400,500,600,700};
		
		System.out.println("Length of array is:" +a.length);
//		System.out.println(a[6]);
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}

}
