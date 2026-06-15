/*
 * Lesson 06: Encapsulated Player
 * Lección 06: Jugador encapsulado
 *
 * Goal:
 * Protect object data with private fields and expose behavior through methods.
 *
 * Meta:
 * Proteger los datos del objeto con campos privados y exponer su comportamiento a través de métodos.
 *
 * Context:
 * Encapsulation means other classes should not change Player's internal data
 * directly. Game can ask Player to add points, but Player decides whether the
 * change is valid.
 *
 * Contexto:
 * La encapsulación significa que otras clases no deben cambiar los datos internos de Player
 * directamente. Game puede pedirle a Player que agregue puntos, pero Player decide si el
 * cambio es válido.
 *
 * Student work / Trabajo del estudiante:
 * 1. Complete the constructor.
 *    Completa el constructor.
 * 2. Keep name and score private.
 *    Mantén name y score privados.
 * 3. Return data through getters.
 *    Retorna los datos a través de getters.
 * 4. Change score only through addScore.
 *    Cambia el puntaje solo a través de addScore.
 * 5. Ignore negative points so the object protects its own state.
 *    Ignora los puntos negativos para que el objeto proteja su propio estado.
 */

public class Player {
    private String name;
    private int score;

    public Player(String name) {
        // TODO 1: Assign the parameter name to this.name.
        // TODO 2: Initialize score with 0.
        //
        // Asigna el parámetro name a this.name.
        // Inicializa score con 0.
        
    }

    public String getName() {
        return this.name;
    }

    public void addScore(int points) {
        // TODO 3: Add points to score only when points is greater than 0.
        //
        // Agrega puntos a score solo cuando points sea mayor que 0.
        
    }
}
