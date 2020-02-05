/*
 *
 */
package deliverable1;


public enum CardSuit{
    HEARTS("Hearts"), CLUBS("Clubs"), SPADES("Spades"), DIAMONDS("Diamonds");
    
    private final String suit;
    
    CardSuit(String suit)
    {
        this.suit=suit;
    }
    
    //returns suit
    public String getSuit()
    {
        return this.suit;
    }
}
