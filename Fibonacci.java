package codewars.testing;
import java.util.Scanner;

public class Fibonacci {
    private static int[] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numItems = scanner.nextInt();

        // Validates the input data
        if (numItems < 0) {
            System.out.println("Error: Number of items cannot be negative.");
        } else {
            System.out.println("Fibonacci Sequence up to " + numItems + " items:");
            memo = new int[numItems + 1]; // Create an array to store Fibonacci numbers
            for (int i = 0; i < numItems; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        // Check if the Fibonacci number is already computed
        if (memo[n] != 0) {
            return memo[n];
        }

        // Compute the Fibonacci number and store it in the memo array
        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];
    }
}
