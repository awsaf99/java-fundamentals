package day01;
import java.util.Scanner;

public class UserInputPractice {

    public static void main(String[] args) {

        //Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your graduation year: ");
        int graduationYear = scanner.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = scanner.nextDouble();

        System.out.print("Are you learning Java? (true/false): ");
        boolean learningJava = scanner.nextBoolean();


        System.out.println("\n===== USER INFORMATION =====");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Graduation Year: " + graduationYear);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Learning Java: " + learningJava);

        scanner.close();
    }
}
