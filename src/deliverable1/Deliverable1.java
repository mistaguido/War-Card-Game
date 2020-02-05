/*
 *
 */
package deliverable1;

import java.util.*;

public class Deliverable1 {

    static Scanner input = new Scanner(System.in);
    /*
         *This deck contains all
         *Cards to be distributed
         *To both player's decks
     */
    static Deck reserve;

    static Deck player1Deck;//player decks
    static Deck player2Deck;

    static Player player1;
    static Player player2;

    /*These arrays will
         *Represent the cards being
         *Played by the players
    */
    static Card[] player1Card = new Card[3];
    static Card[] player2Card = new Card[3];

    public static void main(String[] args) {

        /*
         *Generate all Cards
         *And insert it into a
         *List into the deck     
         */
        LinkedList<Card> reserveList = new LinkedList<>();
        for (CardSuit s : CardSuit.values()) {
            for (CardValue v : CardValue.values()) {
                reserveList.push(new Card(s, v));
            }
        }
        reserve = new Deck(reserveList);
        reserve.shuffleCards();
        //System.out.println(reserve.toString());
        /*
         *Their names are all to
         *Be stored into a linked list
         *for some future use
         */
        System.out.println("2 players are required for this game.");

        /*
         *Asks for both players
         *To enter their names before
         *The game can begin
         */
        System.out.println("Enter the first player's name:"); //Player 1 name
        player1 = new Player(input.next());
        System.out.println("Enter the second player's name:"); //Player 2 name
        player2 = new Player(input.next());

        //Shuffle cards
        System.out.println("The cards will be shuffled and distributed now.");

        /*
         *Time to give one half
         *To player 1 and the other
         *Half to player two
        
         *To the first player
         *I give you the first half of
         *All the reserve cards
         */
        LinkedList<Card> player1List = new LinkedList<>();
        for (int i = 0; i <= 25; i++) {
            player1List.push(reserve.getCard(i));
        }
        player1Deck = new Deck(player1List);
        //System.out.println(player1Deck.toString()); //debug kek

        /*Player two! This is 
         *The last of my reserve cards.
         *Now, take it from me!
         *(Caeeeesar!)
         */
        LinkedList<Card> player2List = new LinkedList<>();
        for (int i = 26; i <= 51; i++) {
            player2List.push(reserve.getCard(i));
        }
        player2Deck = new Deck(player2List);
        //System.out.println("\n" + player2Deck.toString()); //THIS SUCKS MORE ASS THAN A DONKEY FUCKER

        //
        System.out.println("Finished distributing cards. The game will begin now.\n");

        //
        while (true) {
            //win conditions
            if (player1Deck.getSize() < 1) {
                System.out.println(player1.getName() + " has no cards left; " + player2.getName() + " is the victor.");
                System.exit(0);
            } else if (player2Deck.getSize() < 1) {
                System.out.println(player2.getName() + " has no cards left; " + player1.getName() + " is the victor.");
                System.exit(0);
            }

            //print amount of cards left
            System.out.println("\n"+player1.getName() + " has " + player1Deck.getSize() + " cards left");
            System.out.println(player2.getName() + " has " + player2Deck.getSize() + " cards left");

            //
            pressEnterPrompt();
            player1Card[0] = player1Deck.getCard(0); //first card of player1's deck is placed hither
            player2Card[0] = player2Deck.getCard(0); //same as above but with player 2
            System.out.println(player1.getName() + " and " + player2.getName() + " place their cards down.\n");
            System.out.println(player1.getName() + " flips their card over. \n It's the " + player1Card[0].toString());
            //
            pressEnterPrompt();
            System.out.println(player2.getName() + " flips their card over. \n It's the " + player2Card[0].toString());

            //If the cards are equal, it's war.
            if (player1Card[0].getValue() == player2Card[0].getValue()) {
                war();
            }
            //player 1's card wins
            else if (player1Card[0].getValue() > player2Card[0].getValue()) {
                System.out.println(player1.getName() + "'s card wins.");
                player1Deck.moveFrontToEnd();
                player2Deck.moveCard(0, player1Deck);
            } //player 2's card wins
            else if (player1Card[0].getValue() < player2Card[0].getValue()) {
                System.out.println(player2.getName() + "'s card wins.");
                player2Deck.moveFrontToEnd();
                player1Deck.moveCard(0, player2Deck);
            }
            //Big what the fuck moment if you managed to get here.
            else {
                System.out.println("Yo bro. I'm gonna be honest with you a logical error happened. \n The probability was so low I really didn't think this was possible."
                        + "\n We'll re-shuffle and you can re-draw new cards, capiche?");
                player1Deck.shuffleCards();
                player2Deck.shuffleCards();
            }
        }
    }

    /*
     *This method prompts the
     *User to press the enter
     *Key to continue
    (or alternatively quit kek)*/
    public static void pressEnterPrompt() {
        System.out.println("\nPress enter to continue, type \"quit\" to quit");
        if (input.nextLine().equalsIgnoreCase("quit")) {
            System.exit(0);
        }

        try {
        } catch (Exception E) {
        }
    }

    //War
    public static void war() {
        while (true) {
            System.out.println("Both cards are of the same rank. A war will begin.");
            pressEnterPrompt();

            //Should a player not have enough cards
            if (player1Deck.getSize() < 3) //rip player 1
            {
                System.out.println("Player " + player1.getName() + " does not have enough cards."
                        + "\n The victor is " + player2.getName());
                System.exit(0);
            } else if (player2Deck.getSize() < 3)//player 2 ripperoni
            {
                System.out.println("Player " + player2.getName() + " does not have enough cards."
                        + "\n The victor is " + player1.getName());
                System.exit(0);
            } else //so basically the war continues as normal
            {
                // First card = face down, second card = face up
                player1Card[1] = player1Deck.getCard(1);
                player1Card[2] = player1Deck.getCard(2);
                player2Card[1] = player2Deck.getCard(1);
                player2Card[2] = player2Deck.getCard(2);

                //Shit reads like a text-rpg
                System.out.println(player1.getName() + " and " + player2.getName() + " both put a card from their deck"
                        + " face down, and place another on top.");
                System.out.println("They flip their cards over simultameously.");
                System.out.println(player1.getName() + "'s card is the " + player1Card[2].toString() + ".");
                System.out.println(player2.getName() + "'s card is the " + player2Card[2].toString() + ".");

                //player 1 wins
                if (player1Card[2].getValue() > player2Card[2].getValue()) {
                    System.out.println(player1.getName() + "'s card wins.");
                    player1Deck.moveFrontToEnd();
                    for (int i = 0; i < player2Card.length; i++) {
                        player2Deck.moveCard(i, player1Deck);
                    }
                    pressEnterPrompt();
                    break;
                } //player 2 wins
                else if (player1Card[2].getValue() < player2Card[2].getValue()) {
                    System.out.println(player2.getName() + "'s card wins.");
                    player2Deck.moveFrontToEnd();
                    for (int i = 0; i < player1Card.length; i++) {
                        player1Deck.moveCard(i, player2Deck);
                    }
                    pressEnterPrompt();
                    break;
                }
                else //and yet, another war? We're gonna go shuffle again.
                {
                    player1Deck.shuffleCards();
                    player2Deck.shuffleCards();
                    war();
                }
            }
        }
    }
}


//add me on discord telemachus#1793
