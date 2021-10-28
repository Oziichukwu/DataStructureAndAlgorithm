package math;

public class PrimeNumber {

    public static boolean isPrimeNumber(int number) {
        if (number == 2){
            return true;
        }else
            if (number < 2 || number % 2 == 0){
                return false;
            }
        for (int i = 3, limit = (int)Math.sqrt(number); i < limit; i+=2) {

            if (number % i == 0){
                return false;
            }
        }
        return  true;
    }
}
