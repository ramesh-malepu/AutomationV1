package JavaSampleCodes;

import java.util.Scanner;

public class StringIsPolindrome {

	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
		System.out.println("Enter a String:");
		
		String str=scan.next();
		
		String org_str=str;
		
		String rev="";
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		if(org_str.equals(rev)) {
			
			System.out.println("Entered String is a Polindrome");
		}else {
			
			System.out.println("Entered String is not a Polindrome");
		}
			
		}
	}


