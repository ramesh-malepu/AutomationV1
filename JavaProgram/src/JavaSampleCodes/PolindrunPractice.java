package JavaSampleCodes;

import java.util.Scanner;

public class PolindrunPractice {

	public static void main(String[] args) {

		int num, revNum=0, reminder=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a Number:"); 
		
		num = scan.nextInt();
					
		scan.close();
		
		int OrginalNum=num;
		
		while(num>0)
		{
			reminder=num%10;
			num=num/10;
			revNum=(revNum*10)+reminder;
			
		}
		if(OrginalNum==revNum)
		{
			System.out.println("Entered number is a Polindrum");
		}else
		{
			System.out.println("Entered number is not a Polindrum");

		}
		
	}

}
