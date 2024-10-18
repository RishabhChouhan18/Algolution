import java.util.Scanner;
public class  ReversedTheOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array banate hain 7 integers ke liye
        int[] numbers = new int[7];

        // User se 7 integers input lena
        System.out.println("Please enter 7 integers:");
        for (int i = 0; i < 7; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Numbers ka order reverse karna
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        // Reversed numbers ko print karna
        System.out.println("Reversed order of numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // New line ke liye

        scanner.close(); // Scanner ko close karna
    }
}