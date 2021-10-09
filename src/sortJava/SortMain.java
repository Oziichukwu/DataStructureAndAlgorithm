package sortJava;

import java.security.SecureRandom;
import java.util.Arrays;

public class SortMain {

    public static void main(String[] args) {

        int [] numbersToSort = new int[20];

        SecureRandom mySecureRandom = new SecureRandom();

        for (int i = 0; i < numbersToSort.length; i++) {

            numbersToSort[i] = 10 + mySecureRandom.nextInt(90);

        }
        System.out.println("These numbers are unsorted" + Arrays.toString(numbersToSort));

        insertionSort.performSort(numbersToSort);

        System.out.println("These numbers are now sorted" + Arrays.toString(numbersToSort));

        System.out.println();
        System.out.println("This is a merge sort application");

        for (int i = 0; i < numbersToSort.length; i++) {

            numbersToSort[i] = 10 + mySecureRandom.nextInt(90);

        }
        System.out.println("unsorted numbers" + Arrays.toString(numbersToSort));

        MergeSort.mergeSort(numbersToSort,0, numbersToSort.length-1);
        System.out.println("sorted elements" + Arrays.toString(numbersToSort));

    }

}
