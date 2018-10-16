package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;

/**
 * Created by Demetrius on 10/11/18.
 */
public class Player extends Person{
    public String playerName;
    private int chipCount;
    public int seatNum;

    public  Player(String name){
        playerName = name;
        chipCount = 100;
        System.out.println(playerName + " is a player");
    }
/*placeholder methods below
    public void doubleDown(){

    }

    public void split(){

    }*/
}
