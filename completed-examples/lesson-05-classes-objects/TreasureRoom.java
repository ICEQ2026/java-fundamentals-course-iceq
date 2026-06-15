/*
 * Lesson 05 - Complete solution: supporting class TreasureRoom.
 * Lección 05 - Solución completa: clase de apoyo TreasureRoom.
 *
 * This class shows that a program can be divided into several concepts.
 * The room has a name and a limit of possible numbers.
 * Esta clase muestra que un programa puede dividirse en varios conceptos.
 * La sala tiene nombre y límite de números posibles.
 */
public class TreasureRoom {
    private String roomName;
    private int secretLimit;

    public TreasureRoom(String roomName, int secretLimit) {
        this.roomName = roomName;
        this.secretLimit = secretLimit;
    }

    public String getDescription() {
        // The method builds a description ready to print from Main.
        // El método arma una descripción lista para imprimir desde Main.
        return "Sala: " + roomName + " | Números posibles: 1 a " + secretLimit;
    }
}
