public class Pattern1 {
    public static void main(String[] args) {
        int n = 5; // Maximum number in each line

        // Loop for printing the pattern
        for (int i = 1; i <= 5; i++) {
            if (i % 2 != 0) {
                // Odd lines: 12345
                for (int j = 1; j <= n; j++) {
                    System.out.print(j); // Print numbers from 1 to 5
                }
            } else {
                // Even lines: 54321
                for (int j = n; j >= 1; j--) {
                    System.out.print(j); // Print numbers from 5 to 1
                }
            }
            System.out.println(); // New line ke liye
        }
    }
}