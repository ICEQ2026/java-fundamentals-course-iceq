/*
 * Lesson 06: Final Project
 *
 * Goal:
 * Keep the entry point small. Main only starts the program.
 *
 * Context:
 * A complete console project can become difficult to read if all logic is
 * written in main. This file delegates the real flow to Game.
 *
 * Student work:
 * Usually no change is needed here. If something fails, inspect Game first.
 */

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
