package implementingStack;

public class StackStack {

    private int maximumSize;
    private int [] stackArray;
    private int topOfStack;
    private int currentSize;

    public StackStack(int size) {
        this.maximumSize = size;
        stackArray = new int[size];
        topOfStack = -1;
    }

    public int getMaximumSize() {
       return maximumSize;
    }

    public void push(int itemToAdd) throws Exception{
        if (!isFull()){
            stackArray[topOfStack + 1] = itemToAdd;
            topOfStack++;
            currentSize++;
        }else {
            throw new Exception("Stack is currently full and cannot add more items");
        }
    }

    public boolean isFull() {
        return currentSize == maximumSize;
    }

    public int size() {
        return currentSize ;
    }

    public int pop() throws Exception{

        if (!isEmpty()){
            int itemToRemove = stackArray[topOfStack];
            stackArray[topOfStack] = 0;
            topOfStack--;
            currentSize--;
            return itemToRemove;
        }else {
            throw new Exception("Stack is currently empty");
        }

    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int peek() {

        return stackArray[topOfStack];
    }

    public int search(int itemToSearch) {

        boolean itemFound = false;
        int [] reversedStackArray = reverseArray(stackArray, stackArray.length);
        int index = -1;

        for (int i = 0; i < reversedStackArray.length; i++) {
            if (reversedStackArray[i] == itemToSearch){
                index = i;
                itemFound = true;
            }
        }
        if (itemFound){
            return index + 1;
        }
        return index;
    }

    private int[] reverseArray(int[] stackArray, int arrayLength) {

        int [] reversedArray = new int[arrayLength];
        int limit = stackArray.length;
        for (int i = 0; i < arrayLength; i++) {
            reversedArray[limit-1] = stackArray[i];
            limit -=1;
        }
        return reversedArray;
    }


}
