package JavaSampleCodes;

public class CountOfStringsInString {

	public static void main(String[] args) {

		String str="java welcome to java in selenium";
		int count=1;
		int len=str.length();
				
		for(int i=0;i<=len-1;i++)
		{
			
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			{
				//count=count+1;
				count++;
			}
		}
		System.out.println("number strings in a string :" +count);
		
		
	}

}
