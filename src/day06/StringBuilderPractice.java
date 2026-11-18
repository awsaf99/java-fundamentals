package day06;

import java.util.Scanner;

public class StringBuilderPractice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name :");
        String name = scanner.nextLine();

        StringBuilder sb = new StringBuilder(name);

        System.out.println("\nOriginal StringBuilder: " + sb);

        // append() Adds text at the end
        sb.append(" Awsaf");

        System.out.println("After append(): " + sb);


        // insert() Inserts text at a specific index
        sb.insert(0, "Mr. ");

        System.out.println("After insert(): " + sb);


        // replace() Replaces characters between indexes
        // End index is exclusive
        sb.replace(0, 3, "Dr.");

        System.out.println("After replace(): " + sb);


        // 5. delete() - Deletes characters between indexes
        // End index is exclusive
        sb.delete(0, 4);

        System.out.println("After delete(): " + sb);


        // charAt() Gets a character at an index
        System.out.println("Character at index 0: " + sb.charAt(0));


        // setCharAt() Changes a character at an index
        sb.setCharAt(0, 'A');

        System.out.println("After setCharAt(): " + sb);


        // length()  Returns the current number of characters
        System.out.println("Length: " + sb.length());


        // capacity()  Returns current buffer capacity
        System.out.println("Capacity: " + sb.capacity());


        //  indexOf() Finds the first occurrence of text
        System.out.println("Index of 'a': " + sb.indexOf("a"));


        // substring()  Extracts part of the text
        System.out.println("Substring: " + sb.substring(0, 3));


        // 12. reverse() - Reverses the contents
        sb.reverse();

        System.out.println("After reverse(): " + sb);


        // 13. deleteCharAt() - Deletes a character at an index
        sb.deleteCharAt(0);

        System.out.println("After deleteCharAt(): " + sb);


        // 14. Ensure capacity
        sb.ensureCapacity(50);

        System.out.println("Capacity after ensureCapacity(): " + sb.capacity());


        // 15. Convert StringBuilder to String
        String result = sb.toString();

        System.out.println("Converted String: " + result);

        scanner.close();
    }
}
