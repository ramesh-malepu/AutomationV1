package JavaSampleCodes;

public class WordCount12332 {

	public static void main(String[] args) {

		String str="welcome to java world java oops concepts and welcome to oops";
		String search="java";
		int count=wordCountOccurances(str,search);
		System.out.println("the word '"+search+"' occured "+count+" times");
		
	}
	public static int wordCountOccurances(String str, String search)
	{
		String[] words=str.split(" ");
		int wordCount=0;
		for(String word:words)
		{
			if(word.equals(search))
			{
				wordCount++;
			}
		}
		return wordCount;
	}
	
}
