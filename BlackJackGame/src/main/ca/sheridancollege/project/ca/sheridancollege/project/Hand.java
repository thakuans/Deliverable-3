package ca.sheridancollege.project;
/**
 * SYST 17796 Black Jack Card Game
 * @author Anshika 
 * @author Gurjeet Dec 2023
 */
import java.util.ArrayList;
import java.util.List;
/**
 * Player Hand Class
 */
public class Hand {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getValue() {
        int value = 0;
        boolean hasAce = false;

        for (Card card : cards) {
            if (card.getRank().equals("Ace")) {
                hasAce = true;
                value += 11;
            } else if (card.getRank().equals("King") || card.getRank().equals("Queen") || card.getRank().equals("Jack")) {
                value += 10;
            } else {
                value += Integer.parseInt(card.getRank());
            }
        }

        if (hasAce && value > 21) {
            value -= 10;
        }

        return value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card.toString()).append(", ");
        }
        return sb.toString();
    }
}
