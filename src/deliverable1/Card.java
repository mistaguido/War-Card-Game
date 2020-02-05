/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable1;

/**
 *
 * @author REEEE
 */
public class Card {

    private final CardSuit suit;
    private final CardValue value;

    public Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    //Get suit
    public String getSuit() {
        return this.suit.getSuit();
    }

    //Get value
    public int getValue() {
        return this.value.getValue();
    }

    //toString
    @Override
    public String toString() {
        int cardValue = getValue();
        String cardValueStr = "";
        switch (cardValue) {
            case 11: {
                cardValueStr = "Jack";
                break;
            }
            case 12: {
                cardValueStr = "Queen";
                break;
            }
            case 13: {
                cardValueStr = "King";
                break;
            }
            case 14: {
                cardValueStr = "Ace";
                break;
            }
            default:
            {
                cardValueStr+=getValue();
            }
        }
        return cardValueStr + " of " + getSuit();
    }
}
