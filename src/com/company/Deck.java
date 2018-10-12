package com.company;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Demetrius on 10/11/18.
 */
public class Deck extends Cards {
    ArrayList<String> deck = new ArrayList<>();

    public ArrayList<String> createDeck() {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < face.length; j++) {
                deck.add(face[j] + suit[i]);
            }
        }
        System.out.println("Deck created. Size: " + deck.size());

        return deck;

    }


    public Deck(){
        createDeck();
    }

}
