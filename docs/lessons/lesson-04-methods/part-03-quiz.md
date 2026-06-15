<p align="center">
  <img src="../../../assets/lesson-04-banner.png" alt="Métodos y entrada de datos" width="100%">
</p>

<div align="center">

# Lección 04: Quiz y revisión

### Reutiliza código con métodos y lee datos interactivos del usuario

</div>

> **Indicaciones:** selecciona la opción que consideres correcta marcando mentalmente la casilla. Luego despliega la respuesta para verificar tu comprensión.

---

<p align="center">
  <img src="../../../assets/separator.png" alt="Separador visual del curso" width="100%">
</p>

---

## Pregunta 1

**¿Qué es un método en Java?**

- [ ] a) Un archivo de extensión `.class` que contiene el ejecutable principal.
- [ ] b) Un bloque de código con nombre que realiza una tarea específica y que puede ser llamado o invocado en cualquier parte del programa para evitar duplicar código.
- [ ] c) Un tipo de dato primitivo que almacena exclusivamente textos muy largos.
- [ ] d) El comando que se escribe en la terminal de Replit para compilar el proyecto.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: b)**

Los métodos son bloques lógicos estructurados a los que asignas un nombre para poder reutilizarlos (por ejemplo, `calcularPrecio`). Al meter código repetido en un método, solo debes escribirlo una vez; si necesitas cambiar algo de la fórmula, lo corriges en el método y se actualiza en todo el flujo del programa.

</details>

---

## Pregunta 2

**¿Qué palabra clave se utiliza dentro de un método para enviar un resultado de regreso al bloque de código que lo invocó?**

- [ ] a) `void`
- [ ] b) `System.out.println`
- [ ] c) `return`
- [ ] d) `public static`

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: c)**

La palabra clave `return` detiene la ejecución del método de inmediato y devuelve el valor especificado (por ejemplo, `return resultado;`) al punto donde el método fue llamado. Si el método tiene un tipo de retorno definido (como `int` o `double`), el valor de `return` debe coincidir estrictamente con ese tipo.

</details>

---

## Pregunta 3

**Si un método solo realiza una acción física (como imprimir mensajes en la consola) pero no necesita retornar ningún valor al programa, ¿qué tipo de retorno se debe indicar en su declaración?**

- [ ] a) `int`
- [ ] b) `void`
- [ ] c) `String`
- [ ] d) `double`

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: b)**

La palabra reservada `void` (vacío) indica al compilador de Java que el método no devolverá ningún valor. Es útil para métodos que actúan como "subrutinas" encargadas puramente de mostrar textos, actualizar estados globales o realizar tareas directas de visualización en consola.

</details>

---

## Pregunta 4

**¿Qué diferencia hay entre un "parámetro" y un "argumento" en el contexto de los métodos de Java?**

- [ ] a) Los parámetros se declaran en la firma del método; los argumentos son los valores reales que envías al llamarlo.
- [ ] b) Los parámetros son para variables numéricas; los argumentos son exclusivamente para texto.
- [ ] c) No existe ninguna diferencia, ambos se escriben dentro de la clase `Scanner`.
- [ ] d) Los parámetros los escribe el compilador; los argumentos los ingresa el usuario final.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: a)**

Los **parámetros** son las variables definidas entre los paréntesis de la firma del método que le indican qué datos necesita recibir para trabajar (por ejemplo, en `public static void saludar(String nombre)`, `nombre` es el parámetro). Los **argumentos** son los valores concretos que pasas al invocarlo (por ejemplo, en `saludar("Luis")`, `"Luis"` es el argumento).

</details>

---

## Pregunta 5

**¿Qué clase de la biblioteca estándar de Java se utiliza comúnmente para capturar y leer la entrada del usuario escrita en la consola?**

- [ ] a) `System.in`
- [ ] b) `java.util.Scanner`
- [ ] c) `public class Main`
- [ ] d) `java.lang.String`

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: b)**

La clase `Scanner` (que vive en el paquete `java.util`) facilita enormemente la lectura de flujos de texto de entrada. Para usarla en tu programa, debes importarla en la parte superior del archivo con `import java.util.Scanner;` e instanciarla pasando el flujo de entrada del sistema (`System.in`).

</details>

---

## Pregunta 6

**¿Qué método de la clase `Scanner` debes usar si quieres leer una cadena de texto completa (que puede incluir espacios en blanco) ingresada por el usuario?**

- [ ] a) `nextInt()`
- [ ] b) `nextDouble()`
- [ ] c) `nextLine()`
- [ ] d) `readString()`

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: c)**

