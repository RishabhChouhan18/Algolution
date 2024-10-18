import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 5 integers
        int[] numbers = new int[5];

        // Take 5 integers as input from the user
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Check if the array is palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] != numbers[numbers.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("The array is in palindrome order.");
        } else {
            System.out.println("The array is not in palindrome order.");
        }

        // Close the scanner
        scanner.close();
    }
}

