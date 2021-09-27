package com.company;

public interface Observed {
    void AddPlayer(Player player);

    void DeletePlayer(Player player);

    void notifyAllPlayers(String key);

}
