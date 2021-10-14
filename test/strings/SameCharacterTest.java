package strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SameCharacterTest {

    @Test
    public void elementsAreOfSimilarCharactersTest(){

        String letters = "aaaa";
        assertTrue(SameCharacter.checkIfCharactersAreSimilar(letters));
    }
}
