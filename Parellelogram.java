public class Parellelogram {
    public static void main(String[] args) {
        int rows = 5; // Parallelogram ki rows ki sankhya
        int columns = 10; // Parallelogram ki columns ki sankhya

        // Outer loop rows ke liye
        for (int i = 0; i < rows; i++) {
            // Spaces print karna
            for (int j = 0; j < i; j++) {
                System.out.print(" "); // Space print karte hain
            }
            // Star print karna
            for (int j = 0; j < columns; j++) {
                System.out.print("*"); // Star print karte hain
            }
            // New line ke liye
            System.out.println();
        }
    }
}