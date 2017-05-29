package algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void sortTest() {
		int [] array = { 1, 2, 55, 22, 2, 2, 9, 0 };
		int [] expected = { 55, 22, 9, 2, 2, 2, 1, 0 };
		int [] actual = SelectionSort.sort(array);
		assertArrayEquals(expected, actual);
		
		int [] array2 = { -5, -2, 4, 3, 2, 1, 10 };
		int [] expected2 = { 10, 4, 3, 2, 1, -2, -5 };
		actual = SelectionSort.sort(array2);
		assertArrayEquals(expected2, actual);
	}

}
