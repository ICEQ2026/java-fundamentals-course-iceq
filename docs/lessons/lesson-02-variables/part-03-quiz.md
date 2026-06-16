<p align="center">
  <img src="../../../assets/lesson-02-banner.png" alt="Variables y tipos de datos" width="100%">
</p>

<div align="center">

# Lección 02: Quiz y revisión

### Elige tipos, nombra datos y lee errores en tus variables

</div>

> **Indicaciones:** selecciona la opción que consideres correcta marcando mentalmente la casilla. Luego despliega la respuesta para verificar tu comprensión.

---

<p align="center">
  <img src="../../../assets/separator.png" alt="Separador visual del curso" width="100%">
</p>

---

## Pregunta 1

**¿Cuál es el propósito fundamental de declarar una variable en un programa?**

- [ ] a) Cambiar el color de fondo de la consola de ejecución.
- [ ] b) Reservar un espacio de memoria con un nombre asociado para guardar un dato que pueda ser usado o modificado más tarde.
- [ ] c) Obligar al usuario a ingresar datos utilizando el teclado de forma obligatoria.
- [ ] d) Comprimir el archivo Java para que ocupe menos espacio en el servidor de OnlineGDB.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: b)**

Las variables son contenedores con nombre en la memoria de la computadora. Al declarar una variable, le dices a Java: "guarda este espacio, llámalo de tal forma y almacena este valor". De esta manera evitas duplicar texto fijo (hardcoded) en tu código y puedes actualizar datos fácilmente en una sola ubicación.

</details>

---

## Pregunta 2

**¿Cuáles son los tres componentes obligatorios al declarar una variable por primera vez en Java?**

- [ ] a) El nombre del archivo, la clase y las llaves de bloque.
- [ ] b) El tipo de dato, el nombre de la variable y el valor inicial (finalizado con un punto y coma).
- [ ] c) Un comentario explicativo, el método `main` y las comillas de texto.
- [ ] d) El tipo `int`, el tipo `double` y el operador de suma.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: b)**

Toda declaración de variable en Java sigue la estructura estándar: `tipo nombre = valor;`. Por ejemplo: `int age = 15;`. Java necesita saber obligatoriamente qué tipo de dato guardará la variable (`tipo`) para reservar la cantidad exacta de memoria, y cómo se llamará (`nombre`) para poder llamarla más adelante.

</details>

---

## Pregunta 3

**¿Por qué el tipo de dato `String` se declara con la primera letra en mayúscula (`S` mayúscula) mientras que `int`, `double` y `boolean` se escriben completamente en minúsculas?**

- [ ] a) Fue un error tipográfico de los creadores de Java que nunca se pudo corregir.
- [ ] b) `String` es un tipo de dato simple, mientras que los demás son tipos complejos.
- [ ] c) `String` es una clase (tipo de referencia) provista por la biblioteca estándar de Java, mientras que `int`, `double` y `boolean` son tipos de datos primitivos nativos del lenguaje.
- [ ] d) Las palabras en minúsculas solo se usan para guardar números y valores falsos.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: c)**

Java clasifica sus datos en primitivos y de referencia. Los primitivos (`int`, `double`, `boolean`, `char`, etc.) son tipos básicos del sistema que guardan valores directos y se escriben en minúsculas. `String` representa una cadena de caracteres (texto) y se implementa como una clase en Java, por lo que sigue la convención de clases de comenzar con mayúscula.

</details>

---

## Pregunta 4

**Si quieres guardar la edad de un estudiante (un número entero, como 15), ¿cuál es el tipo de dato primitivo más adecuado?**

- [ ] a) `double`
- [ ] b) `String`
- [ ] c) `boolean`
- [ ] d) `int`

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: d)**

El tipo `int` (abreviatura de "integer") se utiliza en Java para almacenar números enteros (valores positivos o negativos sin decimales) en un rango muy amplio. Como la edad de una persona es una cantidad entera, `int` es la elección correcta y eficiente.

</details>

---

## Pregunta 5

**¿Qué tipo de dato primitivo debes elegir para almacenar la calificación promedio de un estudiante con decimales (por ejemplo, `18.5`)?**

- [ ] a) `int`
- [ ] b) `double`
- [ ] c) `boolean`
- [ ] d) `String`

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: b)**

El tipo primitivo `double` se utiliza en Java para números de coma flotante de precisión doble (valores numéricos que incluyen parte decimal). Si intentas guardar `18.5` en una variable de tipo `int`, Java dará un error de compilación por pérdida de precisión.

</details>

---

## Pregunta 6

**¿Qué tipo de dato primitivo usarías para guardar si el juego ha terminado o no (es decir, una bandera de sí/no, verdadero/falso)?**

