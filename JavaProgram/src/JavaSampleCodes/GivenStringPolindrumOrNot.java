package JavaSampleCodes;

import java.util.Scanner;

public class GivenStringPolindrumOrNot {

	public static void main(String[] args) {

	

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a String:");
		
		String s=scan.next();
		
		String rev="";
		
		scan.close();
		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
			
//		}
	
		char a[]=s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		
		System.out.println("The verse string is:" +rev);
		
		if(s.equals(rev))
		{
		System.out.println("The given string is Polindrum");
		}
		else
		{
			System.out.println("The given string is Not Polindrum");
		}
		
		 
	
//		String s= "Wel#come";
//		
//		System.out.println(s.replace("#", ""));
		
//		String s1= "Wel come";
//		System.out.println(s1.replace(" ", ""));
//		
//		String s2= "abcabcabcabcaaaaabbbbcccaaaa";
//		
//		int count= 'a';
//		
//		System.out.println(s2.length());
//		
//		for(int i=0;i<s2.length();i++);
//		{
//			
//			if((s2.charAt(count))=='a')
//			{
//				count++;
//			}
//		}
		
		
		
		
		
		
				
	}

}
