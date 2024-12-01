public class CountFrequency {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 1, 6, 7, 5};
        countFrequency(numbers);
    }

    public static void countFrequency(int[] arr) {
        int n = arr.length;
        boolean[] counted = new boolean[n];

        System.out.println("Frequency of each number:");

        for (int i = 0; i < n; i++) {

            if (!counted[i]) {
                int count = 1;

                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(arr[i] + ": " + count);
            }
        }
    }
}