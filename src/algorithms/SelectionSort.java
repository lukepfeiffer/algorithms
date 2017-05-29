package algorithms;

public class SelectionSort {
	public static void main(String args[]) {
		int[] array = createArray(40);

		System.out.print("Original array: " + arrayToString(array));
		
		array = sort(array);
		System.out.print("\nNewly sorted array: " + arrayToString(array));

	}
	
	public static int[] createArray(int size){
		int [] array = new int[size];

		for (int i = 0; i < size; ++i) {
			array[i] = ((int) (Math.random() * 100 + 1));
		}

		return array;
	}
	
	public static int[] sort(int[] array){
		int length = array.length;
		int temp;
		
		for (int i = length - 1; i > 0; --i) {
			int first = 0;

			for (int j = 1; j <= i; ++j) {
				if (array[j] < array[first]) {
					first = j;
				}
				temp = array[first];
				array[first] = array[i];
				array[i] = temp;
			}

		}
		return array;
	}
	
	
	public static String arrayToString(int [] array){
		String returnString = "";
		
		for (int i = 0; i < array.length; ++i) {
			returnString += array[i] + " ";
		}
		
		return returnString;
	}
}
