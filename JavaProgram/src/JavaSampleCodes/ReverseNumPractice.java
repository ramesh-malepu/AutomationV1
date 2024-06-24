package JavaSampleCodes;

import java.util.Scanner;

public class ReverseNumPractice {

	public static void main(String[] args) {

		int num, revNum=0,reminder=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a Number is num:");
		
		num =scan.nextInt();
		
		scan.close();
		
		while(num>0)
		{
			reminder=num%10;
			num=num/10;
			revNum=(revNum*10)+reminder;
			
		}
		System.out.println("reverse number is:" +revNum);
	}

}
