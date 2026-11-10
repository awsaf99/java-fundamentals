package day02;

public class OperatorsPractice {
    public static void main(String[] args){
        int x = 5, y = 2;
        System.out.println(x * y); //integer multiplication
        System.out.println(x / y); // int/int will result into integer
        System.out.println((double) x / y); //double / int will result into double

        System.out.println(x++); //print 5 then increment
        System.out.println(x);

        int total = 10;
        total += 5;  total *= 2;          // 30
        System.out.println(2 + 3 * 4);    // 14 (precedence)
        System.out.println((2 + 3) * 4);  // 20
    }

}
