package day07;

public class MethodOverloading {

    // Adding two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Adding three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Adding two decimal numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // Multiplying two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Multiplying three integers
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Multiplying two decimal numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Displaying a message
    public static void display(String message) {
        System.out.println(message);
    }

    // Displaying a message with a name
    public static void display(String message, String name) {
        System.out.println(message + ", " + name + "!");
    }

    public static void main(String[] args) {

        // Calling overloaded add() methods
        System.out.println("Add two integers: " + add(10, 20));
        System.out.println("Add three integers: " + add(10, 20, 30));
        System.out.println("Add two doubles: " + add(2.5, 3.5));

        System.out.println();

        // Calling overloaded multiply() methods
        System.out.println("Multiply two integers: " + multiply(5, 4));
        System.out.println("Multiply three integers: " + multiply(2, 3, 4));
        System.out.println("Multiply two doubles: " + multiply(2.5, 4.0));

        System.out.println();

        // Calling overloaded display() methods
        display("Welcome to Java");
        display("Welcome", "Ali");
    }
}