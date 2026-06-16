<p align="center">
  <img src="../../../assets/lesson-06-banner.png" alt="Proyecto final" width="100%">
</p>

<div align="center">

# Lección 06: Quiz y revisión

### Revisa la lógica e integración del proyecto "Número Secreto"

</div>

> **Indicaciones:** selecciona la opción que consideres correcta marcando mentalmente la casilla. Luego despliega la respuesta para verificar tu comprensión de la lógica general.

---

<p align="center">
  <img src="../../../assets/separator.png" alt="Separador visual del curso" width="100%">
</p>

---

## Pregunta 1

**¿Qué clase provista por Java (dentro del paquete `java.util`) es la más adecuada para generar el número aleatorio que el usuario debe adivinar en el juego?**

- [ ] a) `java.util.Scanner`
- [ ] b) `java.util.Random`
- [ ] c) `java.util.System`
- [ ] d) `java.util.ArrayList`

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: b)**

La clase `Random` de `java.util` permite generar diferentes tipos de valores pseudoaleatorios de forma limpia. Por ejemplo, instanciando `Random rnd = new Random();` y llamando a `rnd.nextInt(100) + 1;` generamos un entero aleatorio entre 1 y 100 para usarlo como el número secreto del juego.

</details>

---

## Pregunta 2

**¿Cuál es la función principal del bucle del juego (usualmente implementado con `while`) en el diseño del proyecto final?**

- [ ] a) Cargar todas las librerías necesarias del JDK al inicio de la partida.
- [ ] b) Mantener al programa ejecutándose continuamente, solicitando intentos al jugador y evaluándolos repetidas veces hasta que se cumpla la condición de parada (ganar o quedarse sin intentos).
- [ ] c) Evitar tener que escribir la clase `Player` y centralizar todo el código del juego en una sola clase.
- [ ] d) Limpiar la consola de OnlineGDB después de cada intento del jugador.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: b)**

Un juego interactivo requiere un bucle principal (game loop). Sin él, el programa correría una sola vez, pediría un solo número y terminaría de inmediato. El bucle `while` mantiene activa la partida pidiendo intentos sucesivamente mientras el estado del juego sea "en progreso" (intentos restantes > 0 y no se haya adivinado aún).

</details>

---

## Pregunta 3

**¿Por qué se considera una buena práctica de ingeniería de software separar el código del juego en clases independientes como `Game`, `Player` y `InputHelper`?**

- [ ] a) Porque es un requisito sintáctico obligatorio de Java para poder ejecutar cualquier programa interactivo.
- [ ] b) Reduce el tamaño de los archivos para que OnlineGDB los compile más rápido.
- [ ] c) Sigue el principio de responsabilidad única, facilitando la organización del código, su mantenimiento futuro, la depuración de errores y el trabajo ordenado en equipo.
- [ ] d) Evita tener que usar importaciones de paquetes externos de Java.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: c)**

Si metes toda la lógica en un solo archivo Main, el código se volverá largo, complejo y difícil de entender. Separar responsabilidades (ej: `Player` maneja los datos del jugador; `InputHelper` encapsula la lectura de la consola; `Game` gestiona las reglas de la partida) hace que el proyecto sea modular, limpio y muy fácil de ampliar o corregir.

</details>

---

## Pregunta 4

**En el proyecto del Número Secreto, ¿qué lógica condicional se debe usar para determinar si el intento del usuario es correcto y darle pistas útiles si falla?**

- [ ] a) Un bucle `for` que cuente de 1 a 100 de forma consecutiva.
- [ ] b) Una estructura condicional `if (intento == numeroSecreto)` para la victoria, combinada con un `else if (intento < numeroSecreto)` para indicar que el número es mayor, y un `else` para indicar que es menor.
- [ ] c) Un método de tipo `void` que llame al constructor de la clase `Player` de nuevo.
- [ ] d) Un bloque `try-catch` que capture excepciones lógicas automáticas.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: b)**

