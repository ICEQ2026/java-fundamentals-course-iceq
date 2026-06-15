/*
 * Groups console messages used by the final project.
 * Agrupa los mensajes de consola usados por el proyecto final.
 *
 * Keeping messages here avoids scattering repeated text across Game. This
 * class should print messages only; it should not read input or change score.
 * Mantener los mensajes aquí evita dispersar texto repetido a lo largo de Game. Esta
 * clase solo debe imprimir mensajes; no debe leer entradas ni cambiar el puntaje.
 */
public class GameMessage {
    public static void printWelcome() {
        System.out.println("Aventura del Número Secreto");
        System.out.println("Resuelve rondas, administra intentos y acumula puntaje.");
    }
}
