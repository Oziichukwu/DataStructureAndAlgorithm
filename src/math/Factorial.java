package math;

public class Factorial {

    public static int performFactorial(int number) {

        if (number < 0){
            throw new IllegalArgumentException("number is negative");
        }

        int factorial = 1;
        for (int i = 1; i <= number; factorial*=i, ++i) {
            ;
        }


        return factorial;
    }
}
