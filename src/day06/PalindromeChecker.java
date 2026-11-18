
package day06;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Create StringBuilder and reverse the word
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();

        // Convert StringBuilder to String
        String reversed = sb.toString();

        // Check palindrome
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        scanner.close();
    }
}
