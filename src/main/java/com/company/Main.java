package com.company;
import java.lang.String;


public class Main {


    public static void main(String[] args) {
        Game game = new Game();

        //created new players
        Player player1 = new Player("Bill");
        Player player2 = new Player("Rosy");

        //added players to game
       /* game.addPlayer("Bill");
        game.addPlayer("Rosy");

        //deal each player cards
        game.drawCard();
        System.out.println("deck after drawing is " + game.d1.deck);

        //read hands and player list - test
        System.out.println("Bill's hand is " + player1.hand);
        System.out.println("Rosy's hand is " + player2.hand);
        System.out.println("hands are :" + game.playerList.values());
        System.out.println("entries are :" + game.playerList.entrySet()); //NOTE:
        //currently the players in the list aren't the same as the players created in main method. must fix*/

        Deck test = new Deck();
        for( Card card: test.deck){
            System.out.println(card.getFace() + card.getSuit());
        }
    }
}
