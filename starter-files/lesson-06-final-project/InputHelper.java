import java.util.Scanner;

/*
 * Small helper for console input.
 * Pequeño ayudante para la entrada de consola.
 *
 * Game asks for information; InputHelper handles how that information is read.
 * This keeps Scanner usage in one predictable place.
 * Game solicita información; InputHelper maneja cómo se lee esa información.
 * Esto mantiene el uso de Scanner en un lugar predecible.
 *
 * Starter limitation:
 * readNumber expects a valid integer. Later this can be improved with error
 * handling, but the first version keeps the flow easy to read.
 * Limitación del starter:
 * readNumber espera un número entero válido. Más adelante esto se puede mejorar con
 * manejo de errores, pero la primera versión mantiene el flujo fácil de leer.
 */
public class InputHelper {
    private Scanner scanner;

    public InputHelper(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readText(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public int readNumber(String message) {
        System.out.print(message);
        // Starter note / Nota del starter:
        // If the user writes text instead of a number, Java will throw
        // NumberFormatException. The completed example may improve this later.
        // Si el usuario escribe texto en lugar de un número, Java lanzará
        // NumberFormatException. El ejemplo completo puede mejorar esto más adelante.
        return Integer.parseInt(scanner.nextLine());
    }
}
