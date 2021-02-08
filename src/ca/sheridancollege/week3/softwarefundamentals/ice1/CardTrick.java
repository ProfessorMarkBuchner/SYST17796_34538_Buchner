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
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int randomValue= (int)(Math.random()*13 + 1);
            int randomSuit = (int)(Math.random()*4);
            c.setValue(randomValue);
            c.setSuit(Card.SUITS[randomSuit]);
            magicHand[i]=c;
            
        }
        Scanner k= new Scanner(System.in);
        System.out.println("Enter number between 1-13: ");
        int num= k.nextInt();
        System.out.println("Enter the suit: ");
        String suit= k.next();
        boolean check=false;
        for (Card c: magicHand) {
            if(c.getValue()==num)
                check=true;
            
        }
        if (check==true) 
            System.out.println("MAGIC! You won.");
        else
            System.out.println("You lost.");
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
