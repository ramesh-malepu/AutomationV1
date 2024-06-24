package JavaSampleCodes;

public class SumOfElementInArray {

	public static void main(String[] args) {

		int sum=0;
		int a[]= {100,200,300,400,500};
		
		System.out.println("Length of the array:"+a.length);
		
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println(sum);
	}

}
