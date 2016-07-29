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

    @Test
    public void pacManMovesUp() {
        game.pacMan.up();
        game.tick();
        assertEquals(game.field[1][0], "V");
    }

    @Test
    public void pacManMovesDown() {
        game.pacMan.down();
        game.tick();
        assertEquals(game.field[1][2], "^");
    }

    @Test
    public void pacManMovesLeft() {
        game.pacMan.left();
        game.tick();
        assertEquals(game.field[0][1], ">");
    }
    @Test
    public void pacManMovesRight() {
        game.pacMan.right();
        game.tick();
        assertEquals(game.field[2][1], "<");
    }

    @Test
    public void pacManDoesNotMoveOutOfBoundsUp() {
        game.pacMan.up();
        game.tick();
        game.pacMan.up();
        game.tick();
        assertEquals(game.field[1][0], "V");
    }

    @Test
    public void pacManDoesNotMoveOutOfBoundsDown() {
        game.pacMan.down();
        game.tick();
        game.pacMan.down();
        game.tick();
        assertEquals(game.field[1][2], "^");
    }

    @Test
    public void pacManDoesNotMoveOutOfBoundsLeft() {
        game.pacMan.left();
        game.tick();
        game.pacMan.left();
        game.tick();
        assertEquals(game.field[0][1], ">");
    }

    @Test
    public void pacManDoesNotMoveOutOfBoundsRight() {
        game.pacMan.right();
        game.tick();
        game.pacMan.right();
        game.tick();
        assertEquals(game.field[2][1], "<");
    }
}
