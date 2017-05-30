package algorithms;

public class SelectionSort {
	public static void main(String args[]) {
		int[] array = AlgorithmsHelper.createRandomArray(40);

		System.out.print("Original array: " + AlgorithmsHelper.arrayToString(array));
		
		array = sort(array);
		System.out.print("\nSorted array: " + AlgorithmsHelper.arrayToString(array));

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
	
}
