package com.thelighthouse;

import java.util.ArrayList;

public class DataBase {

    public static ArrayList<Player> getPlayerList() {
        ArrayList<Player> playerList = new ArrayList<>();


        Player player1 = new Player("Tim", "Farm boy", 20, 100, 20, 12, 10, 8, 1, 1, 1);
        Player player2 = new Player("Bob", "Hermit", 100, 100, 100, 100, 100, 100, 10, 2, 5);

        playerList.add(player1);
        playerList.add(player2);

        return playerList;
    }

    public static Player createPlayer(String name, String background) {

        Player player = new Player();

        if (background.equals("Farm boy")) {
            player = new Player(name, "Farm boy", 20, 100, 14, 12, 10, 8, 1, 1, 0);
        }

        if (background.equals("Toymaker")) {
            player = new Player(name, "Toymaker", 15, 100, 12, 10, 12, 10, 1, 1, 0);
        }

        if (background.equals("Hermit")) {
            player = new Player(name, "Hermit", 10, 100, 8, 8, 10, 16, 1, 1, 0);
        }

        return player;
    }

    public static ArrayList<String> getStoryList() {
        ArrayList<String> storyList = new ArrayList<>();

        String story0 = "You dont remember when you fel asleep, but you wake to the gently rocking of a boat. " +
                "You smell to salt in the air, and hear the sounds of the waves as they politely hit the sides of your vessel.";

        String story1 = "You notice the captain, as he silently steers the boat ahead. You haven't heard him " +
                " speak a single word during the whole trip. After a while, you look up and see " +
                "the lighthouse on a little island in the middle of the sea.";
        String story2 = "What is your name?";
        String story3 = "What did you do before this?";
        String story4 = "Farm boy: I used to work on a farm in the middle of nowhere. It kept me fit and occupied. Also learned some good recipes.";
        String story5 = "Toymaker: Spent most of my childhood making and selling gadgets. If you can take apart something and know how to put it back together, you also know how to repair it";
        String story6 = "Hermit: Leaving society behind to explore the secrets of nature is just what I need to finally finish my book and earn the respect of the science community.";

        storyList.add(story0);
        storyList.add(story1);
        storyList.add(story2);
        storyList.add(story3);
        storyList.add(story4);
        storyList.add(story5);
        storyList.add(story6);

        return storyList;
    }

}
