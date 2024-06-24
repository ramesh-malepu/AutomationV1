package JavaSampleCodes;

import java.util.Scanner;

public class ReverseStringMethodOne {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter String:");
		
		String str=scan.next();
		
		String rev="";
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			
				
		}
		
		System.out.print("Reverse string is:" +rev);
		
	}

}
