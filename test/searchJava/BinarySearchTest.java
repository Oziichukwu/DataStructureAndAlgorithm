package searchJava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {
    @Test
    public void test_CanFindIndexUsingBinarySearch() {
        int [] numbers = {2,3,4,5,6,7,8,9,12,13};
        int target = 14;
        assertEquals(-1, BinarySearch.searchNumber(numbers,target));
    }
}
