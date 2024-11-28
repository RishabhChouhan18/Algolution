// Set 3 quetion 3
public class printMax {


    public static void printMaxInSubArray(int[] arr, int K) {

        for (int i = 0; i <= arr.length - K; i++) {
            int max = arr[i];


            for (int j = i + 1; j < i + K; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            System.out.print(max + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 1, 4, 5};
        int K1 = 3;
        System.out.println("Maximums in each window of size " + K1 + ":");
        printMaxInSubArray(arr1, K1);

        int[] arr2 = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int K2 = 4;
        System.out.println("Maximums in each window of size " + K2 + ":");
        printMaxInSubArray(arr2,K2);

        int[] arr3 = {20, 10, 30};
        int K3 = 1;
        System.out.println("Maximums in each window of size " + K3 + ":");
        printMaxInSubArray(arr3,K3);
    }
}
