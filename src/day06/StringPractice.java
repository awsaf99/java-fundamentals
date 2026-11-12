
package day06;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("First character: " + name.charAt(0);
        System.out.println("Last character: " + name.charAt(name.length()-1));
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        System.out.println("Substring: " + name.substring(0, 3));
        String trimmedName = name.trim();
        System.out.println("After trim: " + trimmedName);
        System.out.println("Replace: " + name.replace("a", "@"));

        scanner.close();
    }
}
