// set-3 Quetion no. 2
import java.util.*;

public class SubarrayOR {

    
    public static int calculateSubarrayOR(int[] arr) {
        int n = arr.length;
        Set<Integer> orResults = new HashSet<>();

         
        for (int i = 0; i < n; i++) {
            int currentOR = 0;

            for (int j = i; j < n; j++) {
                currentOR |= arr[j]; 
                orResults.add(currentOR); 
            }
        }

        int finalOR = 0;
        for (int orValue : orResults) {
            finalOR |= orValue;
        }

        return finalOR; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = calculateSubarrayOR(arr);

        System.out.println("The OR of all subarrays' ORs is: " + result);
    }
}
