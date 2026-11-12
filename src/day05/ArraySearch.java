package day05;

import java.util.Scanner;
import java.util.Arrays;
public class ArraySearch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] vv = new int[n];

        for(int i = 0; i < n; i++){
            vv[i] = scanner.nextInt();
        }
        int element = scanner.nextInt();
        //linear search
        for(int i = 0; i < n ; i++){
            if(vv[i] == element){
                System.out.println("Element found on index no :\n" + (i+1));
                break;
            }
            if(i==(n-1)){
                System.out.println("Not found\n");
            }
        }

        // Sort the array
        Arrays.sort(vv);

        System.out.println("Sorted Array: " + Arrays.toString(vv));

        int left = 0;
        int right = n - 1;
        int result = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (vv[mid] == element) {

                result = mid;
                break;

            } else if (vv[mid] < element) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        scanner.close();


    }
}
