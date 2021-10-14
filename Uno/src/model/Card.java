package model;

/**
 *
 * @author Michel
 */
public class Card {

    private Color color;
    private int value;

    /**
     * This is the constructor.
     *
     * @param color
     * @param value
     */
    public Card(Color color, int value) throws UnoException {
        this.color = color;
        if (value < 0 || value > 9) {
            throw new UnoException("Veuillez entrer une valeur comprise entre 0"
                    + " et 9");
        } else {
            this.value = value;
        }
    }

    /**
     * This is the getter of color.
     *
     * @return color
     */
    public Color getColor() {
        return color;
    }

    /**
     * This is the getter if value.
     *
     * @return the value of the card.
     */
    public int getValue() {
        return value;
    }

    /**
     * This method allows to know if a card has the same color.
     *
     * @param card is a card.
     * @return true it is the same color.
     */
    public boolean sameColor(Card card) {
        boolean isSameColor = false;
        if (card.getColor().equals(color)) {
            isSameColor = true;
        }
        return isSameColor;
    }

    /**
     * This method allows to know a card has the same value.
     *
     * @param card is a card.
     * @return true if it is the same value.
     */
    public boolean sameValue(Card card) {
        boolean isSameValue = false;
        if (card.getValue() == (value)) {
            isSameValue = true;
        }
        return isSameValue;
    }

    @Override
    public String toString() {
        return "Carte : " + color + ", " + value;
    }

}
