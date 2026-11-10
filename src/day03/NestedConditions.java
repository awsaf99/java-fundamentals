package day03;

import java.util.Scanner;
public class NestedConditions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter attendance percentage: ");
        int attendance = scanner.nextInt();

        System.out.print("Do you have special permission? (yes/no): ");
        String permission = scanner.next();

        boolean hasPermission = permission.equalsIgnoreCase("yes");
        // Nested condition
        if (attendance >= 75) {
            System.out.println("Eligible for exam");
        } else {
            if (hasPermission) {
                System.out.println("Eligible with special permission");
            } else {
                System.out.println("Not eligible for exam");
            }
        }

        // Flattened condition
        if (attendance >= 75 || hasPermission) {
            System.out.println("Flat: Eligible for exam");
        } else {
            System.out.println("Flat: Not eligible for exam");
        }

        scanner.close();
    }
}
