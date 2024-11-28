// set 3 quetion 10
import java.util.Arrays;

public class MinimumProduct {
    public static void main(String[] args) {

        int[] array = {198, 76, 544, 123, 154, 675};
        int k = 2;


        int minProduct = findMinimumProduct(array, k);
        System.out.println("Minimum product of " + k +" integers: " + minProduct);
    }

    public static int findMinimumProduct(int[] arr, int k) {
        Arrays.sort(arr);

        int product = 1;
        for (int i = 0; i < k; i++) {
            product *= arr[i];
        }
        return product;
    }
}