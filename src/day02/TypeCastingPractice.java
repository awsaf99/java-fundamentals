package day02;

public class TypeCastingPractice {

    public static void main(String[] args) {

        //Widening (implicit casting
        int whole = 10;
        double widened = whole;

        System.out.println("Widened: " + widened);


        //Narrowing (explicit casting)
        double price = 9.99;
        int truncated = (int) price; // Removes decimal, does not round

        System.out.println("Truncated: " + truncated);


        //Integer overflow
        int big = Integer.MAX_VALUE;
        System.out.println("Integer Overflow: " + (big + 1));


        //Byte narrowing
        byte small = (byte) 200; // Byte range: -128 to 127
        System.out.println("Byte Casting: " + small);


        // 5. Floating point precision
        System.out.println("Floating-Point: " + (0.1 + 0.2));


        // 6. Float to integer
        float percentage = 85.75f;
        int wholePercentage = (int) percentage;

        System.out.println("Percentage: " + wholePercentage);


        // 7. Integer to long
        int population = 1000000;
        long largePopulation = population;

        System.out.println("Population: " + largePopulation);


        // 8. Character to integer
        char letter = 'A';
        int characterCode = letter; // Unicode value of A

        System.out.println("Character Code: " + characterCode);


        // 9. Rounding instead of truncation
        double score = 89.75;
        int roundedScore = (int) Math.round(score);

        System.out.println("Rounded Score: " + roundedScore);
    }
}