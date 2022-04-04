package com.infogalaxy;

import java.util.Random;

    public class SnakeLadder {

        //UC-1-Snake And Ladder Game Played With Single Player At 0 Position.

        public void addPosition() {
        // Position Of Player
            int position = 0;
            System.out.println("Player Position Is :" + position);
        }

        public void addDice() {
        // UC-2-Player Rolls The Die To Get Number Between 1 To 6.
            Random random = new Random();
            int dice = (int) ((Math.random() * (6 - 1)) + 1);
            System.out.println("Dice Number :" + dice);
        }

        public static void main(String[] args) {
            SnakeLadder player = new SnakeLadder();
        // Rolling The Dice
            player.addPosition();
            player.addDice();
        }
    }