El método `nextLine()` avanza el objeto `Scanner` más allá de la línea actual y devuelve toda la entrada de texto ingresada hasta encontrar un salto de línea (cuando el usuario presiona **Enter**). Es el método ideal para capturar frases completas, nombres de usuario con apellidos o respuestas abiertas.

</details>

---

## Pregunta 7

**Si esperas que el usuario ingrese un número entero en consola (por ejemplo, su edad o un número de opción de menú), ¿qué método de `Scanner` debes invocar?**

- [ ] a) `nextInt()`
- [ ] b) `nextLine()`
- [ ] c) `nextDouble()`
- [ ] d) `readInt()`

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: a)**

El método `nextInt()` lee e interpreta el siguiente elemento de entrada como un número entero (`int`). Si el usuario ingresa un texto no numérico (por ejemplo, `"quince"` en lugar de `15`), Java lanzará una excepción de error de entrada (`InputMismatchException`) y detendrá el programa si no se controla.

</details>

---

## Pregunta 8

**¿Por qué escribimos `import java.util.Scanner;` al inicio de nuestro archivo de código Java?**

- [ ] a) Para indicarle a Replit qué versión de compilador de Java debe ejecutar.
- [ ] b) Porque la clase `Scanner` no forma parte del paquete base por defecto (`java.lang`) y necesitamos indicarle a Java en qué biblioteca externa del SDK encontrar su definición.
- [ ] c) Para importar todos los archivos java contenidos en el directorio `starter-files`.
- [ ] d) Es una línea opcional que se puede borrar sin afectar la funcionalidad del programa.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: b)**

Las clases más básicas de Java (como `System` o `String`) se importan automáticamente porque viven en el paquete `java.lang`. Sin embargo, herramientas específicas como `Scanner` viven en paquetes especializados (en este caso, `java.util`). Los imports le dicen de forma exacta al compilador de dónde tomar la definición para que pueda resolver la palabra `Scanner`.

</details>

---

<p align="center">
  <img src="../../../assets/separator.png" alt="Separador visual del curso" width="100%">
</p>

---

## Diagnóstico de errores

### Caso A: Intentar retornar valor en un método void

Un estudiante escribe el siguiente método para imprimir una advertencia, pero desea detener la ejecución del método devolviendo un mensaje de estado:

```java
public static void mostrarAlerta() {
    System.out.println("¡Advertencia de seguridad!");
    return "Alerta impresa";
}
```

<details>
<summary>Ver respuesta</summary>

**Explicación del error:**

El método está declarado con tipo de retorno `void` (vacío), lo que significa que tiene prohibido devolver valores. Sin embargo, la instrucción `return "Alerta impresa";` intenta retornar una cadena de texto.

La solución correcta depende de lo que busques:
1. Si de verdad no debe retornar nada, usa solo `return;` (sin valor) para salir anticipadamente del método.
2. Si debe retornar el texto de confirmación, cambia el tipo `void` en la firma a `String`:
`public static String mostrarAlerta() { ... }`

El compilador reportará el error:
`error: incompatible types: unexpected return value`.

</details>

---

### Caso B: Scanner no importado

Un estudiante crea una instancia de Scanner para capturar datos en el método `main`, pero la compilación falla antes de correr:

```java
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = lector.nextLine();
        System.out.println("Hola " + nombre);
    }
}
```

<details>
<summary>Ver respuesta</summary>

**Explicación del error:**

El compilador no sabe qué es `Scanner` porque el estudiante olvidó colocar la línea de importación necesaria en la parte superior del archivo (antes de la definición de `public class Main`).

La solución es agregar esta línea al inicio del archivo:
`import java.util.Scanner;`

El error de compilación dirá:
`error: cannot find symbol` apuntando a la palabra `Scanner`.

</details>

---

<p align="center">
  <img src="../../../assets/separator.png" alt="Separador visual del curso" width="100%">
</p>

---

## Autoevaluación por niveles

### Nivel inicial
- [ ] Entiendo cómo llamar a un método que ya existe y pasarle datos entre paréntesis.
- [ ] Puedo crear un objeto `Scanner` y usar `nextLine()` para leer el nombre del usuario.

### Nivel básico
- [ ] Sé cuándo declarar un método con tipo de retorno `void` y cuándo con tipos específicos (`int`, `String`).
- [ ] Comprendo la necesidad de importar la clase `Scanner` desde `java.util`.

### Nivel sólido
- [ ] Puedo diseñar métodos personalizados que reciban múltiples parámetros y devuelvan cálculos procesados.
- [ ] Entiendo el problema que ocurre si el usuario ingresa texto en un método `nextInt()` y sé que la entrada debe ser validada.

---

<div align="center">

**Volver al [plan de curso](../../../course-plan.md)**

</div>
