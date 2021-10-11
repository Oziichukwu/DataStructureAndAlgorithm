package sortJava;

public class MergerSort {

    public void performMergesort(int [] array, int lowestIndex, int highestIndex){

        if (lowestIndex < highestIndex){

            int midIndex = (lowestIndex + highestIndex) / 2;

            performMergesort(array, lowestIndex,midIndex);
            performMergesort(array, midIndex+ 1, highestIndex);
            merge(array, lowestIndex,midIndex,highestIndex);
        }

    }

    private void merge(int[] array, int lowestIndex, int midIndex, int highestIndex) {

        int [] leftArray = new int[midIndex - lowestIndex + 1];
        int [] rightArray = new int[highestIndex - lowestIndex];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[lowestIndex + i];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[midIndex + i + 1];
        }

        int leftIndex = 0;
        int rightindex = 0;

        for (int i = lowestIndex; i < highestIndex + 1; i++) {

            if (leftIndex < leftArray[leftIndex] && rightindex < rightArray[rightindex]){

                if (leftArray[leftIndex] < rightArray[rightindex]){

                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightindex];
                }
            }
            else
                if (leftIndex < leftArray.length){
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else if (rightindex < rightArray.length){
                    array[i] = rightArray[rightindex];
                    leftIndex++;
                }
        }

    }
}
