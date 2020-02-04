/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable1;

import java.util.*;

public class Deck {
    
    Card[] cards;
    
    public Deck(int length)
    {
        cards=new Card[length];
    }
    
    public void setLength(int length)
    {
        this.cards=new Card[length];
    }
    
    public void shuffleCards()
    {
        List<Card> tmpCardsList = Arrays.asList(cards);
        Collections.shuffle(tmpCardsList);
        this.cards=tmpCardsList.toArray(new Card[tmpCardsList.size()]);
    }
}
