package com.company;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Demetrius on 10/11/18.
 */
public class Game {
    Deck d1 = new Deck();
    HashMap<String, ArrayList<Card>> playerList = new HashMap<String, ArrayList<Card>>();

    public void addPlayer(String playerName) {
        playerList.put(playerName, new ArrayList<Card>());
    }

    public Card drawCard() {
        double randomDub = (Math.random() * d1.deck.size());
        int randomInt = (int) randomDub;

        Card drawnCard = d1.deck.get(randomInt);
        d1.deck.remove(drawnCard);
        System.out.println("drawn card is " + drawnCard.getFace() + drawnCard.getSuit());
        return drawnCard;
    }

    public void dealCards(){
        for (ArrayList<Card> hand : playerList.values()){
            int i = 0;
            hand.add(drawCard()); i++;
            hand.add(drawCard()); i++;
        }
    }
}
