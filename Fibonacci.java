package codewars.testing;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter the number of terms: ");
	    int numItems = scanner.nextInt();
	    
	    //Validates the Input data
	    if (numItems < 0) { 
            System.out.println("Error: Number of Items cannot be negative."); //displays Error msg
        } else {
            System.out.println("Fibonacci Sequence up to " + numItems + " Items:");
            for (int i = 0; i < numItems; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }
	    

    // Recursive method to calculate the Fibonacci number at position n
    public static int fibonacci(int n) {
        // Base case: if n is 0 or 1, return n
        if (n <= 1) {
            return n;
        } else {
            // Recursive case: calculate Fibonacci number by summing previous two numbers
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

