package day04;

import java.util.Scanner;
public class ForLoopPractice {

    public static void main(String[] args){
        //print the negative numbers till n
        int n = 20;
        for(int i = 0; i <= n; i++){
            if((i&1)==1){
                System.out.println(i);
            }
        }
    }
}
