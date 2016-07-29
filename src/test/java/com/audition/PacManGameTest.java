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

    @Test
    public void pacManHasADirection() {
        assertEquals(game.pacMan.direction, "V");
    }

    @Test
    public void pacManCanChangeDirectionUp() {
        game.pacMan.up();
        assertEquals(game.pacMan.direction, "V");
    }

    @Test
    public void pacManCanChangeDirectionDown() {
        game.pacMan.down();
        assertEquals(game.pacMan.direction, "^");
    }

    @Test
    public void pacManCanChangeDirectionLeft() {
        game.pacMan.left();
        assertEquals(game.pacMan.direction, ">");
    }

    @Test
    public void pacManCanChangeDirectionRight() {
        game.pacMan.right();
        assertEquals(game.pacMan.direction, "<");
    }

}
