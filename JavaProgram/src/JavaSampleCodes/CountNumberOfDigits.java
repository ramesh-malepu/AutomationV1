package JavaSampleCodes;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		int num;
		int count=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		num=scan.nextInt();
		
		scan.close();
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println("Count of given number is:" +count);
	}

}
