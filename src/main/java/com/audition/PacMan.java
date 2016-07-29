package com.audition;


public class PacMan {
    int x;
    int y;
    String direction;

    PacMan(int xPosition, int yPosition) {
        x = xPosition;
        y = yPosition;
        direction = "V";
    }

    public void up() {
        direction = "V";
    }

    public void down() {
        direction = "^";
    }

    public void left() {
        direction = ">";
    }

    public void right() {
        direction = "<";
    }
}
