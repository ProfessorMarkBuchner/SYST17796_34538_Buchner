/*
 * Student ID: 991277384
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * Modified by Khang Tran on Feb 9, 2020
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        //new card object called luckyCard
        Card luckyCard = new Card();
        //assign data to luckyCard
        luckyCard.setValue(2);
        luckyCard.setSuit("spades");
        
        //array for 7 cards magic hand
        Card[] magicHand = new Card[7];
        
        //loop to create array of card objects
        for (int i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            
            magicHand[i] = c;
        }
        
//        //get user input for card number
//        System.out.print("Pick a card number (1 to 13): ");
//        int userValue = input.nextInt();
//        while (userValue < 1 || userValue > 13)
//        {
//            System.out.print("Invald card number. Pick a card number (1 to 13): ");
//            userValue = input.nextInt();
//        }
//        
//        //get user input for card suit
//        System.out.print("Pick a card suit (hearts, diamonds, spades, clubs): ");
//        String userSuit = input.next();
//        while (!userSuit.equalsIgnoreCase("hearts") &&
//               !userSuit.equalsIgnoreCase("diamonds") &&
//               !userSuit.equalsIgnoreCase("spades") &&
//               !userSuit.equalsIgnoreCase("clubs"))
//        {
//            System.out.print("Invalid suit. Pick a card suit (hearts, diamonds, spades, clubs): ");
//            userSuit = input.next();
//        }
//        
//        System.out.println("You chose " + userValue + " of " + userSuit);
        
        System.out.println("Your card is " + luckyCard.getValue() + " of " + luckyCard.getSuit());
        //variable to track if user card matches magic hand card
        boolean match = false;
        //loop to check if there is a matching card
        for (int i = 0; i < magicHand.length; i++)
        {
            if (luckyCard.getValue() == magicHand[i].getValue())
            {
                if (luckyCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit()))
                {
                    match = true;
                }
            }
            System.out.println("Magic hand card #" + (i+1) + " is: " + magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }
        
        //output match or not
        if (match == false)
        {
            System.out.println("Your card is not in the magic hand");
        }
        else if (match == true)
        {
            System.out.println("Your card is in the magic hand");
        }
    }
    
}
