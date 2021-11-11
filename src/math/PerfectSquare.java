package math;

public class PerfectSquare {


    public static boolean isPerfectSquare(int number) {

        int squareRoot = (int)Math.sqrt(number);

        return squareRoot * squareRoot == number;
    }
}
