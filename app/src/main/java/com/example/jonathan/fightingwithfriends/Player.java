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
    /** The name of this player */
	private String name;
    
	/** The number of health points this player has remaining */
    private int HP;
    
   	/** The moves this player is making */
    private int[] moves;
    
    public Player(String nameIn)
    {
        name = nameIn;
        HP = 5;
        moves = new int [3];
    }
    
    public String getName() { return name; }
    public int getHealth() { return HP; }
    public int[] getMoves() { return moves; }
}
