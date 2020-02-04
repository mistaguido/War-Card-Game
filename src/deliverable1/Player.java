/*
 * 
 */
package deliverable1;

public class Player {
    private final String name;
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
