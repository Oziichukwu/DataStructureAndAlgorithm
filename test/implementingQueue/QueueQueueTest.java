package implementingQueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class QueueQueueTest {

    QueueQueue queue;

    @BeforeEach
    void setUp(){
        queue = new QueueQueue(5);
    }

    @Test
    void queueCanBeCreatedTest(){
        assertNotNull(queue);
    }
    @Test
    void queueCanHaveMaximumSizeTest(){
        assertEquals(5, queue.getMaximumSize());
    }
    @Test
    void queueMethodEnqueueShouldAddItemToTheRearOfTheQueue() throws Exception {

        queue.enqueue(14);
        assertEquals(1, queue.size());
    }

    @Test
    void queueMethodDequeueShouldRemoveItemFromTheFrontOfTheQueue() throws Exception {
        queue.enqueue(15);
        queue.enqueue(21);
        queue.enqueue(51);
        queue.enqueue(90);
        queue.enqueue(8);

        assertEquals(15, queue.dequeue());
        assertEquals(21, queue.dequeue());
        queue.dequeue();
        assertEquals(2, queue.size());
  }
  @Test
    void queueMaximumSizeReturnsTheSizeOfTheQueue() throws Exception {
      queue.enqueue(51);
      queue.enqueue(90);
      queue.enqueue(8);

      assertEquals(3, queue.size());
  }

  @Test
    void queueMethodEnqueueThrowsExceptionWhenAnAttemptIsMadeToAddToAFullQueue() throws Exception {

        queue.enqueue(45);
        queue.enqueue(89);
        queue.enqueue(67);
        queue.enqueue(15);
        queue.enqueue(35);
      Assertions.assertThrows(Exception.class, ()->queue.enqueue(45));
  }

  @Test
    void queueMethodDequeueThrowsExceptionWhenAnAttemptIsMadeToRemoveFromAnEmptyQueue(){

        Assertions.assertThrows(Exception.class, ()-> queue.dequeue());
  }
}

