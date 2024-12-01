public class UniqueNumbers {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 1, 6, 7, 5};
        printUniqueNumbers(numbers);
    }

    public static void printUniqueNumbers(int[] arr) {
        System.out.println("Unique Numbers:");


        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;


            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(arr[i]);
            }
        }
    }
 }
