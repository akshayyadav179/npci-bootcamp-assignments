package com.mankatha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
	 private ArrayList<Card> cards;

	    Deck()
	    {
	        cards = new ArrayList<Card>();
	        int index_1, index_2;
	        Random generator = new Random();
	        Card temp;

	        for (int a=1; a<=4; a++)
	        {
	            for (int b=1; b<=13; b++)
	             {
	               cards.add( new Card(a,b) );
	             }
	        }

	       int size  ;     

	        for (int i=0; i<100; i++)
	        {
	            index_1 = generator.nextInt( cards.size() - 1 );
	            index_2 = generator.nextInt( cards.size() - 1 );

	            temp = cards.get( index_2 );
	            cards.set( index_2 , cards.get( index_1 ) );
	            cards.set( index_1, temp );
	        }
	    }

	    public Card drawFromDeck()
	    {       
	        return cards.remove( 0 );
	    }

	    public int getTotalCards()
	    {
	        return cards.size();
	    }
	    
	    public void  shuffleCards() {
	    	
	    	 //Collections.shuffle(cards);
	    	 //System.out.println(cards);
	    	
	    }
	    public void deal() {
	    	
	    }
	    public void reset() {
	    	
	    }

		@Override
		public String toString() {
			return "Deck [cards=" + cards + "]";
		}
	    

}
