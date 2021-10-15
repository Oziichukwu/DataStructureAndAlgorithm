package arrayTasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SecondLargestTest {

    @Test

    public void secondLargestNumberInAnArray(){

        int [] numbers = {5,6,2,7,8,11,21};
        assertEquals(11, SecondLargest.secondLargest(numbers));
    }
}
