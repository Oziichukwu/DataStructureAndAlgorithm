package searchJava;

public class BinarySearch {
    public static int searchNumber(int [] numbers, int target) {

        int high = numbers.length-1;
        int low = 0;

        while (low <= high) {
            int midPointNumber = (high + low) /2; //low + ((high - low) / 2);

            if (numbers[midPointNumber] == target)
                return midPointNumber;

            else
                if (numbers[midPointNumber] < target)
                    low = midPointNumber + 1;

                else high = midPointNumber - 1;
        }
        return  -1;
    }
}
