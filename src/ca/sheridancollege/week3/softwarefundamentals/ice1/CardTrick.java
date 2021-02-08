/*
Vansh Tyagi
991604000
*/
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Vansh
 * @id#991604000
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int randomValue = (int)((Math.random()*13) +1);
            int randomSuit = (int)(Math.random()*4);
            c.setValue(randomValue);
            c.setSuit(Card.SUITS[randomSuit]);
            magicHand[i]=c;
        }
        System.out.println("Magic Hand of seven cards is: ");
        for(int i=0; i< magicHand.length; i++){
            System.out.println(magicHand[i].getValue()+" of "+magicHand[i].getSuit());
        }
        

        Card luckyCard = new Card();
        luckyCard.setSuit(Card.SUITS[3]); //clubs
        luckyCard.setValue(8); //card value 8
        int success = 0;
        
        for(Card c : magicHand){
         if(c.getValue() == luckyCard.getValue() && c.getSuit() == luckyCard.getSuit()){
          success++;   
         }
        }
        if(success==0){
             System.out.println("Sorry you lost");
        }
        else
                System.out.println("congrats you won!");
        
        
       
               
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
