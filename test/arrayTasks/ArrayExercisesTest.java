package arrayTasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayExercisesTest {
    ArrayExercises arrayExercises;

    @BeforeEach
    void setUp(){
        arrayExercises = new ArrayExercises();
    }
    @Test
    public void testThatArrayCanSumElememts(){

        int [] numbers = {2,3,4,5,6};
        assertEquals(20, ArrayExercises.sumOfElementsInArray(numbers));
    }

    @Test
    public void testThatArrayCanGetAverageOfElememts(){

        int [] numbers = {2,3,4,5,6};
        assertEquals(10, ArrayExercises.AverageOfElementsInArray(numbers));
    }

    @Test
    public void getMinimumOfArrayTest(){

        int [] numbers = {2,3,4,5,6};
        assertEquals(2, ArrayExercises.minimumOfElementsInArray(numbers));
        System.out.println(ArrayExercises.minimumOfElementsInArray(numbers));
    }
    @Test
    public void getMaximumOfArrayTest(){

        int [] numbers = {2,3,4,5,6};
        assertEquals(6, ArrayExercises.maximumOfElementsInArray(numbers));
    }

    @Test
    public void getMinimumPossibleCombinationTest(){

        int [] numbers = {2,3,4,5,6};
        assertEquals(14, ArrayExercises.minimumPossibleCombinationInArray(numbers));
    }

    @Test
    public void getMaximumPossibleCombinationTest(){

        int [] numbers = {2,3,4,5,6};
        assertEquals(18, ArrayExercises.maximumPossibleCombinationInArray(numbers));
    }

    @Test
    public void sortArrayIncrementallyTest(){

        int [] numbers = {12,3,4,-5,6,9,-3,33};
        int [] sortedArray = ArrayExercises.sortArrayIncrementally(numbers);
        assertEquals(-5, sortedArray[0]);
        assertEquals(-3, sortedArray[1]);
        assertEquals(3, sortedArray[2]);
        assertEquals(4, sortedArray[3]);
        assertEquals(33, sortedArray[sortedArray.length-1]);
    }
}

