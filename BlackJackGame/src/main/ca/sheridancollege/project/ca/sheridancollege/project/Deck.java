package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Deck Class
 */
public class Deck {
    private List<Card> cards;

    public Deck() {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        cards = new ArrayList<>();

        for (String rank : ranks) {
            for (String suit : suits) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }

        shuffle();
    }

    public int getSize() {
        return cards.size();
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards);
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = cards.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    public Card dealCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(cards.size() - 1);
    }
}
