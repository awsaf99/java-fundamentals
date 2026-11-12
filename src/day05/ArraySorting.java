
package day05;

import java.util.Scanner;
import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Bubble Sort
        int[] bubbleArray = numbers.clone();

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (bubbleArray[j] > bubbleArray[j + 1]) {

                    int temp = bubbleArray[j];
                    bubbleArray[j] = bubbleArray[j + 1];
                    bubbleArray[j + 1] = temp;
                }
            }
        }
        //time complexity n^2

        System.out.println("Bubble Sort: " + Arrays.toString(bubbleArray));

        // Built_in sorting
        int[] sortedArray = numbers.clone();

        Arrays.sort(sortedArray);

        System.out.println("Arrays.sort(): " + Arrays.toString(sortedArray));

        //time complexity n log n

        scanner.close();
    }
}
