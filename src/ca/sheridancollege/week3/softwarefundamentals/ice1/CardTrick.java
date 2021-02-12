/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import static java.lang.Integer.parseInt;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Bill Tang
 * Date Modified: Feb 12, 2021
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random randomcard = new Random(); //Added a random method for generating cards
        
        //Randomly generates 7 cards
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card(); 
            c.setValue(randomcard.nextInt(13)); //Sets the value
            c.setSuit(Card.SUITS[randomcard.nextInt(3)]); //Sets the suit
            magicHand[i] = c; //Saves the card
        }
        
        //Added scanner and scanner package
        Scanner input = new Scanner(System.in);
        //Simple instructions
        System.out.println("Pick a card, any card!"+"\nEnter the number of your card:");
        int cardValue = parseInt(input.nextLine()); //Reads the card value first
        System.out.println("Enter the suit:");
        String cardSuit = input.nextLine(); //Reads the cardsuit second
        
        //Uses a loop to determine if the magicHand generated that card or not
        for (int x = 0; x < magicHand.length; x++)
        {
            if ((cardValue == magicHand[x].getValue()) && (cardSuit.equals(magicHand[x].getSuit())))
            {
            System.out.println("Is this your card? "+ magicHand[x].getValue() + " of " +magicHand[x].getSuit());
            break; //Outputs and stops searching the hand if card is found
            }
            else if (x >= 6) //If card cannot be found
            {
            System.out.println("I do not have your card.");
            }
        }
    }
    
}
