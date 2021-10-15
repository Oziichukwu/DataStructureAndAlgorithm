package strings;

public class SameCharacter {

    public static boolean checkIfCharactersAreSimilar(String letters) {

        for (int i = 1; i < letters.length(); i++) {
            if (letters.charAt(i) != letters.charAt(0)){
                return false;
            }
        }
        return true;
    }
}
