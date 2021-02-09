/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier: Hoang Quach
 * @id#991609272
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13)+1);//range 1 to 3
            c.setSuit((int)(Math.random()*3)+0);//range 0 to 3
            magicHand[i]=c;//create the magic hand
        }
        
       Scanner scan=new Scanner(System.in);
       
       System.out.println("0 for Hearts; 1 for Diamonds; 2 for Spades; 3 for Clubs");
       System.out.print("Please pick a suit: ");
       int cardSuit=scan.nextInt();
       System.out.print("\nPLease pick a number between 1-13: ");
       int cardNum=scan.nextInt();
       //Initialize user card
       Card userCard=new Card();
       userCard.setValue(cardNum);
       userCard.setSuit(cardSuit);
        
        Card luckyCard=new Card();
        luckyCard.setSuit(0);
        luckyCard.setValue(2);
        
        String theDeck="The 7 magic cards are:\n\n";
        for(int i=0; i<magicHand.length; i++)
        {theDeck+=magicHand[i].getSuit()+" "+magicHand[i].getValue()+"\n";}
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++)
        {
            //Then report the result here
           if(magicHand[i].getSuit().equals(userCard.getSuit())&&magicHand[i].getValue()==userCard.getValue())
           {
               
               System.out.println("\n"+theDeck);
               System.out.println("User card: "+userCard.getSuit()+" "+userCard.getValue()+"\n");
               System.out.println("Congrats! The user card matched the magic hand.\nMagic card: "+userCard.getSuit()+" "+userCard.getValue());
               break;
           }
           else if(i==magicHand.length-1)//the end of the magic hand
           {
               System.out.println("\n"+theDeck);
               System.out.println("User card: "+userCard.getSuit()+" "+userCard.getValue()+"\n");
               System.out.println("Sorry no match!\nGood luck next time.");
               
           }
        }
        
    }
    
}
