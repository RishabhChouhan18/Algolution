import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int kthLargest = findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + kthLargest);
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

       
        return minHeap.peek();
    }
}
/*
import java.util.Arrays;

public class KthLargestElement {
    public static int findKthLargest(int[] arr, int k) { 
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, 7, 2};
        int k = 3;
        int result = findKthLargest(array, k);
        System.out.println("The kth largest element is: " +result);
    }
}*/
