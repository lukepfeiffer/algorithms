package algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void createArrayTest() {
		int [] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int [] actualArray = BinarySearch.createArray(10);
		assertArrayEquals( expectedArray, actualArray );
	}
	
	public void searchTest(){ 
		int [] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int expectedNumGuesses = 1;
		int actualNumGuesses = BinarySearch.search(array, 5);
		
		assertEquals(expectedNumGuesses, actualNumGuesses);
	}	
}