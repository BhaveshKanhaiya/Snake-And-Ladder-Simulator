package com.infogalaxy;

public class SnakeLadder {
    //UC-1-Snake And Ladder Game Played With Single Player At 0 Position
    public void addPosition() {
        int position = 0;
        System.out.println("Player Position Is :" + position);
    }
    public static void main(String [] args ) {
        SnakeLadder dice = new SnakeLadder();
        dice.addPosition();
    }
}
