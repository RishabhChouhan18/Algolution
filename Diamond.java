public class Diamond {
    public static void main(String[] args) {
        int n = 5; // Half diamond ki height

        // Upper half diamond
        for (int i = 1; i <= n; i++) {
            // Spaces print karna
            for (int j = n; j > i; j--) {
                System.out.print(" "); // Space print karte hain
            }
            // Stars print karna
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Star print karte hain
            }
            // New line ke liye
            System.out.println();
        }

        // Lower half diamond
        for (int i = n - 1; i >= 1; i--) {
            // Spaces print karna
            for (int j = n; j > i; j--) {
                System.out.print(" "); // Space print karte hain
            }
            // Stars print karna
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Star print karte hain
            }
            // New line ke liye
            System.out.println();
        }
    }
}