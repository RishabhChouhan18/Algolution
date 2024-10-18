public class HalfDiamond {
    public static void main(String[] args) {
        int n = 5; // Maximum stars in the middle line

        // Upper half pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Star print karte hain
            }
            System.out.println(); // New line ke liye
        }

        // Lower half pattern
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Star print karte hain
            }
            System.out.println(); // New line ke liye
        }
    }
}