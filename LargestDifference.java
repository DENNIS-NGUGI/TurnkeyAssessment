package codewars.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers (separated by spaces): ");
        String input = scanner.nextLine();
        String[] numStrings = input.split("\\s+");

        // Convert the input strings to integers and store them in a list
        List<Integer> numbers = new ArrayList<Integer>();
        for (String numString : numStrings) {
            numbers.add(Integer.parseInt(numString));
        }

        // Find the largest difference in the list
        int largestDifference = findLargestDifference(numbers);
        System.out.println("Largest difference: " + largestDifference);
        scanner.close();
    }

    public static int findLargestDifference(List<Integer> numbers) {
        int minNum = numbers.get(0); // Initialize minimum number to the first element
        int maxDiff = 0; // Initialize the maximum difference to 0

        // Iterate through the list starting from the second element
        for (int currentNum : numbers) {
            int diff = currentNum - minNum;

            // Update the maximum difference if a larger difference is found
            maxDiff = Math.max(maxDiff, diff);

            // Update the minimum number if a smaller number is found
            minNum = Math.min(minNum, currentNum);
        }

        return maxDiff;
    }
}


