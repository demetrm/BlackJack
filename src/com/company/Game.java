package com.company;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Demetrius on 10/11/18.
 */
public class Game {

    //create a new deck of 52 cards
    Deck d1 = new Deck();

    //playerList: hashmap of players and their hands - signifies whether playing game
    HashMap<String, ArrayList<String>> playerList = new HashMap<>();

    //add Players to the game (hashmap)
    public void addPlayer(String playerName){
        playerList.put(playerName, new ArrayList<>());
    }

    //use hashmap of player list to assign random cards
    public HashMap dealCards(){
        for (ArrayList<String> playerHand: playerList.values()) { //for each hand in list of players
            for (int j = 0; j < 2; j++) { //count twice for 2 cards

                //draw random number between 0-51 (# cards). convert double to integer
                double randomDub = (Math.random() * d1.deck.size());
                int randomInt = (int) randomDub;

                String card = d1.deck.get(randomInt); //stores random card from deck in variable
                playerHand.add(card); //adds card to current hand index
                d1.deck.remove(card); //removes drawn card from deck so as to not be redrawn

                //System.out.println("Size of deck" + d1.deck.size()); //test
                //System.out.println(d1.deck); //test
            }
        }
        return playerList;
    }



}
