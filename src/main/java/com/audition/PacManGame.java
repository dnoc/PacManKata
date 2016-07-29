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
}
