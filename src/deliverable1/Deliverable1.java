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
        
        //Loops and asks players
        //To enter their names until
        //'-q' is written
        System.out.println("2 to 4 players are required for this game.");
        System.out.println("Enter player names. Write \"-q\" to quit, write \"-rm\" to remove latest player entered");
        while(true)
        {
            try{
                String name=input.next();
                
                if (name.equalsIgnoreCase("-q")) //finished adding players
                {
                    if(players.size()<2 && players.size()<4)//if there are not enough players
                    {
                        System.out.println("You need at least 2 players to play.");
                    }
                    else if(players.size()>=2 && players.size()>4)//if there are too many players
                    {
                        System.out.println("You have too many players - you cannot have more than 4.");
                    }
                    else
                    {
                        break;
                    }
                }
                else if(name.equalsIgnoreCase("-rm")) //remove the latest player entered
                {
                    players.removeLast();
                }
                else //otherwise we just add the player to the list
                {
                    players.addLast(new Player(name));
                }
            }catch(Exception e)
            {
                System.out.println("error"); // if some shit happens
            }
        }
    }
}
