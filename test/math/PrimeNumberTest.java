package math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PrimeNumberTest {

    @Test

    public void isPrimeNumber(){

        int number = 7;

        assertTrue(PrimeNumber.isPrimeNumber(number));
    }
}
