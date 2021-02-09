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
 * @author Paven Rai
 * @modifer Paven Rai
 * @id 991627967
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner kb= new Scanner(System.in);
        Card[] magicHand = new Card[7];
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();

            int cardNum = (int)(1+Math.random()*13);
            int cardSuit = (int)(Math.random()*4);
             c.setValue(cardNum);
             c.setSuit(Card.SUITS[cardSuit]);
             magicHand[i]=c;
        }

        //insert code to ask the user for Card value and suit, create their card

        Card usrCard= new Card();

        System.out.print("Enter a number between 1-13: ");
        int usrCardNum=kb.nextInt();
        usrCard.setValue(usrCardNum);

        System.out.print("Enter a suit (Clubs, Spades, Diamonds, Hearts): ");
        String usrCardSuit=kb.next();
        usrCard.setSuit(usrCardSuit);
        
        final Card luckCard= new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit(Card.SUITS[1]);

        int cardMatch=0;

        for(int i=0;i< magicHand.length;i++){
            if(usrCard.getValue()==magicHand[i].getValue() && usrCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit())){
                cardMatch++;
            }
        }
        if(cardMatch==0)
        System.out.println("\nYour card was not in the card hand!");
        else
            System.out.println("\nYour card was in the card hand! Well done :)");
    }
    
}
