package math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PerfectNumberTest {

    @Test

    public void isPerfectNumberTest(){

        int number = 6;

        assertTrue(PerfectNumber.isPerfectNumber(number));
    }

}
