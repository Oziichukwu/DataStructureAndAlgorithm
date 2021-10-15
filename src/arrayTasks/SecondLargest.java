package arrayTasks;

public class SecondLargest {

    public static int secondLargest(int [] numbers) {
        int temp;
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[i] > numbers[j])
                {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers[numbers.length-2];
    }

    public static void main(String[] args) {
        int [] numbers = {5,6,2,7,8,11,21};
        System.out.println(secondLargest(numbers));
    }
    }

