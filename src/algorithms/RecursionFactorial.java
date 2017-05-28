package algorithms;
import java.util.*;

public class RecursionFactorial {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you would like to factorial: ");
		
		int arguement = scan.nextInt();
		int result = factorial(arguement);
		System.out.println("The factorial for: " + arguement + " is: " + result );
		scan.close();
	}
	
	public static int factorial(int n){
		if(n == 1 || n == 0){
			return 1;
		}
		
		return n * factorial(n-1);
	}
}