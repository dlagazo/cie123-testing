/**
 * 
 * @author dlagazo
 * This class implements  word processor functions e.g. word count, character count, vowel/consonant count 
 * and sentence count.
 */
public class WordProcessor {
	
	/**
	 * 
	 * @param text The set of characters to count
	 * @return The number of characters
	 */
	static int characterCount(String text)
	{
		return text.length();
		
	}
	
	/**
	 * 
	 * @param text The set of characters to count
	 * @return The number of words in the text
	 */
	
	static int wordCount(String text)
	{
		String[] allWords = text.split(" ");
		return allWords.length;
	}
	
	/**
	 * 
	 * @param text The set of characters to count
	 * @return The number of consonants in the text
	 */
	
	static int consonantCount(String text)
	{
		return 0;
	}
	
	/**
	 * 
	 * @param text The set of characters to count
	 * @return The number of vowels in the text
	 */
	
	static int vowelCount(String text)
	{
		int count = 0;
		for(int i = 0; i < text.length(); i++)
		{
			System.out.println(text.charAt(i));
			switch(text.charAt(i))
			{
			case 'A':
				count++;
				break;
			case 'E':
				count++;
				break;
			case 'I':
				count++;
				break;
			case 'O':
				count++;
				break;
			case 'U':
				count++;
				break;
				case 'a':
					count++;
					break;
				case 'e':
					count++;
					break;
				case 'i':
					count++;
					break;
				case 'o':
					count++;
					break;
				case 'u':
					count++;
					break;
			}
		}
		return count;
			
	}
	
}
