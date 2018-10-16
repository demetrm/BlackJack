package com.company;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by Demetrius on 10/12/18.
 */
public class testGame {
    Game gameTest = new Game();

    @Test
    public void drawCardsTest(){
        Card card = gameTest.drawCard();
        System.out.println(card.getFace() + card.getSuit());
        Assert.assertFalse("should have removed drawn card from deck" , gameTest.d1.deck.contains(card));
    }


    @Test
    public void dealCardsTest(){
        gameTest.addPlayer("P1");
        gameTest.addPlayer("P2");
        gameTest.dealCards();
        Assert.assertEquals(52-(gameTest.playerList.size()*2), gameTest.d1.deck.size());
        System.out.println(gameTest.playerList.get(0));

        System.out.println("hands are :" + gameTest.playerList.get("P1"));
        System.out.println("hands are :" + gameTest.playerList.get("P2"));

    }
}
