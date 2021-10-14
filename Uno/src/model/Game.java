package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Michel
 */
public class Game {

    private final List<Card> deck;
    private Hand[] players;
    private int currentPlayer;
    private Card visibleCard;

    /**
     *
     * @throws UnoException
     */
    public Game() throws UnoException {

        this.currentPlayer = 0;

        this.deck = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Card card = new Card(Color.BLUE, i);
            deck.add(card);
        }

        for (int i = 0; i < 10; i++) {
            Card card = new Card(Color.GREEN, i);
            deck.add(card);
        }

        for (int i = 0; i < 10; i++) {
            Card card = new Card(Color.RED, i);
            deck.add(card);
        }

        for (int i = 0; i < 10; i++) {
            Card card = new Card(Color.YELLOW, i);
            deck.add(card);
        }

        Random random = new Random();
        Collections.shuffle(deck, random);

        this.visibleCard = deck.get(0);
        deck.remove(0);

        this.players = new Hand[4];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Hand();
            for (int j = 0; j < 7; j++) {
                players[i].addCard(deck.get(0));
                deck.remove(0);
            }
        }
    }

    /**
     *
     * @return
     */
    public Hand[] getPlayers() {
        return players;
    }

    /**
     *
     * @return
     */
    public int getCurrentPlayer() {
        return currentPlayer;
    }

    /**
     *
     * @return
     */
    public Card getVisibleCard() {
        return visibleCard;
    }

    /**
     *
     * @param visibleCard
     */
    public void setVisibleCard(Card visibleCard) {
        this.visibleCard = visibleCard;
    }

    /**
     *
     * @return @throws UnoException
     */
    public Card getCard() throws UnoException {
        if (deck.isEmpty()) {
            throw new UnoException("Le deck est vide !");
        }
        Card cardRemoved = deck.remove(0);
        return cardRemoved;
    }

    /**
     *
     */
    public void nextPlayer() {
        if (currentPlayer == 3) {
            currentPlayer = -1;
        }
        currentPlayer = currentPlayer + 1;
    }

    /**
     *
     * @return
     */
    public boolean isOver() {
        boolean isOver = false;
        if (deck.isEmpty()) {
            isOver = true;
        } else {
            for (Hand player : players) {
                if (player.isEmpty()) {
                    isOver = true;
                }
            }
        }
        return isOver;
    }
}
