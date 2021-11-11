package implementingQueue;

public class QueueQueue {

    private int maximumSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;
    public QueueQueue(int size) {
        this.maximumSize = size;
        queueArray = new int[size];
        front = 0;
        rear = -1;
    }

    public int getMaximumSize() {
        return maximumSize;
    }

    public void enqueue(int itemToAdd) throws Exception{
        if (!isFull()){
            rear++;
            queueArray[rear] = itemToAdd;
            currentSize++;
        }else {
            throw new Exception("Queue is currently full");
        }

    }

    private boolean isFull() {
        return currentSize == maximumSize;
    }

    public int size() {
        return currentSize;
    }

    public int dequeue() throws Exception{
        if(!isEmpty()){
            front++;
            int removedItem = queueArray[front-1];
            currentSize--;
            return removedItem;
        }
        else {
            throw new Exception("Queue is currently empty");
        }
    }

    private boolean isEmpty() {
        if (currentSize == 0){
            return true;
        }
        return false;
    }
}
