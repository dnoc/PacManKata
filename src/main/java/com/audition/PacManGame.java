package com.audition;


public class PacManGame {
    String[][] field;

    PacManGame() {
        field = initializeField();
    }

    private String[][] initializeField() {
        int x = 3;
        int y = 3;
        field = new String[x][y];
        while (x > 0) {
            while (y > 0) {
                if ((x == 2) && (y == 2)) {
                    field[x-1][y-1] = "V";
                } else {
                    field[x-1][y-1] = ".";
                }
                y--;
            }
            x--;
        }
        return field;
    }
}
