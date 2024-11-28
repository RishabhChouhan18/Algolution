// Set 3 Quetion 9
import java.util.Scanner;

public class PrintSpiral {
    static void printMatrix(int[][] array, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiral(int matrix[][], int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Print top row
            for (int j = leftCol; j <= rightCol; j++) {
                System.out.print(matrix[topRow][j] + " ");
            }
            topRow++;

            // Print right column
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightCol] + " ");
            }
            rightCol--;

            // Print bottom row
            if (topRow <= bottomRow) {
                for (int j = rightCol; j >= leftCol; j--) {
                    System.out.print(matrix[bottomRow][j] + " ");
                }
                bottomRow--;
            }

            // Print left column
            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    System.out.print(matrix[i][leftCol] + " ");
                }
                leftCol++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows and columns of the matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter " + (r * c) + " elements in the matrix: ");
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        printMatrix(matrix, r, c);
        System.out.println("Spiral order of the matrix is: ");
        printSpiral(matrix, r, c);
    }
}

