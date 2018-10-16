package com.company;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Demetrius on 10/12/18.
 */
public class testDeck {

    @Test
    public void createDeckTest(){
        Deck testDeck = new Deck();
        Assert.assertEquals(52,testDeck.deck.size());
    }

}
