
public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArray(nums);
        System.out.println("Largest sum of subarray: " + maxSum);
    }

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0]; // Sabse pehle element ko maxSoFar set karte hain
        int currentMax = nums[0]; // Current max ko bhi pehle element se shuru karte hain

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]); // Current max ko update karte hain
            maxSoFar = Math.max(maxSoFar, currentMax); // Max so far ko update karte hain
        }

        return maxSoFar; // Final max sum return karte hain
    }
}