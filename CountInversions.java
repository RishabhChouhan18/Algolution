 class CountInversions {


    public static int countInversions(int[] arr) {
        int count = 0; 

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++; 
                }
            }
        }

        return count; 
    }
     public static void main(String[] args) {
         int[] arr = {7, 2, 6, 3};
         int inversionCount = countInversions(arr);
        
         CountInversions obj1 = new CountInversions();
        int count = obj1.countInversions(arr);
         System.out.println("Number of inversion is : "+count);
     }
}
