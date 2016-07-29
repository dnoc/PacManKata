package com.audition;


public class PacManGame {
    String[][] field;
    PacMan pacMan;
    int score;

    PacManGame() {
        field = initializeField();
        pacMan = new PacMan(1,1);
        score = 0;
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
        field[pacMan.x][pacMan.y] = " ";

        pacMan.x += xChange;
        if (pacMan.x < 0) {
            pacMan.x = 0;
        } else if (pacMan.x > 2) {
            pacMan.x = 2;
        }

        pacMan.y += yChange;
        if (pacMan.y < 0) {
            pacMan.y = 0;
        } else if (pacMan.y > 2) {
            pacMan.y = 2;
        }

        field[pacMan.x][pacMan.y] = pacMan.direction;
    }

    private void eat(int x, int y) {
        if ((x >= 0) && (x <= 2) &&
                (y >= 0) && (y <= 2) &&
                (field[x][y].equals("."))) {
            score++;
        }
    }

    public void tick() {
        /*
        I wanted to put this logic in pacMan but then it would need access to field.
        Also putting this in its own method makes tick just call move().
         */
        switch (pacMan.direction) {
            case "V":
                eat(pacMan.x,pacMan.y + 1);
                move(0,-1);
                break;
            case "^":
                eat(pacMan.x,pacMan.y - 1);
                move(0,1);
                break;
            case ">":
                eat(pacMan.x + 1,pacMan.y);
                move(-1,0);
                break;
            case "<":
                eat(pacMan.x - 1,pacMan.y);
                move(1,0);
                break;
            default:
                break;
        }
    }
}