- [ ] a) `boolean`
- [ ] b) `int`
- [ ] c) `double`
- [ ] d) `String`

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: a)**

El tipo `boolean` (booleano) solo puede guardar dos valores lógicos posibles: `true` (verdadero) o `false` (falso). Es perfecto para estados de encendido/apagado, habilitado/deshabilitado o condiciones de juego completado.

</details>

---

## Pregunta 7

**¿Cuál es la diferencia técnica entre declarar una variable y reasignarle un valor en Java?**

- [ ] a) Declarar reserva memoria y especifica el tipo; reasignar cambia su contenido sin volver a especificar el tipo.
- [ ] b) Declarar solo funciona para texto; reasignar es exclusivo para números enteros.
- [ ] c) La declaración se realiza en OnlineGDB y la reasignación en el navegador local del estudiante.
- [ ] d) No hay diferencia, ambas operaciones se escriben exactamente igual usando la palabra clave de tipo.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: a)**

La declaración crea la variable especificando su tipo (ej: `int score = 0;`). La reasignación cambia el valor de una variable que ya existe, utilizando su nombre directo sin repetir el tipo (ej: `score = 10;`). Si intentas reescribir el tipo en la reasignación (ej: `int score = 10;`), Java dará un error de compilación por variable duplicada.

</details>

---

## Pregunta 8

**¿Qué hace el operador `+` en la instrucción `System.out.println("Tu edad es: " + edad);` si `edad` es una variable de tipo `int`?**

- [ ] a) Realiza una operación matemática de suma numérica entre el texto y la edad.
- [ ] b) Borra el texto de la consola para imprimir el número de forma limpia.
- [ ] c) Une (concatena) la cadena de texto con el valor numérico de la variable, convirtiéndolo todo en una sola cadena para imprimir.
- [ ] d) Crea un bucle que imprime la edad repetidas veces.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: c)**

En Java, cuando se usa el operador `+` y al menos uno de los términos es un `String`, Java realiza una operación de **concatenación**. Convierte automáticamente el otro valor (en este caso, el entero de la variable `edad`) a texto y los une en una sola frase antes de mostrarla en la consola.

</details>

---

<p align="center">
  <img src="../../../assets/separator.png" alt="Separador visual del curso" width="100%">
</p>

---

## Diagnóstico de errores

### Caso A: Variables duplicadas

Un estudiante intenta actualizar la puntuación del jugador con este código:

```java
public class Main {
    public static void main(String[] args) {
        int score = 10;
        System.out.println("Puntaje inicial: " + score);
        
        int score = 20; // Actualizando puntaje
        System.out.println("Puntaje nuevo: " + score);
    }
}
```

<details>
<summary>Ver respuesta</summary>

**Explicación del error:**

El estudiante intentó redeclarar la variable `score` usando `int score = 20;`. En Java, no se puede declarar dos variables con el mismo nombre en el mismo bloque de código. 

La solución correcta para actualizar la variable es remover el tipo `int` de la segunda asignación (reasignación directa):
`score = 20;`

El error de compilación reportado será:
`error: variable score is already defined in method main(String[])`.

</details>

---

### Caso B: Error de tipos incompatibles

Un estudiante escribe la siguiente línea de código para guardar el precio de un artículo:

```java
int precio = 15.99;
```

<details>
<summary>Ver respuesta</summary>

**Explicación del error:**

Se está intentando almacenar un valor decimal (`15.99`) dentro de una variable declarada como entero (`int precio`). Java protege la precisión de los datos y no permite guardar decimales en contenedores enteros de forma automática.

La solución correcta es cambiar el tipo de dato de `int` a `double`:
`double precio = 15.99;`

El error reportado al compilar será:
`error: incompatible types: possible lossy conversion from double to int`.

</details>

---

<p align="center">
  <img src="../../../assets/separator.png" alt="Separador visual del curso" width="100%">
</p>

---

## Autoevaluación por niveles

### Nivel inicial
- [ ] Comprendo la diferencia entre los tipos de datos primitivos (`int`, `double`, `boolean`) y el tipo objeto (`String`).
- [ ] Puedo concatenar variables y textos utilizando el operador `+`.

### Nivel básico
- [ ] Distingo claramente entre la primera declaración de una variable y su posterior reasignación.
- [ ] Sé cómo resolver el error de compilación que ocurre al intentar redefinir el tipo en una reasignación.

### Nivel sólido
- [ ] Puedo elegir con precisión el tipo de dato adecuado para cualquier variable en un problema de lógica cotidiana.
- [ ] Explico por qué Java no permite asignar un valor de tipo `double` a una variable de tipo `int` sin una conversión explícita.

---

<div align="center">

**Volver al [plan de curso](../../../course-plan.md)**

</div>