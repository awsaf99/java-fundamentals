package day07;

public class Calculator {

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public static double divide(double a, double b) {

        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }

        return a / b;
    }

    // Remainder
    public static double remainder(double a, double b) {

        if (b == 0) {
            System.out.println("Error: Cannot calculate remainder with zero.");
            return 0;
        }

        return a % b;
    }

    // Power
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Returns the larger number
    public static double max(double a, double b) {
        return Math.max(a, b);
    }

    // Returns the smaller number
    public static double min(double a, double b) {
        return Math.min(a, b);
    }

    public static void main(String[] args) {

        double num1 = 20;
        double num2 = 5;

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        System.out.println("--------------------");

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
        System.out.println("Remainder: " + remainder(num1, num2));
        System.out.println("Power: " + power(num1, num2));
        System.out.println("Maximum: " + max(num1, num2));
        System.out.println("Minimum: " + min(num1, num2));

        System.out.println("--------------------");

        // Testing division by zero
        System.out.println("Division by zero: " + divide(10, 0));
    }
}