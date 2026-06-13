/*
 * Lección 02 - Solución completa: variables y tipos de datos.
 *
 * El starter pedía guardar datos de una ficha de estudiante. Esta solución
 * separa cada dato en una variable con tipo y nombre claro antes de imprimirlo.
 */
public class Main {
    public static void main(String[] args) {
        // String guarda texto. Es útil para nombres, cursos y mensajes.
        String studentName = "Valeria";
        String courseName = "Java Fundamentals";

        // int guarda números enteros, como edad, asistencias o calificaciones.
        int age = 15;
        int attendanceCount = 3;
        int grade = 0;

        // double guarda números con decimales.
        double averageGrade = 18.5;

        // boolean guarda una respuesta lógica: true o false.
        boolean active = true;

        // La salida combina etiquetas fijas con valores guardados en variables.
        System.out.println("FICHA DE ESTUDIANTE");
        System.out.println("Nombre: " + studentName);
        System.out.println("Edad: " + age);
        System.out.println("Promedio: " + averageGrade);
        System.out.println("Activo en el curso: " + active);
        System.out.println("Curso: " + courseName);
        System.out.println("Asistencias registradas: " + attendanceCount);
        System.out.println("Calificación inicial: " + grade);
        System.out.println("Registro generado en Java");
    }
}
