package implementingStack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StackStackTest {

        StackStack stack;

    @BeforeEach
    void setUp(){
        stack  = new StackStack(5);
    }

    @Test
    void stackCanBeCreatedTest(){
        assertNotNull(stack);
    }

    @Test
    void stackHasAFixedCapacityTest(){

        assertEquals(5, stack.getMaximumSize());
    }

    @Test
    void stackMethodPushShouldAddItemsToTheTopOfTheStackLikeAPile() throws Exception {

        stack.push(45);
        assertEquals(1, stack.size());
    }

    @Test
    void stackPopMethodShouldRemoveItemsFromTheTopOfTheStack() throws Exception {

        stack.push(23);
        stack.push(13);
        assertEquals(2, stack.size());

        assertEquals(13, stack.pop());

        assertEquals(1, stack.size());
    }

    @Test
    void stackPeekMethodShouldReturnTheItemAtTheTopOfTheStackWithoutAnyModifications() throws Exception {

        stack.push(12);
        stack.push(14);
        stack.push(13);
        assertEquals(3, stack.size());

        assertEquals(13, stack.peek());
    }

    @Test
    void stackMaximumSizeShouldReturnTheTotalNumberOfItemsInTheStack() throws Exception {

        stack.push(12);
        stack.push(19);
        stack.push(18);
        assertEquals(3, stack.size());

        stack.pop();

        assertEquals(2, stack.size());
    }

    @Test
    void stackMethodPushShouldThrowAnExceptionIfAnAttemptIsMadeToAddItemToAFullStack() throws Exception {

        stack.push(18);
        stack.push(17);
        stack.push(45);
        stack.push(5);
        stack.push(7);
        Assertions.assertThrows(Exception.class, () -> stack.push(67));
    }
    @Test
    void stackMethodPopShouldThrowAnExceptionIfAnAttemptIsMadeToRemoveItemsFromAnEmptyStack() throws Exception {

        Assertions.assertThrows(Exception.class, () -> stack.pop());
    }

    @Test
    void searchStackMethod() throws Exception {

        stack.push(11);
        stack.push(90);
        stack.push(45);
        stack.push(23);
        stack.push(12);

        assertEquals(1, stack.search(12));
        assertEquals(4, stack.search(90));
    }

    @Test
    void isFullMethodShouldReturnTrueIfTheStackIsFull() throws Exception {

        stack.push(11);
        stack.push(90);
        stack.push(45);
        stack.push(23);
        stack.push(12);
        assertTrue(stack.isFull());
    }

    @Test
    void isEmptyMethodShouldReturnTrueIfTheStackIsEmpty(){

        assertTrue(stack.isEmpty());
    }
}
