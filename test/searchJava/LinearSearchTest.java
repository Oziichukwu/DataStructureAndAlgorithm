package searchJava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LinearSearchTest {

    @Test
    public void test_CanSearchForTheIndexLinearSearch(){

        int [] numbers = {2,3,4,5,6,7,8,9,19,12};

        int target = 8;
        assertEquals(6,LinearSearch.searchNumber(numbers,target));
    }

}
