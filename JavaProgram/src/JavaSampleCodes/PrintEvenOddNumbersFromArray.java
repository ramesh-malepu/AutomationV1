package JavaSampleCodes;

public class PrintEvenOddNumbersFromArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print("even Numners are:"+a[i]);
			}else
			{
				System.out.print("Odd Numbers are:"+a[i]);
			}
			System.out.println();
		}
			

	}

}
