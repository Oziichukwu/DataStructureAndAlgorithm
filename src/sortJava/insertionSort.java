package sortJava;

public class insertionSort {

    public static void performSort(int[] numbers) {

        for (int currentIndex = 0; currentIndex < numbers.length; currentIndex++) {
            int valueToInsert = numbers[currentIndex];
            int moveIndex = currentIndex;

            while (moveIndex > 0 && numbers[moveIndex-1] > valueToInsert){

                numbers[moveIndex] = numbers[moveIndex-1];

                moveIndex--;
            }
            numbers[moveIndex] = valueToInsert;
        }
    }






public static void doInsertionSort(int [] array, int target){

    for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
                int numberToBeInserted    = array[currentIndex];
                int indexToMove = currentIndex;

                while (indexToMove > 0 && array[currentIndex - 1] > numberToBeInserted){

                    array[indexToMove] = array[currentIndex - 1];

                    indexToMove--;
                }
                array[indexToMove] = numberToBeInserted;
    }
    }
}



























