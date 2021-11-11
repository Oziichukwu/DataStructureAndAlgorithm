package queueImpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class QueueTest {
        Queue queue;

    @BeforeEach
    void setUp(){
        queue = new Queue(5);
    }

    @Test
    void testThatQueueCanBeCreated(){
        assertNotNull(queue);
    }

    @Test
    void testThatQueueHasAMaximumSize(){

        assertEquals(5, queue.getMaximumSize());
    }

    @Test
    void enQueueMethodAddsValuesToTheEndOfTheQueue() throws Exception {

        queue.enQueue(23);
        queue.enQueue(13);
        queue.enQueue(53);
        assertFalse(queue.isFull());
        assertEquals(3, queue.size());
    }

    @Test
    void deQueueMethodRemovesItemsFromTheFrontOfTheQueue() throws Exception {

        queue.enQueue(23);
        queue.enQueue(43);
        queue.enQueue(93);
        assertEquals(3, queue.size());

        assertEquals(23, queue.deQueue());
        assertEquals(2, queue.size());
    }

    @Test
    void peekMethodReturnsTheItemAtTheTopOfTheQueue() throws Exception {

        queue.enQueue(21);
        queue.enQueue(14);
        queue.enQueue(12);

        assertEquals(21, queue.peek());

        queue.deQueue();

        assertEquals(14, queue.peek());
    }

    @Test
    void queueThrowsExceptionWhenAnAttemptIsMadeToAddToTheQueueWhenItIsFull() throws Exception {

        queue.enQueue(45);
        queue.enQueue(34);
        queue.enQueue(11);
        queue.enQueue(12);
        queue.enQueue(13);

        Assertions.assertThrows(Exception.class, () -> queue.enQueue(30));
    }

    @Test
    void queueThrowsExceptionWhenAnAttemptIsMadeToRemoveFromAnEmptyQueue(){

        Assertions.assertThrows(Exception.class, ()-> queue.deQueue());
    }
}
