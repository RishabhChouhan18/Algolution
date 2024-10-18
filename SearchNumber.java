
import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        /
        Scanner scanner = new Scanner(System.in);

       
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80}; 
        
        System.out.println("Enter the number to search:");
        int target = scanner.nextInt();

       
        int index = -1;

       
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;  
                break;      
            }
        }

        
        if (index != -1) {
            System.out.println("The number " + target + " is found at index " + index + ".");
        } else {
            System.out.println("The number " + target + " is not found in the array.");
        }

        
        scanner.close();
    }
}
