package day03;

import java.util.Scanner;
public class LoginValidation {
    public static final String correctUsername = "awsaf99";
    public static final String correctPassword = "@1236548";

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int maxAttempts = 3;

        boolean isLoggedIn = false;

        while (attempts < maxAttempts && !isLoggedIn) {

            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {

                System.out.println("Login successful!");
                isLoggedIn = true;

            } else if (!username.equals(correctUsername) && !password.equals(correctPassword)) {

                System.out.println("Incorrect username and password.");

            } else if (!username.equals(correctUsername)) {

                System.out.println("Incorrect username.");

            } else {

                System.out.println("Incorrect password.");
            }

            if (!isLoggedIn) {
                attempts++;
                System.out.println("Attempts remaining: " + (maxAttempts - attempts));
            }

            System.out.println();
        }

        if (!isLoggedIn) {
            System.out.println("Account locked. Maximum attempts exceeded.");
        }

        scanner.close();
    }
}
