package com.example.jonathan.fightingwithfriends;

import java.util.Scanner;

/**
 * Created by Jonathan on 2/18/2017.
 * A turn-based fighting game using similar tools to that of "Words with Friends"
 */

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to fighting with friends!\nPlayer 1, enter your name: ");
        String player1Name = s.nextLine();
        Player p1 = new Player(player1Name);
        System.out.println("Player 2, enter your name: ");
        String player2Name = s.nextLine();
        Player p2 = new Player(player2Name);
        double startingAttacker = Math.random();
        boolean p1Start = startingAttacker <= .5;
        while (p1.HP > 0 && p2.HP >0) {
            Player attackingP;
            Player defendingP;
            if (p1Start) {
                System.out.println(player1Name + " is attacking\n" + player2Name + " is defending!");
                attackingP = p1;
                defendingP = p2;
            } else {
                System.out.println(player2Name + " is attacking\n" + player1Name + " is defending!");
                attackingP = p2;
                defendingP = p1;
            }
            System.out.println(attackingP.name + " holds " + attackingP.HP + " points of health.");
            System.out.println(defendingP.name + " holds " + defendingP.HP + " points of health.");
            System.out.println(attackingP.name + ", first move:");
            attackingP.moves[0] = s.nextInt();
            System.out.println(attackingP.name + ", second move:");
            attackingP.moves[1] = s.nextInt();
            System.out.println(attackingP.name + ", last move:");
            attackingP.moves[2] = s.nextInt();
            System.out.println(defendingP.name + " your defense!");
            System.out.println(attackingP.name + ", first move:");
            defendingP.moves[0] = s.nextInt();
            System.out.println(attackingP.name + ", second move:");
            defendingP.moves[1] = s.nextInt();
            System.out.println(attackingP.name + ", last move:");
            defendingP.moves[2] = s.nextInt();
            int damage = 0;
            for (int i = 0; i < attackingP.moves.length; i++){
             if (attackingP.moves[i] != defendingP.moves[i]){
                 damage++;
             }
            }
            if (damage == 0){
                System.out.print(defendingP.name + " has defended all attacks and counters!");
                System.out.println(attackingP.name + " has taken 2 HP of damage!");
                attackingP.HP-=2;
            }else{
                System.out.println(attackingP.name + " lands " + damage + " blows!");
                System.out.println(defendingP.name + " has taken " + damage + " HP of damage!");
                defendingP.HP-=damage;
            }
            p1Start = !p1Start;
        }
        System.out.println();
    }
}
