package com.mankatha;
import java.util.*;

public class Player {
	private int betValue;
	private Card chosenCard;
	private String chosenOrientation;
	
	public Player() {
		
	}
	
	public Player(int betValue, Card chosenCard, String chosenOrientation) {
		this.betValue = betValue;
		this.chosenCard = chosenCard;
		this.chosenOrientation = chosenOrientation;
	}

	public int getBetValue() {
		return betValue;
	}

	public void setBetValue(int betValue) {
		this.betValue = betValue;
	}

	public Card getChosenCard() {
		return chosenCard;
	}

	public void setChosenCard(Card chosenCard) {
		this.chosenCard = chosenCard;
	}

	public String getChosenOrientation() {
		return chosenOrientation;
	}

	public void setChosenOrientation(String chosenOrientation) {
		this.chosenOrientation = chosenOrientation;
	}

	public void ChosenCard() {
		
	}
	
	public void ChosenOrientation() {
		
	}

}
