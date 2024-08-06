package JavaSampleCodes;

public class ReverseString1 {

	public static void main(String[] args) {

		String s= "liril";
		
		String rev=" ";
				
		int len=s.length()	;
		
		for (int i=len-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
			
		}
		System.out.println("reverse string is:"+rev);	
				
	
	if (s==rev) {
		System.out.println("Given String is Polindrum");
	}
	else {
		System.out.println("Given String is not Polindrum");
		
	}
}
}
