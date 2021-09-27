package com.company;
import java.util.HashMap;
import java.util.Map;

public class Game implements Observed{

    public HashMap<String,Player> players = new HashMap<String,Player>(10);
    @Override
    public void AddPlayer(Player player){
        players.put(player.nickName, player);
    }
    @Override
    public void DeletePlayer(Player player){
        String k = getKey(player);
        players.values().remove(player);
        notifyAllPlayers(k);
    }
    @Override
    public void notifyAllPlayers(String key){
        for(Map.Entry<String,Player> entry: players.entrySet()){
            entry.getValue().notifyKilled(key,this.players);
        }
    }
    String key;
    public String getKey(Player player){

        for(Map.Entry<String,Player> entry: players.entrySet()){
           if(entry.getValue() == player){
               key = entry.getKey();
           }
        }
        return key;
    }
}
