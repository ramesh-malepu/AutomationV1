package JavaSampleCodes;

public class ToCountHowManyTimesSingleWordOccursInString {

	public static void main(String[] args) {
		String str="ramesh ramesh malepu malepu kirthan manvitha manvitha premalatha ramesh kirthan";
		String wordToCount="kirthan";
		
		int count=countWordOccurances(str,wordToCount);
		System.out.println("The word  '"+wordToCount+"' occured "+count+" times");
		
	}
	
	public static int countWordOccurances(String str, String wordToCount)
	{
		String[] words = str.split(" ");

        int wordCount = 0;
        // Count occurrences of the specified word
        for (String word : words) {
            if (word.equals(wordToCount)) {
                wordCount++;
            }
        }

        return wordCount;
		 
	}

}
