package algorithms;

public class InsertionSort {
	public static void main(String args[]) {
		int arraySize = 20;
		int[] array = AlgorithmsHelper.createRandomArray(arraySize-1);
		
		System.out.println("Unsorted: " + AlgorithmsHelper.arrayToString(array));

		sort(array);
		
		System.out.println("Sorted: " + AlgorithmsHelper.arrayToString(array));
	}

	public static int[] sort(int[] array) {
		int i; // the number of items sorted so far
		int key; // the item to be inserted
		int j;

		for (i = 1; i < array.length; i++){
		    for (j = i; j > 0 && array[j-1] > array[j]; j--){
		        key = array[j];
		        array[j] = array[j-1];
		        array[j-1] = key;
		    }
		}
		
		return array;
	}
}