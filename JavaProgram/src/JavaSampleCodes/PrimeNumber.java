package JavaSampleCodes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=0;
		int count=0;
		Scanner scan = new Scanner(System.in); 
			System.out.println("Enter a Number:");
			num=scan.nextInt();
		
		if(num>1) 
		{ 
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					count++;
			}
			if(count==2) {
				System.out.println("Entered number is Prime Number");
			}
			else {
				System.out.println("Entered number is Not a Prime Number");
			}
		}
		else
		{
			System.out.println("Entered number is not a Prime number");
		}
	}

}
