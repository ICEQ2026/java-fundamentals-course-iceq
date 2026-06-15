import java.util.Scanner;

/*
 * Coordinates the final console project.
 * Coordina el proyecto final de consola.
 *
 * Main should not contain the full program. This class keeps the flow:
 * welcome message, player creation, rounds, score and closing message.
 * Main no debería contener todo el programa. Esta clase mantiene el flujo:
 * mensaje de bienvenida, creación del jugador, rondas, puntaje y mensaje de cierre.
 *
 * Student work / Trabajo del estudiante:
 * Add the missing final-project flow here after Player and InputHelper are
 * understood. Keep each responsibility in the class where it belongs.
 * Agrega el flujo restante del proyecto final aquí después de que Player e
 * InputHelper sean entendidos. Mantén cada responsabilidad en la clase a la que pertenece.
 */
public class Game {
    private Scanner scanner;
    private InputHelper inputHelper;

    public Game() {
        scanner = new Scanner(System.in);
        inputHelper = new InputHelper(scanner);
    }

    public void start() {
        GameMessage.printWelcome();

        String name = inputHelper.readText("Escribe tu nombre de jugador: ");
        Player player = new Player(name);

        System.out.println("Hola, " + player.getName() + ". Este es el inicio del proyecto final.");
        System.out.println("En este archivo se completarán rondas, reglas, intentos y puntaje.");
        System.out.println("Cada responsabilidad debe mantenerse en la clase correcta.");

        scanner.close();
    }
}
