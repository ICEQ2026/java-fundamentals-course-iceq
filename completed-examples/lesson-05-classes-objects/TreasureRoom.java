/*
 * Lección 05 - Solución completa: clase de apoyo TreasureRoom.
 *
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
        // El método arma una descripción lista para imprimir desde Main.
        return "Sala: " + roomName + " | Números posibles: 1 a " + secretLimit;
    }
}
