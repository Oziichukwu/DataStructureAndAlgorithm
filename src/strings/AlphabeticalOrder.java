package strings;

public class AlphabeticalOrder {

    public static boolean checkIfItsInAlphabeticalOrder(String letters) {

        letters = letters.toLowerCase();
        for (int i = 0; i < letters.length() - 1; i++) {
            if (!Character.isLetter(letters.charAt(i)) || !(letters.charAt(i) <= letters.charAt(i + 1))) {
                return false;
            }
        }
        return true;
    }
}

