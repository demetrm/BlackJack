package com.company;
import java.lang.String;


public class Main {


    public static void main(String[] args) {
        Game game = new Game();

        //created new players
        Player player1 = new Player("Bill");
        Player player2 = new Player("Rosy");

        //added players to game
        game.addPlayer("Bill");
        game.addPlayer("Rosy");

        //deal each player cards
        game.dealCards();

        //read hands and player list - test
        System.out.println(player1.hand);
        System.out.println(player2.hand);
        System.out.println(game.playerList.values());
    }
}
