package algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursionFactorialTest {

	@Test
	public void factorialTest() {
		int expectedResult = 1;
		int actualResult = RecursionFactorial.factorial(0);
		assertEquals(expectedResult, actualResult);
		
		expectedResult = 2;
		actualResult = RecursionFactorial.factorial(2);
		assertEquals(expectedResult, actualResult);
		
		expectedResult = 6;
		actualResult = RecursionFactorial.factorial(3);
		assertEquals(expectedResult, actualResult);
		
		expectedResult = 24;
		actualResult = RecursionFactorial.factorial(4);
		assertEquals(expectedResult, actualResult);
		
		expectedResult = 120;
		actualResult = RecursionFactorial.factorial(5);
		assertEquals(expectedResult, actualResult);
		
		expectedResult = 720;
		actualResult = RecursionFactorial.factorial(6);
		assertEquals(expectedResult, actualResult);
	}

}
