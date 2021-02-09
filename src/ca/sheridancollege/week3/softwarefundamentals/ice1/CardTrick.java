/*
 * Student ID: 991277384
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * Modified by Khang Tran
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        
        for (int i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        //get user input for card number
        System.out.print("Pick a card number (1 to 13): ");
        int userValue = input.nextInt();
        while (userValue < 1 || userValue > 13)
        {
            System.out.print("Invald card number. Pick a card number (1 to 13): ");
            userValue = input.nextInt();
        }
        
        //get user input for card suit
        System.out.print("Pick a card suit (hearts, diamonds, spades, clubs): ");
        String userSuit = input.next();
        while (!userSuit.equalsIgnoreCase("hearts") &&
               !userSuit.equalsIgnoreCase("diamonds") &&
               !userSuit.equalsIgnoreCase("spades") &&
               !userSuit.equalsIgnoreCase("clubs"))
        {
            System.out.print("Invalid suit. Pick a card suit (hearts, diamonds, spades, clubs): ");
            userSuit = input.next();
        }
        
        System.out.println("You chose " + userValue + " of " + userSuit);
        
        for (int i = 0; i < magicHand.length; i++)
        {
            if (userValue == magicHand[i].getValue())
            {
                if (userSuit.equalsIgnoreCase(magicHand[i].getSuit()))
            }
        }
    }
    
}
