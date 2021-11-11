package queueImpl;

public class Queue {

    private final int maximumSize;
    private final int[]queueArray;
    private int frontEnd;
    private int rearEnd;
    private int count;
    public Queue(int size) {
        this.maximumSize = size;
        queueArray = new int[size];
        frontEnd = -1;
        rearEnd = -1;
    }

    public int getMaximumSize() {

        return maximumSize;
    }

    public void enQueue(int itemAdded) throws Exception{
        if (!isFull()){
            if (frontEnd == -1)
                frontEnd = 0;
            rearEnd++;
            queueArray[rearEnd] = itemAdded;
            count++;
        }else
        {
            throw new Exception("Queue is currently full and cannot take more items");
        }
    }

    public boolean isFull() {
        return frontEnd == 0 && rearEnd == maximumSize - 1;
    }

    public int size() {
        return  count;
    }


    public int deQueue() throws Exception{

        if (!isEmpty()){
            int itemToRemove = queueArray[frontEnd];
            if (frontEnd >= rearEnd){
                frontEnd = -1;
                rearEnd = -1;
            }else {
                frontEnd++;
                count--;
            }
            return itemToRemove;
        }else {
            throw new Exception("Queue is currently empty and cannot remove any item");
        }
    }

    public boolean isEmpty() {
        return frontEnd == -1 && rearEnd == -1;
    }

    public int peek() {

        return queueArray[frontEnd];
    }
}
