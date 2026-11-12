
package day05;

import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Taking matrix input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Printing matrix
        System.out.println("Original Matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Sum of all elements
        int totalSum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                totalSum += matrix[i][j];
            }
        }

        System.out.println("Total Sum: " + totalSum);

        // Row_wise sum
        System.out.println("\nRow_wise Sum:");

        for (int i = 0; i < rows; i++) {

            int rowSum = 0;

            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }

            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        // Column_wise sum
        System.out.println("\nColumn_wise Sum:");

        for (int j = 0; j < cols; j++) {

            int colSum = 0;

            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }

            System.out.println("Column " + (j + 1) + ": " + colSum);
        }

        // Find maximum and minimum
        int maximum = matrix[0][0];
        int minimum = matrix[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] > maximum) {
                    maximum = matrix[i][j];
                }

                if (matrix[i][j] < minimum) {
                    minimum = matrix[i][j];
                }
            }
        }

        System.out.println("\nMaximum: " + maximum);
        System.out.println("Minimum: " + minimum);

        // Matrix transpose
        System.out.println("\nTranspose:");

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
