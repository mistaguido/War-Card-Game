/*
 *
 */
package deliverable1;

import java.util.*;

public class Deliverable1 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Deck player1Deck = new Deck(new LinkedList<Card>());;
        Deck player2Deck = new Deck(new LinkedList<Card>());;
        
        //Generate all Cards
        //And insert it into a
        //List into the deck
        LinkedList<Card> DeckList=new LinkedList<Card>();        
        for(CardSuit s : CardSuit.values())
        {
            for (CardValue v : CardValue.values())
            {
                DeckList.addLast(new Card(s, v));
            }
        }
        
        //This deck contains all
        //Cards to be distributed
        //To both player's decks
        Deck reserve = new Deck(DeckList);
        
        //Players are all to
        //Be stored into a linked list
        //for some future use
        LinkedList<Player> players = new LinkedList<Player>();
        
        System.out.println("2 players are required for this game.");
        
        //Asks for both players
        //To enter their names before
        //The game can begin
        System.out.println("Enter the first player's name:"); //Player 1 name
        players.addLast(new Player(input.next()));
        System.out.println("Enter the second player's name:"); //Player 2 name
        players.addLast(new Player(input.next()));
        
        System.out.println("The cards will be shuffled and distributed now.");        
        reserve.shuffleCards();
        
        //
        //Time to give one half
        //To player 1 and the other
        //Half to player two
        
        //To the first player
        //I give you the first half of
        //All the reserve cards
        for (int i = 0; i < Math.ceil(reserve.getSize()/2); i++)
        {
            reserve.moveCard(i,player1Deck);
        }
        //System.out.println(player1Deck.toString()); //debug kek
        
        //Player two! This is 
        //The last of my reserve cards.
        //Now, take it from me!
        //(Caeeeesar!)
        for (int i = 0; i < reserve.getSize(); i++)
        {
            reserve.moveCard(i,player2Deck);
        }
        // System.out.println(player2Deck.toString()); //MY CODE SUCKS MORE ASS THAN A DONKEY FUCKER
        
        System.out.println("Finished distributing cards. The game will begin now.");
        
    }
}





//add me on discord telemachus#1793
//kek