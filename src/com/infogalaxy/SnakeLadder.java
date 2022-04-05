package com.infogalaxy;

import java.util.Random;

    public class SnakeLadder {
        //Position Of Player
        int position = 0;
        //Define Constant For Options
        final int NO_PLAY = 1;
        final int LADDER = 2;
        final int SNAKE = 3;

        //Showing Void Player Current Position
        public void showPosition(){
            System.out.println("Position :" +position);
        }
        //Rolling The Die To Get Position
        public void rollDie() {
            int dieNo = (int) ((Math.random()*6-1)+1);
            System.out.println("Dice Number :" +dieNo);
            //UC-3-Checking For Options To Play
            int option = (int) ((Math.random()*3-1)+1);
            System.out.println("Option No :" +option);
            switch(option) {
                case NO_PLAY:
                    System.out.println("NO Play Arrived. Stay On Same Position.");
                    break;
                case LADDER:
                    System.out.println("HURRAY !!! You Got Ladder.");
                    position = position + dieNo;
                    break;
                case SNAKE:
                    System.out.println("OOPS !!! You Got Snake.");
                    position = position - dieNo;
                    break;
            }
        }
        public static void main(String [] args) {
            //Creating Player1 Object
            SnakeLadder player1 = new SnakeLadder();
            //Showing Player1 Position
            player1.showPosition();
            //Rolling The Die
            player1.rollDie();
            player1.showPosition();
        }
    }