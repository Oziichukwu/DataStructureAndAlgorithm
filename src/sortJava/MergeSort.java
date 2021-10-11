package sortJava;

public class MergeSort {

    public static void mergeSort(int [] data, int lowestIndex, int highestIndex){

        if (lowestIndex < highestIndex){

            int middleIndex = (lowestIndex + highestIndex) / 2;

            mergeSort(data,lowestIndex,middleIndex);
            mergeSort(data,middleIndex + 1,highestIndex);
            merge(data,lowestIndex,middleIndex,highestIndex);
        }
    }

    private static void merge(int[] array, int lowestIndex, int middleIndex, int highestIndex) {

        // creating temporary sub array

        int [] leftArray = new int[middleIndex-lowestIndex + 1];
        int [] rightArray = new int[highestIndex - middleIndex];

        // copying out sub Array into temporaries

        for (int i = 0; i < leftArray.length; i++) {

            leftArray[i] = array[lowestIndex + i];
            // left array holds left half of our splited array
        }

        for (int i = 0; i < rightArray.length; i++) {

            rightArray[i] = array[middleIndex + i + 1];
            // right array holds the right of our splited array

        }

        // iterators containing current index of temp sub arrays

        int leftIndex = 0;
        int rightIndex = 0;

        // copying from leftArray and rightArray back into array
        for (int i = lowestIndex; i < highestIndex + 1; i++) {

            // if there are still uncopied elements in right array and left array, copy minimum of the two

            if (leftIndex < leftArray.length && rightIndex < rightArray.length){
                if (leftArray[leftIndex] < rightArray[rightIndex]){

                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            else
                if (leftIndex < leftArray.length){
                    // if all elements have been copied from rightarray, copy rest of leftArray
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else if (rightIndex < rightArray.length){
                   // if all elements have been copied from leftArray, copy rest of right Array

                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
        }
    }
}

