package strings;

public class ReverseStrings {

    public static String performReverse(String letters) {

        return new StringBuilder(letters).reverse().toString();

    }

    public static String performReverse2(String letter) {

        if (letter == null || letter.isEmpty()){
            return letter;
        }
        char [] character = letter.toCharArray();
        for (int i = 0, j = letter.length()-1; i < j; i++, j--) {
            char temp = character[i];
            character[i] = character[j];
            character[j] = temp;
        }
        return new String(character);
    }
}
