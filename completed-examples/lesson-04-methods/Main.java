import java.util.Scanner;

/*
 * Lección 04 - Solución completa: métodos y entrada por consola.
 *
 * Main coordina la lectura y la salida. Las operaciones con responsabilidad
 * clara se separan en métodos para que el programa sea más fácil de leer.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printStartMessage();

        // Scanner permite leer datos escritos por el usuario en la consola.
        System.out.print("Ingresa el primer número: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int secondNumber = scanner.nextInt();

        // El cálculo se delega a un método con nombre descriptivo.
        int result = add(firstNumber, secondNumber);
        printResult(firstNumber, secondNumber, result);

        // Cerrar Scanner libera el recurso al final del programa.
        scanner.close();
    }

    public static void printStartMessage() {
        System.out.println("CALCULADORA DE PRÁCTICA");
        System.out.println("Este programa suma dos números enteros.");
    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void printResult(int firstNumber, int secondNumber, int result) {
        System.out.println(firstNumber + " + " + secondNumber + " = " + result);
    }
}
