package ca.sheridancollege.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {

    @Test
    public void testDeckSizeAfterInstantiation() {
        // Arrange
        Deck deck = new Deck();

        // Act
        int size = deck.getSize();

        // Assert
        assertEquals(52, size, "Deck should have 52 cards after instantiation");
    }

    @Test
    public void testDeckSizeAfterShuffling() {
        // Arrange
        Deck deck = new Deck();
        int initialSize = deck.getSize();

        // Act
        deck.shuffle();
        int sizeAfterShuffling = deck.getSize();

        // Assert
        assertEquals(initialSize, sizeAfterShuffling, "Shuffling should not change the deck size");
    }

    @Test
    public void testDeckSizeAfterDealingCard() {
        // Arrange
        Deck deck = new Deck();
        int initialSize = deck.getSize();

        // Act
        deck.dealCard();
        int sizeAfterDealing = deck.getSize();

        // Assert
        assertEquals(initialSize - 1, sizeAfterDealing, "Dealing a card should reduce the deck size by 1");
    }

    @Test
    public void testDealtCardNotInDeck() {
        // Arrange
        Deck deck = new Deck();

        // Act
        Card dealtCard = deck.dealCard();

        // Assert
        assertFalse(deck.getCards().contains(dealtCard), "Dealt card should not be in the deck");
    }
}
