import java.util.Scanner;

/*
 * Lesson 04: Methods and Scanner
 * Lección 04: Métodos y Scanner
 *
 * Goal:
 * Split a small console program into named actions and read one number from
 * the console.
 *
 * Meta:
 * Dividir un pequeño programa de consola en acciones nombradas y leer un número
 * de la consola.
 *
 * Context:
 * main should coordinate the program, not contain every detail. A method gives
 * a name to a repeated or meaningful action. Scanner lets the user type data.
 *
 * Contexto:
 * main debe coordinar el programa, no contener cada detalle. Un método da
 * un nombre a una acción repetida o significativa. Scanner permite al usuario escribir datos.
 *
 * Student work / Trabajo del estudiante:
 * - Create printStartMessage below main.
 *   Crea printStartMessage debajo de main.
 * - Call printStartMessage from main.
 *   Llama a printStartMessage desde main.
 * - Read one integer with scanner.nextInt().
 *   Lee un entero con scanner.nextInt().
 * - Print the number back with a clear sentence.
 *   Imprime el número de vuelta con una frase clara.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO 1:
        // Call printStartMessage() here.
        //
        // Llama a printStartMessage() aquí.
        
        System.out.println("Enter one integer number:");
        // TODO 2:
        // Create an int variable and assign scanner.nextInt() to it.
        //
        // Crea una variable int y asígnale scanner.nextInt().
        
        // TODO 3:
        // Print the number entered by the user.
        // Use a full sentence, not only the number.
        //
        // Imprime el número ingresado por el usuario.
        // Usa una oración completa, no solo el número.
        
    }
    
    // TODO 4:
    // Create a static void method named printStartMessage.
    // It should print one or two lines that explain what the program does.
    //
    // Crea un método static void llamado printStartMessage.
    // Debería imprimir una o dos líneas que expliquen qué hace el programa.
    
}
