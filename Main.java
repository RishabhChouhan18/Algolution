class MaxHeap{
    private int[] heap;
    private int size;
    private int capacity;

   
    public MaxHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    
    public void insert(int element) {
        if (size >= capacity) {
            System.out.println("Heap is full");
            return;
        }
        heap[size] = element; 
        size++; 
        heapifyUp(size - 1); 
    }

    
    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2; 
            if (heap[index] > heap[parentIndex]) {
                // Swap karo
                int temp = heap[index];
                heap[index] = heap[parentIndex];
                heap[parentIndex] = temp;
                index = parentIndex; 
            } else {
                break; 
            }
        }
    }

   
    public int removeMax() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1; 
        }
        int max = heap[0]; 
        heap[0] = heap[size - 1]; 
        size--; 
        heapifyDown(0); 
        return max; 
    }

   
    private void heapifyDown(int index) {
        while (index < size) {
            int leftChild = 2 * index + 1; 
            int rightChild = 2 * index + 2; 
            int largest = index;

            
            if (leftChild < size && heap[leftChild] > heap[largest]) {
                largest = leftChild;
            }
            if (rightChild < size && heap[rightChild] > heap[largest]) {
                largest = rightChild;
            }

            if (largest != index) {
              
                int temp = heap[index];
                heap[index] = heap[largest];
                heap[largest] = temp;
                index = largest; 
            } else {
                break; 
            }
        }
    }

    
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
