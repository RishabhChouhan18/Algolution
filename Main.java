class MaxHeap{
    private int[] heap;
    private int size;
    private int capacity;

    // Constructor to initialize the heap
    public MaxHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // Method to insert an element into the heap
    public void insert(int element) {
        if (size >= capacity) {
            System.out.println("Heap is full");
            return;
        }
        heap[size] = element; // Element ko end me daal do
        size++; // Size ko badhao
        heapifyUp(size - 1); // Sahi position par le jao
    }

    // Method to heapify up
    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2; // Parent ka index
            if (heap[index] > heap[parentIndex]) { // Agar current element parent se bada hai
                // Swap karo
                int temp = heap[index];
                heap[index] = heap[parentIndex];
                heap[parentIndex] = temp;
                index = parentIndex; // Ab index ko parent par le jao
            } else {
                break; // Agar sahi position par aa gaya toh break karo
            }
        }
    }

    // Method to remove the maximum element from the heap
    public int removeMax() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1; // Agar heap khali hai toh -1 return karo
        }
        int max = heap[0]; // Sabse bada element
        heap[0] = heap[size - 1]; // Last element ko root par le aao
        size--; // Size ko kam karo
        heapifyDown(0); // Sahi position par le jao
        return max; // Max element return karo
    }

    // Method to heapify down
    private void heapifyDown(int index) {
        while (index < size) {
            int leftChild = 2 * index + 1; // Left child ka index
            int rightChild = 2 * index + 2; // Right child ka index
            int largest = index;

            // Dekho kaunsa child bada hai
            if (leftChild < size && heap[leftChild] > heap[largest]) {
                largest = leftChild;
            }
            if (rightChild < size && heap[rightChild] > heap[largest]) {
                largest = rightChild;
            }

            if (largest != index) {
                // Swap karo
                int temp = heap[index];
                heap[index] = heap[largest];
                heap[largest] = temp;
                index = largest; // Ab index ko largest par le jao
            } else {
                break; // Agar sahi position par aa gaya toh break karo
            }
        }
    }

    // Method to print the heap
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}

// Main class to test the MaxHeap
  public class Main {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10); // Heap ka size 10
        maxHeap.insert(15);
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(30);
        maxHeap.insert(25);

        System.out.println("Heap elements:");
        maxHeap.printHeap(); // Heap ke elements print karo

        System.out.println("Removed max: " + maxHeap.removeMax()); // Max element remove karo
        System.out.println("Heap after removing max:");
        maxHeap.printHeap(); // Heap ke elements print karo
    }
}