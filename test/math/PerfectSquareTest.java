package math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PerfectSquareTest {

    @Test

    public void isAPerfectSquare(){

        int number = 49;

        assertTrue( PerfectSquare.isPerfectSquare(number));
    }
}
