package JavaSampleCodes;

import java.util.Scanner;

public class CountOfCharacterOccuranceInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String str= sc.nextLine();
		int tot_len=str.length();
		int aft_remo_len=str.replace("j","").length();
		int count_occ=tot_len-aft_remo_len;
		
		System.out.println("Count of character occurance is:" +count_occ);
		
		
	}

}
