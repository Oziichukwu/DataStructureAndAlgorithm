package sortJava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SelectionSortTest {

    @Test
    public void testThatSelectionSortCanBePerformed(){

        int [] array = {2,9,5,14,8,15,1,46};
        assertArrayEquals(new int[]{1,2,5,8,9,14,15,46}, SelectionSort.selectionSort(array));
    }
}
