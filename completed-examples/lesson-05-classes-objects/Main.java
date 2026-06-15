/*
 * Lesson 05 - Complete solution: classes and objects.
 * Lección 05 - Solución completa: clases y objetos.
 *
 * Main creates objects and coordinates the example. Player and TreasureRoom keep
 * their own data so that not everything lives within a single class.
 * Main crea objetos y coordina el ejemplo. Player y TreasureRoom conservan
 * sus propios datos para que no todo viva dentro de una sola clase.
 */
public class Main {
    public static void main(String[] args) {
        // new constructs concrete objects from the Player class.
        // new construye objetos concretos a partir de la clase Player.
        Player firstPlayer = new Player("Valeria");
        Player secondPlayer = new Player("Mateo");

        // Each object maintains its own score.
        // Cada objeto mantiene su propio puntaje.
        firstPlayer.addScore(50);
        secondPlayer.addScore(30);

        // TreasureRoom represents another concept of the program with its own data.
        // TreasureRoom representa otro concepto del programa con sus propios datos.
        TreasureRoom practiceRoom = new TreasureRoom("Sala de práctica", 10);

        System.out.println("Datos de jugadores");
        System.out.println(firstPlayer.getName() + ": " + firstPlayer.getScore() + " puntos");
        System.out.println(secondPlayer.getName() + ": " + secondPlayer.getScore() + " puntos");
        System.out.println(practiceRoom.getDescription());
    }
}
