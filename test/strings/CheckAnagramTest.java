package strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CheckAnagramTest {

    @Test
    public void checkThatTwoStringsAreAnagram(){

        String letter1 = "is this how you Listen";
        String letter2 = "this is how you listen";
        assertTrue(CheckAnagram.checkIfTheyAreAnagram(letter1,letter2));
    }
}
