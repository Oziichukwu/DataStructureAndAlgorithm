package math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FactorialTest {

    @Test
    public void performFactorial(){

        int number = 5;

        int expected = 120;

        int actual = Factorial.performFactorial(number);

        assertEquals(expected, actual);
    }
}
