import java.util.Scanner;
public class  ReversedTheOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int[] numbers = new int[7];

        System.out.println("Please enter 7 integers:");
        for (int i = 0; i < 7; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        
        System.out.println("Reversed order of numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); 

        scanner.close(); 
    }
}
