/*
 * Lección 06 - Solución completa: punto de entrada del proyecto final.
 *
 * Main no contiene la lógica del juego. Solo crea Game y llama start para
 * mantener una separación clara entre arranque y comportamiento principal.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
