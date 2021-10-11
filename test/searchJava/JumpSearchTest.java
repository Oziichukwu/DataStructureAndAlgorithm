package searchJava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JumpSearchTest {

    @Test
    public void test_CanFindElementAtIndex(){

        int [] numbers = {2,3,4,5,6,7,8,9};
        int target = 3;
        assertEquals(1, JumpSearch.performJumpSearch(numbers,target));
    }
}
