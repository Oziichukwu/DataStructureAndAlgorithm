package stackImpl;

public class Stack {

    private final int maximumSize;
    private final int[] stackArray;
    private int topOfStack;

    public Stack(int size) {
        this.maximumSize = size;
        stackArray = new int[size];
        topOfStack = - 1;
    }

    public int getMaximumSize() {
        return maximumSize;
    }

    public void push(int valueAdded) throws Exception{
        if (!isFull()){
            stackArray[topOfStack + 1] = valueAdded;
            topOfStack++;
        }else
        {
            throw new Exception("Stack is currently full and cannot push more items");
        }
    }

    public boolean isFull() {
        int maximumValueInStack = maximumSize - 1;
        if (topOfStack == maximumValueInStack){
            return true;
        }
        return false;
    }

    public int size() {

        return topOfStack + 1;
    }

    public int pop() throws Exception{
        if (!isEmpty()){
            int valueToRemove = stackArray[topOfStack];
            stackArray[topOfStack] = 0;
            topOfStack--;
            return valueToRemove;
        }else{
            throw  new Exception("Stack is currently empty and cannot remove more items");
        }
    }

    public boolean isEmpty() {
        if (topOfStack == -1){
            return true;
        }
        return false;
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
        }else {
            return index;
        }
    }

    private int[] reverseArray(int[] array, int arrayLength) {

        int [] reversedArray = new int[arrayLength];
        int limit = array.length;
        for (int i = 0; i < arrayLength; i++) {
            reversedArray[limit-1] = array[i];
            limit -= 1;
        }
        return reversedArray;
    }

    public int peek() {
        return stackArray[topOfStack];
    }
}
