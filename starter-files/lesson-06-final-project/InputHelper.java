import java.util.Scanner;

/*
 * Small helper for console input.
 *
 * Game asks for information; InputHelper handles how that information is read.
 * This keeps Scanner usage in one predictable place.
 *
 * Starter limitation:
 * readNumber expects a valid integer. Later this can be improved with error
 * handling, but the first version keeps the flow easy to read.
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
        // Starter note:
        // If the user writes text instead of a number, Java will throw
        // NumberFormatException. The completed example may improve this later.
        return Integer.parseInt(scanner.nextLine());
    }
}
