package com.audition;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PacManGameTest {
    PacManGame game;

    @Before
    public void setup() {
        game = new PacManGame();
    }

    @Test
    public void whenTheGameStartsAFieldIsCreated() {
        assertNotNull(game.field);
    }

    @Test
    public void whenTheGameStartsAPacManIsDisplayed() {
        assertEquals(game.field[1][1], "V");
    }
}
