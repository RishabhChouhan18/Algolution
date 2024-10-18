import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

      
        int[] numbers = new int[5];

        
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        boolean isPalindrome = true;
        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] != numbers[numbers.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The array is in palindrome order.");
        } else {
            System.out.println("The array is not in palindrome order.");
        }

       
        scanner.close();
    }
}

