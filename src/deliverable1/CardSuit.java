/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable1;


public enum CardSuit{
    HEARTS("Heart"), CLUBS("Clubs"), SPADES("Spades"), DIAMONDS("Diamonds");
    
    private final String suit;
    CardSuit(String suit)
    {
        this.suit=suit;
    }
}
