package strings;

public class Palindrome {

    public static boolean checkIfItsAPalindrome(String letters) {

        for (int i = 0, j = letters.length() - 1; i < j; i++, j--) {

            if (letters.charAt(i) != letters.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static String checkIfItsAPalindrome2(String letters) {
        for (int i = 0, j = letters.length() - 1; i < j; i++, j--) if (letters.charAt(i) != letters.charAt(j))
            return "its not a palindrome";
                return "its a palindrome";
    }

    public static void main(String... args) {
        String name = "123321";
        System.out.println(checkIfItsAPalindrome2(name));
    }
}
