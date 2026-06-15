/*
 * Lesson 06 - Complete solution: final project entry point.
 * Lección 06 - Solución completa: punto de entrada del proyecto final.
 *
 * Main does not contain the game logic. It only creates Game and calls start to
 * maintain a clear separation between bootstrap and main behavior.
 * Main no contiene la lógica del juego. Solo crea Game y llama start para
 * mantener una separación clara entre arranque y comportamiento principal.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
