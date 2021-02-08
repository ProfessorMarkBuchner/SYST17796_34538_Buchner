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
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value between 1 to 13");
        int userValue = scan.nextInt();
        System.out.println("Enter a suit");
        String userSuit = scan.next();
        int success = 0;
        
        for(Card c : magicHand){
            if( userValue==c.getValue()  &&  userSuit==c.getSuit()){
                success++;
            }
            //System.out.println(c.getValue()+" of " +c.getSuit());
        }
        if(success==0){
            System.out.println("Sorry wrong pick");
        }
        else
                System.out.println("congrats");
        
       
               
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
