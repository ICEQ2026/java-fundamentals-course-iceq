/*
 * Lesson 06: Final Project
 * Lección 06: Proyecto Final
 *
 * Goal:
 * Keep the entry point small. Main only starts the program.
 *
 * Meta:
 * Mantener el punto de entrada pequeño. Main solo inicia el programa.
 *
 * Context:
 * A complete console project can become difficult to read if all logic is
 * written in main. This file delegates the real flow to Game.
 *
 * Contexto:
 * Un proyecto de consola completo puede volverse difícil de leer si toda la lógica se
 * escribe en main. Este archivo delega el flujo real a Game.
 *
 * Student work / Trabajo del estudiante:
 * Usually no change is needed here. If something fails, inspect Game first.
 * Usualmente no se necesita ningún cambio aquí. Si algo falla, inspecciona Game primero.
 */

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
