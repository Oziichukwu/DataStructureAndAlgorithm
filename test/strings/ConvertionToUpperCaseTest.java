package strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ConvertionToUpperCaseTest {

    @Test
    public void convertToUpperCaseTest(){

        String letters = "abcdEFG";

        assertEquals("ABCDEFG", ConvertionToUpperCase.convert(letters));
    }
}
