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

        int largestDifference = findLargestDifference(numbers);
        System.out.println("Largest difference: " + largestDifference);
    }

    public static int findLargestDifference(List<Integer> numbers) {
        int size = numbers.size();

        // Return 0 if the list has less than two elements
        if (size < 2) {
            return 0;
        }

        int minNum = numbers.get(0);  // Initialize minimum number to the first element
        int maxDiff = 0;  // Initialize the maximum difference to 0

        // Iterate through the list starting from the second element
        for (int i = 1; i < size; i++) {
            int currentNum = numbers.get(i);
            int diff = currentNum - minNum;

            // Update the maximum difference if a larger difference is found
            if (diff > maxDiff) {
                maxDiff = diff;
            }

            // Update the minimum number if a smaller number is found
            if (currentNum < minNum) {
                minNum = currentNum;
            }
        }

        return maxDiff;
    }
}
