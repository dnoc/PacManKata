package com.audition;


public class PacManGame {
    String[][] field;
    PacMan pacMan;

    PacManGame() {
        field = initializeField();
        pacMan = new PacMan(1,1);
    }

    private String[][] initializeField() {
        int x = 3;
        int y = 3;
        field = new String[x][y];
        for (x = 3; x > 0; x--) {
            for (y = 3; y > 0; y--) {
                if ((x == 2) && (y == 2)) {
                    field[x-1][y-1] = "V";
                } else {
                    field[x-1][y-1] = ".";
                }
            }
        }
        return field;
    }


    private void move (int xChange, int yChange) {
        pacMan.x += xChange;
        pacMan.y += yChange;
        field[pacMan.x][pacMan.y] = pacMan.direction;
    }

    public void tick() {
        /*
        I wanted to put this logic in pacMan but then it would need access to field.
        Also putting this in its own method makes tick just call move().
         */
        switch (pacMan.direction) {
            case "V":
                move(0,-1);
                break;
            case "^":
                move(0,1);
                break;
            case ">":
                move(-1,0);
                break;
            case "<":
                move(1,0);
                break;
            default:
                break;
        }
    }
}