Para guiar al jugador hacia la respuesta correcta, no basta con decirle si ganó o perdió. Usar un `else if` adicional para indicarle si el número secreto es mayor o menor que su propuesta ("El número secreto es mayor" o "El número secreto es menor") añade interactividad y permite resolver el enigma utilizando una estrategia lógica.

</details>

---

## Pregunta 5

**¿Cuál es la ventaja de diseñar la clase `GameMessage` para gestionar las cadenas de texto impresas en consola de forma centralizada?**

- [ ] a) Hace que el compilador de Java optimice el rendimiento visual de los mensajes en consola.
- [ ] b) Permite que el programa se ejecute sin requerir una clase contenedora.
- [ ] c) Facilita cambiar los textos en un solo archivo, corregir faltas de ortografía o implementar soporte bilingüe (inglés/español) de forma limpia y ordenada.
- [ ] d) Hace que el objeto `Scanner` funcione de forma más rápida al leer los datos.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: c)**

Si distribuyes los mensajes `System.out.println` por todo el código del juego, cambiar un texto o corregir un error tipográfico te obligará a buscar en múltiples archivos. Centralizarlos en una clase como `GameMessage` (o un diccionario de constantes) permite modificar o traducir toda la interfaz del juego en un único punto del proyecto de manera inmediata.

</details>

---

## Pregunta 6

**¿Por qué es importante reiniciar o inicializar el estado del juego (por ejemplo, definir los intentos en cero y generar un nuevo número secreto) al comenzar una nueva partida?**

- [ ] a) Para liberar la memoria caché que utiliza el navegador al conectarse a OnlineGDB.
- [ ] b) Evita arrastrar variables o datos obsoletos de la ejecución anterior, asegurando que cada partida comience con las condiciones limpias del juego.
- [ ] c) Es un paso necesario para que el objeto `Scanner` no conserve textos escritos previamente por el usuario.
- [ ] d) Para que Java no compile de nuevo los archivos fuente de la lección.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: b)**

Si juegas una segunda partida en el mismo programa y no reinicias las variables, el juego podría comenzar con el contador de intentos al máximo o evaluar la victoria usando el número secreto de la partida anterior. Inicializar correctamente el estado al arrancar garantiza que la lógica del juego sea confiable.

</details>

---

## Pregunta 7

**Si el usuario ingresa accidentalmente una palabra (por ejemplo, `"diez"`) cuando el programa le solicita un número entero usando `lector.nextInt()`, ¿qué ocurre?**

- [ ] a) Java convierte la palabra al número `10` de forma automática usando inteligencia artificial.
- [ ] b) El programa ignora la entrada y espera en silencio a que el usuario escriba un número correcto.
- [ ] c) Se lanza un error fatal en tiempo de ejecución (`InputMismatchException`) que congela o detiene el programa de inmediato.
- [ ] d) El valor del intento se guarda como cero y continúa el bucle sin problemas.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: c)**

El método `nextInt()` espera estrictamente caracteres que representen un número entero. Si la entrada no coincide con ese formato, el motor de Java no sabe cómo interpretarlo y lanza un error crítico (`InputMismatchException`). Para que el programa sea profesional y robusto, el programador debe prever estas situaciones y validar la entrada del usuario antes de leer.

</details>

---

## Pregunta 8

**¿Qué función cumple la variable `System.in` al instanciar un objeto `Scanner` con `new Scanner(System.in)` en el helper de entrada?**

- [ ] a) Permite que el programa imprima texto con formato especial en la consola.
- [ ] b) Conecta el `Scanner` con el teclado o flujo de entrada estándar del sistema para capturar lo que el usuario tipea en la consola.
- [ ] c) Le indica al programa que debe leer datos desde un archivo local guardado en OnlineGDB.
- [ ] d) Genera los números aleatorios requeridos por el juego.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: b)**

