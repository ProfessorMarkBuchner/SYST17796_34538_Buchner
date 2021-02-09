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
 * @author severo john castillo, 991274675, Feb 8, 2021
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random() * 13) +1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            //add card to the magicHand array
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        int cValue = 0;
        do {
            System.out.print("Please enter a Card value from 1 to 13 (A=1, J=11, Q=12, K=13): ");
            while (!input.hasNextInt()) {
                System.out.print("     Only integer from 1 to 13 please: ");
                input.next();
            }
            cValue = input.nextInt();
        } while (cValue > 13 || cValue <1);
        
        int cSuit = 0;
        do {
            System.out.print("Please enter a Card suit from 1 to 4 (1=Hearts, 2=Diamonds, 3=Spades, 4=Clubs): ");
            while (!input.hasNextInt()) {
                System.out.print("     Only integer from 1 to 4 please: ");
                input.next();
            }
            cSuit = input.nextInt();
        } while (cSuit > 4 || cSuit < 1);
        
        //create user's card
        Card userCard = new Card();
        userCard.setValue(cValue);
        userCard.setSuit(Card.SUITS[cSuit - 1]);
        
        // and search magicHand here
        boolean isWinner = false;
        for (Card c: magicHand) {
            if (c.getValue() == userCard.getValue() && c.getSuit().equals(userCard.getSuit())) {
                isWinner = true;
                break;
            }
        }  
        
        //Then report the result here
        if (isWinner) {
            System.out.println("Congratulations!  You picked a winning card.");
        }
        else {
            System.out.println("Sorry... You did not win :(");
        }
    }
    
}
