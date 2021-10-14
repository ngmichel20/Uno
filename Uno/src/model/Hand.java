package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michel
 */
public class Hand {

    private final List<Card> cards;

    /**
     * This is the constructor.
     */
    public Hand() {
        this.cards = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public boolean isEmpty() {
        boolean isEmpty = false;
        if (cards.isEmpty()) {
            isEmpty = true;
        }
        return isEmpty;
    }

    /**
     *
     */
    public int size() {
        return cards.size();
    }

    /**
     *
     * @param card
     */
    public void addCard(Card card) {
        cards.add(card);
    }

    /**
     *
     * @param index
     * @return
     */
    public Card seeCard(int index) {
        Card card = cards.get(index);
        return card;
    }

    /**
     *
     * @param index
     * @return
     */
    public Card removeCard(int index) {
        Card cardToremove = cards.get(index);
        cards.remove(index);
        return cardToremove;
    }
}
