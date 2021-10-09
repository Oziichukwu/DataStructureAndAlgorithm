package arrayTasks;

public class ArrayExercises {


    public static int sumOfElementsInArray(int [] sumArray) {

        int sum = 0;
        for (int number : sumArray) {
            sum += number;
        }
        return sum;
    }

    public static int AverageOfElementsInArray(int[] numbers) {

        int total = sumOfElementsInArray(numbers);
        return  total / 2 ;

    }

    public static int minimumOfElementsInArray(int[] numbers) {

            int minimum = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }

    public static int maximumOfElementsInArray(int[] numbers) {
        int maximum = Integer.MIN_VALUE;
            for (int value : numbers)
                if (value > maximum){
                    maximum = value;
                }
        return maximum;
    }

    public static int minimumPossibleCombinationInArray(int[] numbers) {

        return sumOfElementsInArray(numbers) - maximumOfElementsInArray(numbers);
    }

    public static int maximumPossibleCombinationInArray(int[] numbers) {

        return sumOfElementsInArray(numbers) - minimumOfElementsInArray(numbers);
    }

    public static int[] sortArrayIncrementally(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                    if (numbers[i] > numbers[j]){
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
            }
        }
        return numbers;
    }
}
