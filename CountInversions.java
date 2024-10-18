 class CountInversions {


    public static int countInversions(int[] arr) {
        int count = 0; // Inversions ki counting ke liye variable

        // Nested loops ka istemal karke inversions count karte hain
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // Agar arr[i] > arr[j] hai to inversion hai
                    count++; // Count ko increment karte hain
                }
            }
        }

        return count; // Total inversions return karte hain
    }
     public static void main(String[] args) {
         int[] arr = {7, 2, 6, 3};
         int inversionCount = countInversions(arr);
        // System.out.println("Count of inversions: " + inversionCount);
         CountInversions obj1 = new CountInversions();
        int count = obj1.countInversions(arr);
         System.out.println("Number of inversion is : "+count);
     }
}
