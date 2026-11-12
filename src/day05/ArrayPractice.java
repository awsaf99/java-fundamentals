package day05;



import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1,2,3,4,5};

        System.out.println("First element :" + numbers[0]);
        System.out.println("Last element :" + numbers[numbers.length-1]);

        int n = scanner.nextInt();

        int[] in = new int[n];
        for(int i = 0; i < n ; i++){
            in[i] = scanner.nextInt();
        }
        System.out.println("Array elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(in[i] + " ");
        }
        scanner.close();
    }
}
