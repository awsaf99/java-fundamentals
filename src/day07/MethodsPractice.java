package day07;

public class MethodsPractice {

    // Method without parameters and without a return value
    public static void sayHello() {
        System.out.println("Hello, Java!");
    }

    // Method with a parameter
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method with two parameters
    public static void displaySum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Method that returns an integer
    public static int add(int a, int b) {
        return a + b;
    }

    // Method that returns a double
    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // Method that returns a boolean
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method that returns the square of a number
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        // Calling a method without parameters
        sayHello();

        // Calling a method with a parameter
        greetUser("Ali");

        // Calling a method with multiple parameters
        displaySum(10, 20);

        // Storing a returned value
        int result = add(15, 25);
        System.out.println("Addition result: " + result);

        // Calling a method that returns a double
        double average = calculateAverage(10, 20, 30);
        System.out.println("Average: " + average);

        // Calling a method that returns a boolean
        System.out.println("Is 8 even? " + isEven(8));
        System.out.println("Is 7 even? " + isEven(7));

        // Calling a method that returns the square
        System.out.println("Square of 5: " + square(5));
    }
}