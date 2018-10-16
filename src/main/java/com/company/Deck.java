package com.company;

import java.util.ArrayList;

/**
 * Created by Demetrius on 10/11/18.
 */
public class Deck extends Card {

    public Deck(){
        createDeck();
    }

    private String face[] = new String[] {"2","3","4","5","6","7","8","9","T","J","Q","K","A"};
    private String suit[] = new String[] {"S","D","C","H"};

    ArrayList<Card> deck = new ArrayList<Card>();

    public void createDeck() {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < face.length; j++) {
                Card card = new Card();
                card.setFace(face[j]);
                card.setSuit(suit[i]);
                deck.add(card);
            }
        }
        System.out.println("new deck created " + deck);

    }
}
