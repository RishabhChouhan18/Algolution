public class EquilibriumIndex {
    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;

        // Step 1: Total sum calculate karna
        for (int num : arr) {
            totalSum += num;
        }

        // Step 2: Equilibrium index check karna
        for (int i = 0; i < arr.length; i++) {
            // Right sum calculate: totalSum - leftSum - arr[i]
            if (leftSum == (totalSum - leftSum - arr[i])) {
                return i + 1; // 1-based index
            }
            leftSum += arr[i]; // Update left sum
        }

        return -1; // Agar koi equilibrium index nahi mila
    }

    public static void main(String[] args) {
        int[] arr1 = {-7, 1, 5, 2, -4, 3, 0};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 3, 5, 2, 2};

        System.out.println(findEquilibriumIndex(arr1)); // Output: 4
        System.out.println(findEquilibriumIndex(arr2)); // Output: -1
        System.out.println(findEquilibriumIndex(arr3)); // Output: 2
    }
}