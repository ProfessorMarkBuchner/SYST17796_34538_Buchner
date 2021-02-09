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
 * @Modifier Khusboo Shaivi Balloo
 * Student Id:991614490
 * Date: 9 Feb 2021
 */
public class CardTrick {
    
    public static void main(String[] args)
     {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            int minimum = 1;
            int maximum = 14;
            //generate random values from 1-13
            int randomNum = (int)(Math.random() * (maximum - minimum + 1)+minimum);
            c.setValue(randomNum);
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int min = 0;
            int max= 4;
            //generate random number between 0-3
            int randSuit =(int)(Math.random() * (max - min + 1)+min);
            c.setSuit(Card.SUITS[randSuit]);
            
            magicHand[i]= c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Card Value (1-13)");
        int cardValue = input.nextInt();
        System.out.print("Enter a suit [Hearts-0,Diamonds-1,Spades-2,Clubs-3]");
        int cardSuit = input.nextInt();
        
        Card c1= new Card();
        c1.setValue(cardValue);
        c1.setSuit(Card.SUITS[cardSuit]);
        
        
        // and search magicHand here
        for(int i = 0 ; i<magicHand.length;i++){
            if(magicHand[i].getValue()== c1.getValue()&& magicHand[i].getSuit().equals(c1.getSuit()) ){
                //Then report the result here
             
                System.out.println("The card is found in the magic Hand");
            }else{
            
            System.out.println("Sorry the card is not found in the magic Hand");
            }
        }
}}
