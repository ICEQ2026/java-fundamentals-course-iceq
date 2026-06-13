/*
 * Lesson 05: Supporting class
 *
 * Goal:
 * Read an already completed class and use it from Main.
 *
 * Context:
 * This file is intentionally almost complete. Its purpose is to show that a
 * program can have more than one class. Player represents a person or
 * participant; TreasureRoom represents a place with a name and a limit.
 *
 * Student work:
 * Use this class from Main after Player works. Notice how the constructor
 * receives the data needed to create a useful object.
 */

public class TreasureRoom {
    String roomName;
    int secretLimit;

    public TreasureRoom(String roomName, int secretLimit) {
        this.roomName = roomName;
        this.secretLimit = secretLimit;
    }

    public String getDescription() {
        return "Sala: " + roomName + " | Números posibles: 1 a " + secretLimit;
    }
}
