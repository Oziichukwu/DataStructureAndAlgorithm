package strings;

public class ConvertionToUpperCase {

    public static String convert(String letters){

        char [] characters = letters.toCharArray();

        for (int i = 0; i < characters.length; i++) {

            if (Character.isLetter(characters[i]) && Character.isLowerCase(characters[i])){
                characters[i] = Character.toUpperCase(characters[i]);
            }
        }
        return new String(characters);
    }
}
