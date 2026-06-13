/*
 * Lección 05 - Solución completa: clases y objetos.
 *
 * Main crea objetos y coordina el ejemplo. Player y TreasureRoom conservan
 * sus propios datos para que no todo viva dentro de una sola clase.
 */
public class Main {
    public static void main(String[] args) {
        // new construye objetos concretos a partir de la clase Player.
        Player firstPlayer = new Player("Valeria");
        Player secondPlayer = new Player("Mateo");

        // Cada objeto mantiene su propio puntaje.
        firstPlayer.addScore(50);
        secondPlayer.addScore(30);

        // TreasureRoom representa otro concepto del programa con sus propios datos.
        TreasureRoom practiceRoom = new TreasureRoom("Sala de práctica", 10);

        System.out.println("Datos de jugadores");
        System.out.println(firstPlayer.getName() + ": " + firstPlayer.getScore() + " puntos");
        System.out.println(secondPlayer.getName() + ": " + secondPlayer.getScore() + " puntos");
        System.out.println(practiceRoom.getDescription());
    }
}
