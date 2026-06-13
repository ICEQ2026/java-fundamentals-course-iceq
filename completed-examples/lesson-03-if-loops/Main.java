/*
 * Lección 03 - Solución completa: condiciones y bucles.
 *
 * Este ejemplo simula varios intentos para encontrar un número esperado.
 * El objetivo es practicar for, if, else if, else y break antes del proyecto final.
 */
public class Main {
    public static void main(String[] args) {
        int expectedNumber = 7;
        int[] guesses = {3, 9, 7, 2, 1};
        boolean found = false;

        // El for recorre los intentos en orden. attempt empieza en 1 para imprimirlo mejor.
        for (int attempt = 1; attempt <= guesses.length; attempt++) {
            int guess = guesses[attempt - 1];
            System.out.println("Intento " + attempt + ": " + guess);

            // La primera condición revisa el caso ganador.
            if (guess == expectedNumber) {
                System.out.println("Número correcto.");
                found = true;
                break;
            } else if (guess < expectedNumber) {
                // Si el intento es menor, el programa entrega una pista.
                System.out.println("El valor esperado es mayor.");
            } else {
                // Si no es igual ni menor, entonces necesariamente es mayor.
                System.out.println("El valor esperado es menor.");
            }
        }

        // Esta revisión final evita imprimir derrota cuando el número sí fue encontrado.
        if (!found) {
            System.out.println("No se encontró el número esperado.");
        }
    }
}
