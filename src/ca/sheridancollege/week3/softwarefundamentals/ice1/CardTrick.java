/*
 * 991599290
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @modifier Nicole Sheppard
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        // Creating the magic hand
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13)+1);
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            
            magicHand[i] = c;
        }
        
        // luckyCard object
        Card luckyCard = new Card();
        luckyCard.setSuit("Diamonds");
        luckyCard.setValue(9);
        
        Scanner keysIn = new Scanner(System.in);
        
        System.out.println("Pick a card, any card! Choose a value and suit!");
        
        // Prompting user for value of their card
        System.out.print("Pick a value (1 - 13): ");
        int userValue = keysIn.nextInt();
        while (userValue < 1 || userValue > 13)
        {
            System.out.print("Please only enter a value between 1 and 13: ");
            userValue = keysIn.nextInt();
        } 
        
        // Prompting user for suit of their card
        System.out.print("Pick a suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = keysIn.next();
        while (!userSuit.equalsIgnoreCase("Hearts") && !userSuit.equalsIgnoreCase("Spades") && !userSuit.equalsIgnoreCase("Clubs") && !userSuit.equalsIgnoreCase("Diamonds"))
        {
            System.out.print("Please only enter Hearts, Spades, Clubs, or Diamonds: ");
            userSuit = keysIn.next();
        }
        
        System.out.println("You picked "+userValue+" of "+userSuit);
        
        // Checking array to see if user input matches magic hand
        boolean winner = false;
        for (int i = 0; i < magicHand.length; i++)
        {
            if (userValue == magicHand[i].getValue())
            {
                if (userSuit.equalsIgnoreCase(magicHand[i].getSuit()))
                {
                    System.out.println("Congratulations! Your card was in the magic hand!");
                    winner = true;
                }
                                   
            }           
        }
        
        // Result for loss
        if (winner == false)
        {
            System.out.println("Your card was not in the magic hand.");
        }
        
    }
    
}
