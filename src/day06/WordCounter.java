
package day06;

import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take sentence as input
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Remove leading and trailing spaces
        sentence = sentence.trim();

        // Check if sentence is empty
        if (sentence.isEmpty()) {
            System.out.println("Word count: 0");
        } else {

            // Split sentence into words
            String[] words = sentence.split("\\s+");

            // Count words
            int count = words.length;

            System.out.println("Word count: " + count);
        }

        scanner.close();
    }
}
