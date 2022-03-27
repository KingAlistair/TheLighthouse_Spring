package com.thelighthouse;

import java.util.ArrayList;

public class DataBase {

    public static ArrayList<Player> getPlayerList() {
        ArrayList<Player> playerList = new ArrayList<>();


        Player player1 = new Player("Tim",20,100,10,10,10,10,10,1,1);
        Player player2 = new Player("Bob",100,100,100,100,100,100,10,2,1);

        playerList.add(player1);
        playerList.add(player2);

        return playerList;
    }

}
