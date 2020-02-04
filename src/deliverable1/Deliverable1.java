/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable1;

import java.util.*;

public class Deliverable1 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Players are all to
        //Be stored into a linked list
        //for some future use
        LinkedList<Player> players = new LinkedList<Player>();
        
        
        System.out.println("2 players are required for this game.");
        
        //Asks for both players
        //To enter their names before
        //The game can begin
        System.out.println("Enter the first player's name:");
        players.addLast(new Player(input.next()));
        System.out.println("Enter the second player's name:");
        players.addLast(new Player(input.next()));
        
        System.out.println("The cards will be shuffled and distributed now.");
        
        
    }
}
