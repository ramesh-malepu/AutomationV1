package JavaSampleCodes;

import java.util.Scanner;

public class CountOfSumOdd {

	public static void main(String[] args) {
		
		int num, evenCount=0,oddCount=0;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		num = scan.nextInt();
		
		scan.close();
		
		while(num>0)
		{
		int	x=num%10;
			
			if(x%2==0)
			{
				evenCount++;
			}else
			{
				oddCount++;

			}
			num=num/10;
		}
		System.out.println("Count of even numbers:" + evenCount);
		System.out.println("Count of odd numbers:" + oddCount);

	}

}
