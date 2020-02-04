/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable1;

public class Player {
    private String name;
    private Deck playerHand;
    
    public Player(String name)
    {
        this.name=name;
    }
    
    public void setDeck(Deck hand)
    {
        this.playerHand=hand;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public Deck getDeck()
    {
        return this.playerHand;
    }
}
