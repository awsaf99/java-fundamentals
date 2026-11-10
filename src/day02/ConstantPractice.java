package day02;

public class ConstantPractice {
    public static final double TAX_RATE = 0.08; //accessible from other classes and package
    private static final int p = 5000; //accessible only inside the class

    public static void main(String[] args){
        System.out.println(((int)(TAX_RATE*100)) + "%");
        //TAX_RATE = 1.02; // error ,cannot reassign a final variable
    }
}
