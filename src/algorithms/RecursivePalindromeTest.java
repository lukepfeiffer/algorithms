package algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursivePalindromeTest {

	// Test if the isPalindrome method returns true or false accordingly
	@Test
	public void isPalindromeTest() {
		boolean expected = true;
		boolean results = RecursivePalindrome.isPalindrome("radar");
		assertEquals(expected, results);
		
		expected = false;
		results = RecursivePalindrome.isPalindrome("banana");
		assertEquals(expected, results);
		
		expected = true;
        results = RecursivePalindrome.isPalindrome("x");
		assertEquals(expected, results);
		
		expected = true;
		results = RecursivePalindrome.isPalindrome("");
		assertEquals(expected, results);
		
		expected = true;
		results = RecursivePalindrome.isPalindrome("xyyx");
		assertEquals(expected, results);
		
		expected = false;
		results = RecursivePalindrome.isPalindrome("bigboat");
		assertEquals(expected, results);
		
		expected = false;
		results = RecursivePalindrome.isPalindrome("as");
		assertEquals(expected, results);
		
		expected = false;
		results = RecursivePalindrome.isPalindrome("123");
		assertEquals(expected, results);
		
		expected = true;
		results = RecursivePalindrome.isPalindrome("111");
		assertEquals(expected, results);
		
		expected = true;
		results = RecursivePalindrome.isPalindrome("223322");
		assertEquals(expected, results);
	}
	
	@Test
	public void lastCharacterTest(){
		String expected = "a";
		String actual = RecursivePalindrome.lastCharacter("banana");
		assertEquals(expected, actual);
		
	    expected = "g";
		actual = RecursivePalindrome.lastCharacter("zigzag");
		assertEquals(expected, actual);
		
	    expected = "b";
		actual = RecursivePalindrome.lastCharacter("cob");
		assertEquals(expected, actual);
	}
	
	@Test
	public void firstCharacterTest(){
		String expected = "b";
		String actual = RecursivePalindrome.firstCharacter("banana");
		assertEquals(expected, actual);
		
	    expected = "z";
		actual = RecursivePalindrome.firstCharacter("zigzag");
		assertEquals(expected, actual);
		
	    expected = "c";
		actual = RecursivePalindrome.firstCharacter("cob");
		assertEquals(expected, actual);
	}
	
	@Test
	public void middleCharacterTest(){
		String expected = "trin";
		String actual = RecursivePalindrome.middleCharacters("string");
		assertEquals(expected, actual);
		
		expected = "o";
		actual = RecursivePalindrome.middleCharacters("cob");
		assertEquals(expected, actual);
		
		expected = "omelongstrin";
		actual = RecursivePalindrome.middleCharacters("somelongstring");
		assertEquals(expected, actual);


	}

}
