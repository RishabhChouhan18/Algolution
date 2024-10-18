public class PairSumTwoPointers {
    public static String findPairTwoPointer(int[] A, int N, int X) {
        int left = 0;
        int right = N - 1;

        while (left < right) {
            int sum = A[left] + A[right];
            if (sum == X) {
                return "Yes"; // Pair found
            } else if (sum < X) {
                left++; // Move left pointer to the right
            } else {
                right--; // Move right pointer to the left
            }
        }
        return "No"; // No pair found
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 4, 5, 7, 11};
        int N = 6;
        int X = 9;

        System.out.println(findPairTwoPointer(A, N, X)); // Output: Yes
    }
}