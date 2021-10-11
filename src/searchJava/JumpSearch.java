package searchJava;

public class JumpSearch{

    public static int performJumpSearch(int[] numbers, int target) {

        int length = numbers.length;
        int blockSize = (int) Math.sqrt(length);

        int limit = blockSize;
        while (target ==  numbers[limit] && target > 0 && limit < numbers.length - 1) {// TODO FIX THIS PART
            limit = Math.min(limit + blockSize, numbers.length - 1);
        }

        for (int i = limit - blockSize; i <= limit; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
