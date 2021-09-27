package com.company;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Player player1 = new Player("Azamat");
        Player player2 = new Player("Amir");
        Player player3 = new Player("Nurbek");
        game.AddPlayer(player1);
        game.AddPlayer(player2);
        game.AddPlayer(player3);
        game.DeletePlayer(player2);
    }
}
