package day03;

import java.util.Scanner;
public class IfElsePractice {
    public static void main(String[] args){

        //check even or odd
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input: please enter a whole number.");
            scanner.close();
            return;
        }
        number = scanner.nextInt();

        if ((number & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        //age catagory
        System.out.print("Enter your age: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input: please enter a whole number.");
            scanner.close();
            return;
        }
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Invalid age: cannot be negative");
        } else if (age < 13) {
            System.out.println("Age " + age + ": child");
        } else if (age < 20) {
            System.out.println("Age " + age + ": teen");
        } else if (age < 65) {
            System.out.println("Age " + age + ": adult");
        } else {
            System.out.println("Age " + age + ": senior");
        }

        scanner.close();
    }
}
