// File: src/test/ca/sheridancollege/project/CardTest.java

package ca.sheridancollege.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardTest {

    @Test
    public void testToString() {
        Card card = new Card("Ace", "Spades");
        assertEquals("Ace of Spades", card.toString());
    }

    @Test
    public void testGetRank() {
        Card card = new Card("King", "Hearts");
        assertEquals("King", card.getRank());
    }
}
