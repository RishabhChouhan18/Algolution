public class Pattern2 {
    public static void main(String[] args) {
        int n = 5; // Size of the pattern

        // Loop for printing the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("1"); // Print 1 for the borders
                } else {
                    System.out.print("0"); // Print 0 for the inside
                }
            }
            System.out.println(); // New line ke liye
        }
    }
}