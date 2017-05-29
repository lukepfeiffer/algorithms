package algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void sortTestt() {
		int [] array = { 5, 4, 3, 2, 1} ;
		int [] expected = { 1, 2, 3, 4, 5 };
		int [] actual = InsertionSort.sort(array);
		assertArrayEquals(expected, actual);
		
		int [] array2 = {2, 16, 4, 3, 2, 9, 10} ;
		int [] expected2 = { 2, 2, 3, 4, 9, 10, 16};
		int [] actual2 = InsertionSort.sort(array2);
		assertArrayEquals(expected2, actual2);
	}

}
