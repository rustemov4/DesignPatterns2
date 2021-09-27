package com.company;
import java.util.HashMap;

public class Player implements Observer{
    String nickName;
    public Player(String nickName){
        this.nickName = nickName;
    }
    @Override
    public void notifyKilled(String name, HashMap<String,Player> players){
        System.out.println("Dear " + nickName + ", the player "+ name +" was just killed. The total number of players is " + players.size());
    }
}
