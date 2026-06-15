/*
 * Lesson 02 - Complete solution: variables and data types.
 * Lección 02 - Solución completa: variables y tipos de datos.
 *
 * The starter asked to save student record data. This solution separates each
 * piece of data into a variable with a clear type and name before printing it.
 * El starter pedía guardar datos de una ficha de estudiante. Esta solución
 * separa cada dato en una variable con tipo y nombre claro antes de imprimirlo.
 */
public class Main {
    public static void main(String[] args) {
        // String stores text. It is useful for names, courses, and messages.
        // String guarda texto. Es útil para nombres, cursos y mensajes.
        String studentName = "Valeria";
        String courseName = "Java Fundamentals";

        // int stores whole numbers, such as age, attendance, or grades.
        // int guarda números enteros, como edad, asistencias o calificaciones.
        int age = 15;
        int attendanceCount = 3;
        int grade = 0;

        // double stores numbers with decimals.
        // double guarda números con decimales.
        double averageGrade = 18.5;

        // boolean stores a logical answer: true or false.
        // boolean guarda una respuesta lógica: true o false.
        boolean active = true;

        // The output combines fixed labels with values stored in variables.
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
