package sortJava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    @Test
    public void testThatBubbleSortCanBePerformedSortOnNumbers(){


        int [] array = {5,8,2,5,4,-9,34,11,78};

        assertArrayEquals(new int[] {-9,2,4,5,5,8,11,34,78}, BubbleSort.performSort(array));
    }

    @Test
    public void testThatSortCanBePerformedOnLetters(){

        char [] letters = {'f','e','d','c','b','a'};

        assertArrayEquals(new char[]{'a','b','c','d','e','f'}, BubbleSort.performSort2(letters));
    }
}
