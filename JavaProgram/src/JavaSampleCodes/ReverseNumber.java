package JavaSampleCodes;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num, revNum = 0, reminder;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number is:");
		
		num=scan.nextInt();
		
		
		
		while(num>0) {
			reminder=num%10;
			num=num/10;
			revNum=(revNum*10)+reminder;
		    }
			System.out.println("reverse number is:" +revNum);
		

	}

}
