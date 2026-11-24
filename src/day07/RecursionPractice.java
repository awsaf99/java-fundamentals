package day07;

public class RecursionPractice {

    // Countdown using recursion
    public static void countdown(int number) {

        // Base case
        if (number <= 0) {
            System.out.println("Done!");
            return;
        }

        System.out.println(number);

        // Recursive call
        countdown(number - 1);
    }

    // Factorial using recursion
    public static int factorial(int number) {

        // Base case
        if (number == 0 || number == 1) {
            return 1;
        }

        // Recursive call
        return number * factorial(number - 1);
    }

    // Sum of numbers from 1 to n using recursion
    public static int sum(int number) {

        // Base case
        if (number <= 0) {
            return 0;
        }

        // Recursive call
        return number + sum(number - 1);
    }

    // Fibonacci sequence using recursion
    public static int fibonacci(int number) {

        // Base cases
        if (number == 0) {
            return 0;
        }

        if (number == 1) {
            return 1;
        }

        // Recursive calls
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    // Reverse countdown
    public static void countUp(int number) {

        // Base case
        if (number <= 0) {
            return;
        }

        countUp(number - 1);

        System.out.println(number);
    }

    public static void main(String[] args) {

        System.out.println("Countdown:");
        countdown(5);

        System.out.println();

        System.out.println("Factorial:");
        System.out.println("5! = " + factorial(5));
        System.out.println("4! = " + factorial(4));

        System.out.println();

        System.out.println("Sum:");
        System.out.println("Sum from 1 to 5 = " + sum(5));
        System.out.println("Sum from 1 to 10 = " + sum(10));

        System.out.println();

        System.out.println("Fibonacci:");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println();

        System.out.println();

        System.out.println("Count up:");
        countUp(5);
    }
}