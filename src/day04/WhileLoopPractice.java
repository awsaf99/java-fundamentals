package day04;

import java.util.Scanner;
public class WhileLoopPractice {
    public static void main(String[] args){
        //enter the test case
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();

        int tn = 1;
        while (tc-- > 0){
            System.out.println("Test case number :" + tn);
            tn++;
        }

    }
}
