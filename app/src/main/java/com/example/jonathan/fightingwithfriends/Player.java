package com.example.jonathan.fightingwithfriends;

/**
 * Created by Jonathan on 2/18/2017.
 * @author Jonathan
 * This class is for the players
 * Players will have:
 * Names
 * Leaderboard rankings
 * Health points
 * Stamina points
 *
 */

public class Player {
    String name;
    //Health points
    int HP = 5;
    //Will store player moves per round
    int []moves = new int [3];
    public Player(String nameIn){
        name = nameIn;
    }
}
