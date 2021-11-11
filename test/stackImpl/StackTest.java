package stackImpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StackTest {
    Stack stack;
    @BeforeEach
    void setUp(){
        stack = new Stack(5);
    }
    @Test
    void stackCanBeCreatedTest(){
        assertNotNull(stack);
    }

    @Test
    void stackCanHaveAMaximumValueTest(){

        assertEquals(5, stack.getMaximumSize());
    }

    @Test
    void stackPushMethodAddValueToTheTopOfTheStack() throws Exception {
        stack.push(10);
        assertFalse(stack.isFull());
        assertEquals(1, stack.size());
    }

    @Test
    void stackPopMethodRemoveValuesFromTheTopOfTheStackTest() throws Exception {
        stack.push(20);
        stack.push(23);
        assertEquals(2, stack.size());
        assertEquals(23, stack.pop());
        assertEquals(1, stack.size());
    }

    @Test
    void stackMaximumGetsTheTotalValuesInTheStackTest() throws Exception {
        stack.push(34);
        stack.push(54);
        stack.push(84);
        assertEquals(3, stack.size());
    }

    @Test
    void stackThrowsExceptionWhenAnAttemptIsMadeToPushIntoAFullStackTest() throws Exception {
        stack.push(45);
        stack.push(11);
        stack.push(42);
        stack.push(15);
        stack.push(25);
        Assertions.assertThrows(Exception.class,() -> stack.push(23));
    }

    @Test
    void stackThrowsExceptionWhenAnAttemptIsMadeToPopFromAnAlreadyEmptyStackTest(){

        Assertions.assertThrows(Exception.class, () -> stack.pop());
    }

    @Test
    void stackSearchMethod() throws Exception {

        stack.push(45);
        stack.push(15);
        stack.push(34);
        stack.push(40);
        stack.push(50);
        assertEquals(1, stack.search(50));
        assertEquals(4, stack.search(15));
    }

    @Test
    void stackPeekMethodReturnsTheItemAtTheTopOfTheStack() throws Exception {

        stack.push(34);
        stack.push(30);
        stack.push(21);
        assertEquals(3, stack.size());
        assertEquals(21, stack.peek());
        stack.push(12);
        stack.pop();
        assertEquals(21, stack.peek());

    }

}
