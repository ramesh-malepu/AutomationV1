package JavaSampleCodes;

import java.util.Scanner;

public class IsPolindromeNum {

	public static void main(String[] args) {
		int num, revNum=0, reminder;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number is:");
		num = s.nextInt();
		int OrgNum=num;
	while(num!=0) {
		reminder=num%10;
		num=num/10;
		revNum=(revNum*10)+reminder;
		
	}
	
	if(OrgNum==revNum) {
		
		System.out.println(OrgNum+ " number is Polindrum" );
	}else {
		System.out.println(OrgNum+ " number is not Polindrum");
			
		}
	}
	
	}


