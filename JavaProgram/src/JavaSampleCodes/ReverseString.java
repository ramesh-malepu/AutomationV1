package JavaSampleCodes;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=scan.next();
		String rev="";
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
