
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner; 

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @Modifier Han Byul Moon
 * Student ID: 991624436
 * Date: February 9, 2021 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        //Array for 7 cards in the magic hand 
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            
            magicHand[i] = c; 
        }
        
        
        
        /* Comment out section asking user for values
        
        //code to ask the user for Card value and suit
        Scanner input = new Scanner(System.in); 
        
        //asking for card value
        System.out.print("Enter a card value between 1 and 13. (Ace = 1 and King = 13): "); 
        int userValue = input.nextInt(); 
        while (userValue < 1 || userValue > 13) {
            System.out.print("Invalid! Please enter a card value in between 1 and 13, where Ace = 1 and King = 13: ");
            userValue = input.nextInt(); 
        }
        
        //asking for suit
        System.out.print("Enter a card suit (Hearts, Diamonds, Spades, or Clubs): ");
        String userSuit = input.next(); 
        while (!userSuit.equalsIgnoreCase("Hearts") 
                && !userSuit.equalsIgnoreCase("Diamonds")
                && !userSuit.equalsIgnoreCase("Spades")
                && !userSuit.equalsIgnoreCase("Clubs")) {
            
            System.out.print("Invalid! Please enter a card suit (Hearts, Diamonds, Spades, or Clubs");
            userSuit = input.next(); 
        }
        
        
        String displayName = ""; 
        
        switch (userValue) {
            case 1:
                displayName = "Ace";
                break;
            case 11:
                displayName = "Jack";
                break;
            case 12: 
                displayName = "Queen";
                break;
            case 13:
                displayName = "King";
                break;
            default:
                break;
        }
        
        if (userValue == 1 || userValue > 10)
            System.out.println("\nYou have chosen the " + displayName + " of " + userSuit + " as your card."); 
        else
            System.out.println("\nYou have chosen the " + userValue + " of " + userSuit + " as your card.");
        
        
        //create user card
        Card userCard = new Card();
        userCard.setValue(userValue); 
        userCard.setSuit(userSuit);
        
        */
        
        
        //Create luckyCard 
        Card luckyCard = new Card(); 
        luckyCard.setValue(1);
        luckyCard.setSuit("Spades"); 
        System.out.println("I hardcoded luckyCard value of " +luckyCard.getValue() + " and of suit " + luckyCard.getSuit());
        
        //search magicHand here
        boolean isFound = false;
        
        //to check for the userCard instead, replace luckyCard with userCard in the for loop
        for (int i = 0; i < magicHand.length; i++) {
            System.out.println("The card number " + (i + 1) + " in the magic hand was: " + magicHand[i].getValue() + " of " + magicHand[i].getSuit());
            if (luckyCard.getValue() == magicHand[i].getValue()) {
                if (luckyCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit())){
                    isFound = true; 
                }    
            }
        } 
        
        
        //result here
        
        if (isFound) {
            System.out.println("\nCongratulations! Your card is in the deck of magic hands! Today is your lucky day!\n");
        } else {
            System.out.println("\nUnlucky. Your card is not in the deck of magic hands. Try again!\n");
        }
    }
    
}
