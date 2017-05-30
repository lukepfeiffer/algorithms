package algorithms;

public class AlgorithmsHelper {
	
	public static String arrayToString(int [] array){
		String returnString = "";
		
		for (int i = 0; i < array.length; ++i) {
			returnString += array[i] + " ";
		}
		
		return returnString;
	}
	
	public static int[] createRandomArray(int size){
		int [] array = new int[size];

		for (int i = 0; i < size; ++i) {
			array[i] = ((int) (Math.random() * 100 + 1));
		}

		return array;
	}
}