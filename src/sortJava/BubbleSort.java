package sortJava;

import java.util.Arrays;

public class BubbleSort {


    public static int[] performSort(int[] array) {

        int temp;
        for (int i = 0; i < array.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = {5, 8, 2, 5, 4, -9, 34, 11, 78};

        BubbleSort.performSort(array);

        System.out.println(Arrays.toString(array));

    }

    public static char[] performSort2(char[] letters) {
            char temp;
        for (int i = 0; i < letters.length-1; i++) {

            boolean swapped = false;
            for (int j = 0; j < letters.length-i-1; j++) {

                if (letters[j] > letters[j+1]){

                    temp = letters[j];
                    letters[j] = letters[j+1];
                    letters[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return letters;
    }
}