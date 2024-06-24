package JavaSampleCodes;

import java.util.Scanner;

public class ReverseString1233 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=sc.nextLine();
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println("The Reverse string is:"+rev);
		
		if(str.equals(rev))
		{
			System.out.println("string is polindrum");
		}
		else
		{
			System.out.println("not polindrum");
		}
	}

}
