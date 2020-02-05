/*
 * 
 */
package deliverable1;

import java.util.*;

public class Deck {

    final private LinkedList<Card> cards;
    private int size = 0;

    public Deck(LinkedList<Card> cards) {
        this.cards = cards;
        this.size = cards.size();
    }

    //
    //sets size of the deck. will always be the size of linkedlist cards
    public void setSize() {
        this.size = cards.size();
    }

    //getSize()
    //@return returns the size of the deck
    public int getSize() {
        return this.size;
    }

    //getCard()
    //@param int index - the index of the card in the deck
    //@return card
    public Card getCard(int index) {
        return cards.get(index);
    }

    //
    //Shuffles the deck
    public void shuffleCards() {
        Collections.shuffle(cards);
    }

    //Adds a card to the bottom of the deck.
    //@param card - Card to insert into deck
    public void addCard(Card card) {
        cards.addLast(card);
        setSize();
    }

    //Removes a card from the specified index
    //@param index - which index of deck to remove card from
    public void removeCard(int index) {
        cards.remove(index);
        setSize();
    }

    //Moves the specified from one deck to another
    //@param index - which index of deck to move the card
    //@param deck - the deck to move the card to
    public void moveCard(int index, Deck deck) {
        deck.addCard(this.getCard(index)); //i'm a lazy bitch who can't think of some other way
        this.removeCard(index);
    }
    
    //Moves card in index 
    //Zero, to the very last spot,
    //Underneath the deck
    public void moveFrontToEnd()
    {
        moveCard(0,this);
    }
    @Override
    public String toString() {
        String bruh = "";
        for (int i = 0; i < this.cards.size(); i++) {
            Card cardToPrint = cards.get(i);
            //System.out.println(cardToPrint.getSuit() + " " +cardToPrint.getValue());
            int cardValue = cardToPrint.getValue();
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
                default: {
                    cardValueStr = Integer.toString(cardValue);
                }
            }
            bruh += "\n" + cardToPrint.getSuit() + " " + cardValueStr;
        }

        return bruh;
    }
}

//secret ability: spawns an anime girl that steps on you
