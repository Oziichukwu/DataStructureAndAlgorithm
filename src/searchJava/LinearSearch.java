package searchJava;

public class LinearSearch {

    public static int searchNumber(int [] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target)
                return i;
        }
        return -1;
    }
}