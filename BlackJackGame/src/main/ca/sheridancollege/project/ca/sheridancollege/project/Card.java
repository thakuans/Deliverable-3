/**
 * SYST 17796 Black Jack Card Game
 * @author Anshika 
 * @author Gurjeet Dec 2023
 */
package ca.sheridancollege.project;

/**
 * Card Class
 */
public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }

    public String getRank() {
        return rank;
    }
}