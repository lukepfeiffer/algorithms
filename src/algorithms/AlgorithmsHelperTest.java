package algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgorithmsHelperTest {

	@Test
	public void arrayToStringTest() {
		int [] array = { 1, 2, 3, 4, 5, 6};
		String expected = "1 2 3 4 5 6 ";
		String actual = AlgorithmsHelper.arrayToString(array);
		assertEquals(expected, actual);
	}

}
