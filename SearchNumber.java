
import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Define the size of the array
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};  // You can modify the array if needed

        // Take the number to be searched as input
        System.out.println("Enter the number to search:");
        int target = scanner.nextInt();

        // Variable to store the index of the first occurrence
        int index = -1;

        // Loop through the array to find the number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;  // Store the index of the first occurrence
                break;      // Exit the loop after finding the first occurrence
            }
        }

        // Output the result
        if (index != -1) {
            System.out.println("The number " + target + " is found at index " + index + ".");
        } else {
            System.out.println("The number " + target + " is not found in the array.");
        }

        // Close the scanner
        scanner.close();
    }
}
