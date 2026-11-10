
package day02;

import java.util.Scanner;

public class SalaryCalculator {

    private static final double TAX_RATE = 0.10;

    public static void main(String[] args) {

        String name;
        int hourly_rate, hourWorked;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee name: ");
        name = scanner.nextLine();

        System.out.println("Enter hourly rate :");
        hourly_rate = scanner.nextInt();

        System.out.println("Enter hour worked in this week :");
        hourWorked = scanner.nextInt();

        int extra_time = 0;

        if (hourWorked > 40) {
            extra_time = hourWorked - 40;
            hourWorked = 40;
        }

        int regular_pay = hourWorked * hourly_rate;
        double extra_time_pay = extra_time * (hourly_rate * 1.5);

        double gross_pay = regular_pay + extra_time_pay;
        double tax = gross_pay * TAX_RATE;
        double net_pay = gross_pay - tax;

        System.out.println("Employee name : " + name);
        System.out.println("Hours worked : " + (hourWorked + extra_time));
        System.out.println("Regular hours : " + hourWorked);
        System.out.println("Extra hours : " + extra_time);
        System.out.println("Regular pay : $" + regular_pay);
        System.out.println("Extra time pay : $" + extra_time_pay);
        System.out.println("Gross pay : $" + gross_pay);
        System.out.println("Tax (10%) : $" + tax);
        System.out.println("Net pay : $" + net_pay);

        scanner.close();
    }
}
