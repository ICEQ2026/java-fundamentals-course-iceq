/*
 * Lección 05 - Solución completa: clase Player.
 *
 * Player modela a un participante. Sus atributos son private para que otras
 * clases usen métodos en lugar de modificar los datos directamente.
 */
public class Player {
    private String name;
    private int score;

    public Player(String name) {
        // El constructor recibe el dato mínimo para crear un jugador válido.
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public void addScore(int points) {
        // La condición evita que un puntaje negativo reduzca el total por error.
        if (points > 0) {
            this.score = this.score + points;
        }
    }
}
