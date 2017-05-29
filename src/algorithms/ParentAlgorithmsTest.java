package algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParentAlgorithmsTest {

	@Test
	public void arrayToStringTest() {
		int [] array = { 1, 2, 3, 4, 5, 6};
		String expected = "1 2 3 4 5 6 ";
		String actual = ParentAlgorithms.arrayToString(array);
		assertEquals(expected, actual);
	}

}
