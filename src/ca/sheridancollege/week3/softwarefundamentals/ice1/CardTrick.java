package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * 
 * Modifier: Roopali Kanwar
 * Student Number: 991624561
 * Date: Feb 07, 2021
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        int count = 0;
        while(count<7) {
            Card card = getRandomCard();
            boolean exists = checkCardExistsInMagicHand(card, magicHand);
            if(!exists) {
                magicHand[count] = card;
                count++;
            }
        }

        Card luckyCard = new Card("Spades", 10);
        if(checkCardExistsInMagicHand(luckyCard, magicHand))
            System.out.println("You won! The card exists in magic hand");
        else
            System.out.println("You lost! The card doesn't exist in magic hand");
        
        
    }

    private static Card getRandomCard() {
        int value = (int)(Math.random()*13)+1;
        String suit = Card.SUITS[(int)(Math.random()*4)];
        Card card = new Card(suit, value);
        return card;
    }

    private static boolean checkCardExistsInMagicHand(Card card, Card[] magicHand) {
        for(int i=0; i<magicHand.length; i++){
            if(magicHand[i]!=null && magicHand[i].getValue() == card.getValue() && magicHand[i].getSuit().equals(card.getSuit())) {
                return true;
            }
        }
        return false;
    }
    
}
