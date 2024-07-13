package JavaSampleCodes;

public class ReverseStringCombinationOfNumerics {

	public static void main(String[] args) {
		String input = "ramesh123malepu";
        String reversed = reverseStringWithoutNumeric(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseStringWithoutNumeric(String input) {
        // Separate alphabets and numbers
        StringBuilder alphabets = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (char c : input.toCharArray()) 
        {
            if (Character.isAlphabetic(c)) {
                alphabets.append(c);
            } else if (Character.isDigit(c)) {
                numbers.append(c);
            }
        }

        // Reverse alphabets
        alphabets.reverse();

        // Combine reversed alphabets with numbers
        StringBuilder result = new StringBuilder();
        int alphaIndex = 0, numIndex = 0;

        for (char c : input.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                result.append(alphabets.charAt(alphaIndex++));
            } else if (Character.isDigit(c)) {
                result.append(numbers.charAt(numIndex++));
            }
        }

        return result.toString();
	}

}
