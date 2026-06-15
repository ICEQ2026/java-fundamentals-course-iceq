/*
 * Lesson 05: Supporting class
 * Lección 05: Clase de apoyo
 *
 * Goal:
 * Read an already completed class and use it from Main.
 *
 * Meta:
 * Leer una clase ya completada y usarla desde Main.
 *
 * Context:
 * This file is intentionally almost complete. Its purpose is to show that a
 * program can have more than one class. Player represents a person or
 * participant; TreasureRoom represents a place with a name and a limit.
 *
 * Contexto:
 * Este archivo está intencionalmente casi completo. Su propósito es mostrar que un
 * programa puede tener más de una clase. Player representa a una persona o
 * participante; TreasureRoom representa un lugar con un nombre y un límite.
 *
 * Student work / Trabajo del estudiante:
 * Use this class from Main after Player works. Notice how the constructor
 * receives the data needed to create a useful object.
 * Usa esta clase desde Main después de que Player funcione. Observa cómo el constructor
 * recibe los datos necesarios para crear un objeto útil.
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
