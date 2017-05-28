package algorithms;
import java.util.*;

public class BinarySearch {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int arraySize = (int) Math.random() * 101;
		int [] array = createArray(arraySize);
		
		int input = scan.nextInt();
		
		int numGuesses = search(array, input);
		
		System.out.println("The number you guessed was: " + input + "/n and it took the computer " + numGuesses + "guesses!" );
		scan.close();
	}
	
	/*
	 * Returns the number of iterations it took the computer to "guess" the result
	 * Returns -1 if the value is not inside the list
	 * @params int []
	 * 
	 */
	public static int search(int[] array, int userInput){
		int numGuesses = 0;
		int min = 1	;
	    int max = array.length;
	    boolean flag = true;
	    
	    // The array is already sorted, if the number is outside of this range then the value can not exist
	    if (userInput > array.length || userInput < 1){
	    	return -1;
	    }
	    
	    while(flag){
	    	int compGuess = (min + max) / 2;
	    	++numGuesses;

	    	if(compGuess == userInput ){
	    		flag = false;
	    	} else if (compGuess < userInput){
	    		min = compGuess + 1;
	    	} else if (compGuess > userInput){
	    		max = compGuess - 1;
	    	}
	    }
	    
		return numGuesses;
	}
	
	public static int[] createArray(int arraySize){
		int [] array = new int[arraySize];
		
		for(int i = 0; i < arraySize; ++i){
			array[i] = i+1;
		}
		
		return array;
	}
}