`System.in` representa la entrada estándar del sistema (que por defecto es la entrada de teclado vinculada a la consola). Al pasarlo como parámetro al constructor de `Scanner`, le indicamos de forma explícita que queremos que el lector escuche y capture las pulsaciones de teclado del usuario en la terminal.

</details>

---

<p align="center">
  <img src="../../../assets/separator.png" alt="Separador visual del curso" width="100%">
</p>

---

## Diagnóstico de errores

### Caso A: El bucle de juego infinito por falta de actualización del estado

Un estudiante implementa el bucle de juego del Número Secreto pero el programa se congela imprimiendo el menú de ingreso sin detenerse:

```java
public class Game {
    private int numeroSecreto = 42;
    private boolean juegoTerminado = false;
    
    public void jugar() {
        while (juegoTerminado == false) {
            System.out.println("Ingresa tu intento: ");
            // Lee intento
            int intento = 10; // Valor fijo de prueba
            
            if (intento == numeroSecreto) {
                System.out.println("Ganaste.");
            }
        }
    }
}
```

<details>
<summary>Ver respuesta</summary>

**Explicación del error:**

La condición del bucle `while` depende de que `juegoTerminado` pase a ser `true`. En la condición interna del `if (intento == numeroSecreto)`, el estudiante imprime `"Ganaste."`, pero olvidó cambiar el estado de la variable controladora a `true` (`juegoTerminado = true;`). Como resultado, aunque el jugador acierte, el bucle continuará por siempre pidiendo intentos.

La solución es actualizar el estado de la variable de control al detectar la victoria:
```java
if (intento == numeroSecreto) {
    System.out.println("Ganaste.");
    juegoTerminado = true;
}
```

</details>

---

### Caso B: Error de acceso nulo en componentes del juego

El estudiante ejecuta su juego y se produce un error fatal en el método `main` al intentar iniciar la partida:

```java
public class Main {
    public static void main(String[] args) {
        Game juego = new Game();
        juego.iniciarPartida();
    }
}
```

Y en la clase `Game` tiene definido:
```java
public class Game {
    private Player jugador; // Atributo sin inicializar
    
    public void iniciarPartida() {
        System.out.println("Bienvenido, " + jugador.getName());
    }
}
```

<details>
<summary>Ver response</summary>

**Explicación del error:**

El atributo `jugador` de la clase `Game` se declaró (`private Player jugador;`) pero nunca fue inicializado con `new Player(...)`. Al ejecutar `jugador.getName()`, el programa intenta leer un atributo en una referencia nula, interrumpiendo el juego con un `NullPointerException`.

La solución es inicializar al jugador en el constructor de la clase `Game` o pedir el nombre al iniciar la partida y construir el objeto:
```java
public void iniciarPartida() {
    this.jugador = new Player("Jugador 1");
    System.out.println("Bienvenido, " + jugador.getName());
}
```

</details>

---

<p align="center">
  <img src="../../../assets/separator.png" alt="Separador visual del curso" width="100%">
</p>

---

## Autoevaluación por niveles

### Nivel inicial
- [ ] Comprendo la lógica básica del juego del Número Secreto y cómo interactúan los intentos.
- [ ] Puedo ejecutar la solución completa en OnlineGDB y jugar de principio a fin sin errores.

### Nivel básico
- [ ] Identifico el propósito de la clase `Random` y puedo generar valores aleatorios en rangos específicos.
- [ ] Sé cómo centralizar los textos en `GameMessage` para poder actualizarlos o traducirlos con facilidad.

### Nivel sólido
- [ ] Puedo explicar la arquitectura modular del proyecto final (`Game`, `Player`, `InputHelper`) y cómo se comunican las clases a través de sus objetos.
- [ ] Comprendo cómo capturar errores de tipo de entrada (`InputMismatchException`) cuando el usuario introduce valores no numéricos.

---

<div align="center">

**Volver al [plan de curso](../../../course-plan.md)**

</div>