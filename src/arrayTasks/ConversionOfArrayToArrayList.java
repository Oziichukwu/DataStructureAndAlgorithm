package arrayTasks;

import java.util.*;

public class ConversionOfArrayToArrayList {

    public static void main(String[] args) {
        // method one
        Integer [] array = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(array);
        System.out.println(list);

        // method two
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1,array);
        System.out.println(list1);

        // method three
        List<Integer> list2 = new ArrayList<>();
        for (int number : array){
            list2.add(number);
        }
        System.out.println(list2);


            Arrays.fill(array,0);
        for (int i = 0; i < array.length; i++) {
            for (int number : list2){
                array[i] = number;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
