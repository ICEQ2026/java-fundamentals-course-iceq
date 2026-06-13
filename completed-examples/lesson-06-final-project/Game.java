import java.util.Random;
import java.util.Scanner;

/*
 * Lección 06 - Solución completa: coordinación del juego.
 *
 * Game controla el flujo general: bienvenida, lectura del jugador, niveles,
 * intentos, puntaje, vidas y cierre. Las clases Player, GameMessage e
 * InputHelper separan responsabilidades para que el archivo no haga todo solo.
 */
public class Game {
    private final Scanner scanner;
    private final Random random;
    private final InputHelper inputHelper;

    // Cada posición de estos arreglos representa el mismo nivel.
    private final String[] levelNames = {
        "Bosque de Bits",
        "Cueva de Condiciones",
        "Castillo de Clases"
    };

    private final int[] maxNumbers = {10, 20, 30};
    private final int[] maxAttempts = {4, 5, 6};

    public Game() {
        scanner = new Scanner(System.in);
        random = new Random();
        inputHelper = new InputHelper(scanner);
    }

    public void start() {
        GameMessage.printWelcome();
        String name = inputHelper.readText("Escribe tu nombre de jugador: ");
        Player player = new Player(name);

        GameMessage.printRules(player.getName());

        // El juego avanza nivel por nivel mientras el jugador conserve vidas.
        for (int levelIndex = 0; levelIndex < levelNames.length && player.hasLives(); levelIndex++) {
            playRound(player, levelIndex);
        }

        GameMessage.printFinalSummary(player);
        scanner.close();
    }

    private void playRound(Player player, int levelIndex) {
        String levelName = levelNames[levelIndex];
        int limit = maxNumbers[levelIndex];
        int attemptsAllowed = maxAttempts[levelIndex];
        int secretNumber = random.nextInt(limit) + 1;
        boolean wonRound = false;

        GameMessage.printLevelIntro(levelName, limit, attemptsAllowed, player.getLives());

        // Cada ronda tiene un máximo de intentos y también respeta las vidas restantes.
        for (int attempt = 1; attempt <= attemptsAllowed && player.hasLives(); attempt++) {
            int guess = inputHelper.readNumber(
                "Intento " + attempt + "/" + attemptsAllowed + ". Escribe un número entre 1 y " + limit + ": ",
                1,
                limit
            );

            if (guess == secretNumber) {
                int points = calculatePoints(levelIndex, attempt);
                player.addScore(points);
                player.addRoundWon();
                GameMessage.printWin(points);
                wonRound = true;
                break;
            }

            player.loseLife();
            GameMessage.printHint(guess, secretNumber, player.getLives());
        }

        if (!wonRound && player.hasLives()) {
            GameMessage.printRoundLost(secretNumber);
        }
    }

    private int calculatePoints(int levelIndex, int attempt) {
        int basePoints = (levelIndex + 1) * 50;
        int bonus = Math.max(0, (maxAttempts[levelIndex] - attempt) * 10);
        return basePoints + bonus;
    }
}
