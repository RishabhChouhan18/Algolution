import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int kthLargest = findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + kthLargest);
    }

    public static int findKthLargest(int[] nums, int k) {
        // Min-heap banate hain
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Array ke elements ko heap me daalte hain
        for (int num : nums) {
            minHeap.add(num);
            // Agar heap ki size k se zyada ho jaye to chhote element ko remove karte hain
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Heap ka top element kth largest hoga
        return minHeap.peek();
    }
}
