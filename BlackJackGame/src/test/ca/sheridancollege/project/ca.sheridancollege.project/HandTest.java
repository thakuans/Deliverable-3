package ca.sheridancollege.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HandTest {

    private Hand hand;

    @BeforeEach
    public void setUp() {
        hand = new Hand();
    }

    @Test
    public void testHandValueWithoutAce() {
        // Arrange
        hand.addCard(new Card("7", "Hearts"));
        hand.addCard(new Card("8", "Diamonds"));

        // Act
        int value = hand.getValue();

        // Assert
        assertEquals(15, value, "Hand value should be 15 (7 + 8)");
    }

    @Test
    public void testHandValueWithAce() {
        // Arrange
        hand.addCard(new Card("Ace", "Hearts"));
        hand.addCard(new Card("9", "Diamonds"));

        // Act
        int value = hand.getValue();

        // Assert
        assertEquals(20, value, "Hand value should be 20 (Ace + 9)");
    }

    @Test
    public void testHandValueWithAceAs11() {
        // Arrange
        hand.addCard(new Card("Ace", "Hearts"));
        hand.addCard(new Card("King", "Diamonds"));

        // Act
        int value = hand.getValue();

        // Assert
        assertEquals(21, value, "Hand value should be 21 (Ace as 11 + King)");
    }

    @Test
    public void testHandToString() {
        // Arrange
        hand.addCard(new Card("7", "Hearts"));
        hand.addCard(new Card("10", "Diamonds"));

        // Act
        String handString = hand.toString();

        // Assert
        assertEquals("7 of Hearts, 10 of Diamonds, ", handString, "Hand string should be formatted correctly");
    }
}
