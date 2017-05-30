package algorithms;
import java.util.*;

public class RecursivePalindrome {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a word that you would like to know is a palindrome or not.");
		String word = scan.next();
		
		if(isPalindrome(word)){
			System.out.println(word + " is a palindrome!");
		} else {
			System.out.println(word + " is not a palindrome!");
		}
		scan.close();
	}
	
	public static String lastCharacter(String input){
		return input.substring(input.length() - 1, input.length());
	}
	
	public static String firstCharacter(String input){
		return input.substring(0, 1);
	}
	
	public static String middleCharacters(String input){
		return input.substring(0 + 1, input.length() - 1);
	}
	
	
	public static boolean isPalindrome(String input){
		if(input.length() == 0 || input.length() == 1){
			return true;
		} else if ( firstCharacter(input).equals(lastCharacter(input))) {
			return isPalindrome(middleCharacters(input));
		} else {
			return false;
		}
	}
}