package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringsTest {

    @Test
    public void stringsCanBeReversedTest(){

        String letters = "abc123";
        assertEquals("321cba", ReverseStrings.performReverse(letters));

    }

    @Test
    public void stringsCanBeReversedTest2(){

        String letter = "321cba";
        assertEquals("abc123", ReverseStrings.performReverse2(letter));

    }
}
