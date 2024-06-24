package JavaSampleCodes;

public class CountTheWordOccured123 {

	public static void main(String[] args) {
		String str="ramesh ramesh ramesh malepu premalatha kirthan manvitha";
		String searchWord="ramesh";
		int count=wordCountOccuraances1(str,searchWord);
		
		System.out.println("The word '"+searchWord+"' occured "+count+" times");
		

	}

	private static int wordCountOccuraances1(String str, String searchWord) {
		
		String[] words=str.split(" ");
		
		int wcount=0;
		
		for(String w:words)
		{
			if(w.equals(searchWord))
			{
				wcount++;
			}
		}
		return wcount;
		
	}

}
