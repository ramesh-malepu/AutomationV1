package JavaSampleCodes;

public class WordToCountOccurred {

	public static void main(String[] args) {
		String str="Replace \"paragraph\" in the wordToCount variable with the word you want to count occurrences for. This code will count how many times that specific word occurs in the provided paragraph.";
		String wordToCount="in";
		
		int count=wordCountOccurances(str,wordToCount);
		System.out.println("The word '"+wordToCount+"' Occured "+count+" times");

	}
	
	public static int wordCountOccurances(String str,String wordToCount)
	{
		String[] words=str.split(" ");
		int wordCount=0;
		for(String word:words)
		{
			if(word.equals(wordToCount))
			{
				wordCount++;
				
			}
			
		}
		return wordCount;
		
		
		}

}


