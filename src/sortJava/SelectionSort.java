package sortJava;

public class SelectionSort {


    public static int[] selectionSort(int[] array) {

        int smallIndex = 0;
        int smallestNumber = 0;

        for (int i = 0; i < array.length; i++) {
            smallestNumber = array[i];
            smallIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < smallestNumber) {
                    smallestNumber = array[j];
                    smallIndex = j;
                }
            }

            if (i != smallIndex) {
                array[smallIndex] = array[i];
                array[i] = smallestNumber;
            }
        }
        return array;
    }

    public static  int [] selectionSort2( int array []){

    int smallestNumber = 0;
    int minimumIndex = 0;

        for (int i = 0; i < array.length; i++) {
            smallestNumber = array[i];
            minimumIndex = i;

            for (int j = i+1; j < array.length; j++) {

                if (array[j] < smallestNumber) {
                    smallestNumber = array[j];
                    minimumIndex = j;
                }
            }

            if (i != minimumIndex){
                array[minimumIndex] = array[i];
                array[i] = smallestNumber;
            }
        }
    return array;
    }
}













