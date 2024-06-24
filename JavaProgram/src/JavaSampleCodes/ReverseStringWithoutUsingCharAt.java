package JavaSampleCodes;

import java.util.Scanner;

public class ReverseStringWithoutUsingCharAt {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter String:");
		
		String str=scan.next();
		String rev="";
		
		char a[]= str.toCharArray();
		
		scan.close();
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse number is:" +rev);
	}

}
