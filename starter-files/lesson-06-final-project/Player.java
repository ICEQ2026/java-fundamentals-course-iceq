/*
 * Lesson 06: Encapsulated Player
 *
 * Goal:
 * Protect object data with private fields and expose behavior through methods.
 *
 * Context:
 * Encapsulation means other classes should not change Player's internal data
 * directly. Game can ask Player to add points, but Player decides whether the
 * change is valid.
 *
 * Student work:
 * 1. Complete the constructor.
 * 2. Keep name and score private.
 * 3. Return data through getters.
 * 4. Change score only through addScore.
 * 5. Ignore negative points so the object protects its own state.
 */

public class Player {
    private String name;
    private int score;

    public Player(String name) {
        // TODO 1: Assign the parameter name to this.name.
        // TODO 2: Initialize score with 0.
        
    }

    public String getName() {
        return this.name;
    }

    public void addScore(int points) {
        // TODO 3: Add points to score only when points is greater than 0.
        
    }
}
