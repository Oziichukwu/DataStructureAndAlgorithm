package strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PalindromeTest {

    @Test
    public void charactersArePalindromeTest(){

        String letters = "123321";

        assertTrue(Palindrome.checkIfItsAPalindrome(letters));
    }

    @Test
    public void charactersArePalindrome2Test(){

        String letters = "123321";

        assertEquals("123321",Palindrome.checkIfItsAPalindrome2(letters));
    }
}
