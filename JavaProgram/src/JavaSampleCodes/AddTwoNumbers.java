package JavaSampleCodes;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		int num1; int num2 = 0; 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number value num1:");
		num1 =scan.nextInt();
		
		System.out.println("Enter the number value num2:");
		num2=scan.nextInt();
		
		int sum=num1+num2;
		
		System.out.println("sum of two number is:" +sum);
		
		

	}

}
