/*
 * Lesson 03 - Complete solution: conditions and loops.
 * Lección 03 - Solución completa: condiciones y bucles.
 *
 * This example simulates several attempts to find an expected number.
 * The goal is to practice for, if, else if, else and break before the final project.
 * Este ejemplo simula varios intentos para encontrar un número esperado.
 * El objetivo es practicar for, if, else if, else y break antes del proyecto final.
 */
public class Main {
    public static void main(String[] args) {
        int expectedNumber = 7;
        int[] guesses = {3, 9, 7, 2, 1};
        boolean found = false;

        // The for loop iterates through guesses in order. attempt starts at 1 for cleaner print.
        // El for recorre los intentos en orden. attempt empieza en 1 para imprimirlo mejor.
        for (int attempt = 1; attempt <= guesses.length; attempt++) {
            int guess = guesses[attempt - 1];
            System.out.println("Intento " + attempt + ": " + guess);

            // The first condition checks the winning case.
            // La primera condición revisa el caso ganador.
            if (guess == expectedNumber) {
                System.out.println("Número correcto.");
                found = true;
                break;
            } else if (guess < expectedNumber) {
                // If the guess is lower, the program provides a hint.
                // Si el intento es menor, el programa entrega una pista.
                System.out.println("El valor esperado es mayor.");
            } else {
                // If it is neither equal nor lower, then it must be higher.
                // Si no es igual ni menor, entonces necesariamente es mayor.
                System.out.println("El valor esperado es menor.");
            }
        }

        // This final check prevents printing defeat when the number was indeed found.
        // Esta revisión final evita imprimir derrota cuando el número sí fue encontrado.
        if (!found) {
            System.out.println("No se encontró el número esperado.");
        }
    }
}
