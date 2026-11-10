package day02;

public class VariablesPractice {
    public static void main(String[] args){
        int studentAge = 22; //camelCase
        double accountBalance = 150.35;
        String firstName = "Syed";
        {
            int blockScoped = 10; //only works inside the block
            System.out.println(blockScoped);
        }
        // System.out.println(blockScoped); // compile error ,out of scope
        int a = 5;
        int b = a; //copies the value
        a = 95;
        System.out.println(a + " " + b);
        System.out.printf("a = %d, b = %d%n", a, b); //c style printing

    }
}
