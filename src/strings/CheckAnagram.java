package strings;

import java.util.Arrays;

public class CheckAnagram {

    public static boolean checkIfTheyAreAnagram(String letter1, String letter2){

        letter1 = letter1.toLowerCase();
        letter2 = letter2.toLowerCase();

        char [] character1 = letter1.toCharArray();
        char[] character2 = letter2.toCharArray();

        Arrays.sort(character1);
        Arrays.sort(character2);
        return new String(character1).equals(new String(character2));
    }
}
