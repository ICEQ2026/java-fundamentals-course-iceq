/*
 * Lección 06 - Solución completa: mensajes del juego.
 *
 * Esta clase concentra los textos de consola. Separar los mensajes evita que
 * Game mezcle reglas del juego con demasiadas líneas de impresión.
 */
public class GameMessage {
    public static void printWelcome() {
        System.out.println(" Aventura del Número Secreto");
        System.out.println("Proyecto final de consola en Java");
    }

    public static void printRules(String playerName) {
        System.out.println();
        System.out.println("Hola, " + playerName + ". Tu misión es adivinar números secretos.");
        System.out.println("Si fallas, pierdes una vida. Si aciertas, ganas puntos.");
        System.out.println("Usa las pistas para mejorar tus intentos.");
    }

    public static void printLevelIntro(String levelName, int limit, int attempts, int lives) {
        System.out.println();
        System.out.println("--- Nivel: " + levelName + " ---");
        System.out.println("Número secreto entre 1 y " + limit + ".");
        System.out.println("Intentos disponibles: " + attempts + ". Vidas actuales: " + lives + ".");
    }

    public static void printHint(int guess, int secretNumber, int lives) {
        if (guess < secretNumber) {
            System.out.println("Pista: el número secreto es mayor.");
        } else {
            System.out.println("Pista: el número secreto es menor.");
        }

        if (lives > 0) {
            System.out.println("Vidas restantes: " + lives + ".");
        } else {
            System.out.println("Te quedaste sin vidas.");
        }
    }

    public static void printWin(int points) {
        System.out.println("¡Correcto! Ganaste " + points + " puntos.");
    }

    public static void printRoundLost(int secretNumber) {
        System.out.println("No adivinaste esta ronda. El número era " + secretNumber + ".");
    }

    public static void printFinalSummary(Player player) {
        System.out.println();
        System.out.println("Resumen final");
        System.out.println("Jugador: " + player.getName());
        System.out.println("Título: " + player.getTitle());
        System.out.println("Puntaje final: " + player.getScore());
        System.out.println("Rondas ganadas: " + player.getRoundsWon());
        System.out.println("Vidas restantes: " + player.getLives());
        System.out.println("Gracias por jugar y aprender Java.");
    }
}
