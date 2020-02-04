/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable1;

import java.util.*;

public class Deck {
    
    LinkedList<CardValue> cards;
    int length;
    
    public Deck(int length, LinkedList<CardValue> cards)
    {
        this.length=length;
        this.cards=cards;
    }
    
    public void setLength(int length)
    {
        this.length=length;
    }
    
    public void shuffleCards()
    {
        Collections.shuffle(cards);
    }
    
    //Adds a card to the bottom of the deck.
    //@param card - Card to insert into deck
    public void addCard(CardValue card)
    {
        cards.addLast(card);
    }
    
    //Removes a card from the specified index
    //@param index - which index to remove card from
    public void removeCard(int index)
    {
        cards.remove(index);
    }
}
