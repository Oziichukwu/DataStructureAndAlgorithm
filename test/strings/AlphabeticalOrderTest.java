package strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AlphabeticalOrderTest {

    @Test
    public void canArrangeLettersAlphabetically(){
    String letters = "AbcDe";
       assertTrue(AlphabeticalOrder.checkIfItsInAlphabeticalOrder(letters));
    }
}
