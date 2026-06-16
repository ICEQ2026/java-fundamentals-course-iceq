<p align="center">
  <img src="../../../assets/lesson-03-banner.png" alt="Condiciones y bucles" width="100%">
</p>

<div align="center">

# Lección 03: Quiz y revisión

### Domina las decisiones lógicas y los ciclos repetitivos en Java

</div>

> **Indicaciones:** selecciona la opción que consideres correcta marcando mentalmente la casilla. Luego despliega la respuesta para verificar tu comprensión.

---

<p align="center">
  <img src="../../../assets/separator.png" alt="Separador visual del curso" width="100%">
</p>

---

## Pregunta 1

**¿Qué estructura de control en Java te permite tomar una decisión lógica para ejecutar un bloque de código u otro según una condición?**

- [ ] a) El bucle `for`.
- [ ] b) La estructura `if` / `else`.
- [ ] c) El método `System.out.println`.
- [ ] d) La clase `Scanner`.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: b)**

La estructura `if` evalúa una expresión condicional booleana (que resulta en `true` o `false`). Si la condición es verdadera, ejecuta el bloque de código entre sus llaves `{}`. Si es falsa y existe un bloque `else`, ejecuta el código alternativo de ese segundo bloque.

</details>

---

## Pregunta 2

**¿Qué operador se utiliza en Java para comprobar si dos valores o variables numéricas son exactamente iguales en una condición?**

- [ ] a) `=`
- [ ] b) `equals`
- [ ] c) `==`
- [ ] d) `===`

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: c)**

El operador de comparación es `==` (doble signo de igualdad). El operador `=` (un solo signo) se usa exclusivamente para asignar o reasignar valores a variables. Intentar usar un solo `=` dentro del paréntesis de un `if` (por ejemplo, `if (puntos = 10)`) dará un error de compilación.

</details>

---

## Pregunta 3

**¿Cuál es la función del operador lógico AND (`&&`) en una estructura condicional?**

- [ ] a) Ejecuta el bloque de código si al menos una de las condiciones es verdadera.
- [ ] b) Invierte el valor lógico de la condición (si es verdadero lo vuelve falso).
- [ ] c) Exige que todas las condiciones conectadas sean verdaderas (`true`) para que la condición general se considere cumplida.
- [ ] d) Suma los valores numéricos de las variables comparadas.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: c)**

El operador `&&` representa la conjunción lógica AND (Y). Por ejemplo, en `if (edad >= 18 && tienePermiso == true)`, el bloque de código solo se ejecutará si ambos términos individuales son verdaderos a la vez. Si uno de ellos es falso, toda la condición resulta falsa.

</details>

---

## Pregunta 4

**¿Qué bucle (loop) es el más adecuado y limpio cuando conoces de antemano la cantidad exacta de veces que necesitas repetir una acción?**

- [ ] a) El bucle `for` convencional con variable de control.
- [ ] b) El bucle `while`.
- [ ] c) La estructura `if` / `else` anidada.
- [ ] d) Un método recursivo con `void`.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: a)**

El bucle `for` agrupa convenientemente en una sola línea la inicialización de la variable de control, la condición de parada y el paso de incremento o decremento (por ejemplo: `for (int i = 0; i < 5; i++)`). Es ideal para tareas de conteo o iteración fija donde la cantidad de pasos ya está determinada.

</details>

---

## Pregunta 5

**¿Qué bucle se recomienda utilizar cuando la cantidad de repeticiones depende de un evento dinámico que no sabes cuándo ocurrirá (por ejemplo, mientras el usuario no adivine el número secreto)?**

- [ ] a) Un bloque `if` sin `else`.
- [ ] b) El bucle `while`.
- [ ] c) El método `main`.
- [ ] d) Un bucle `for` sin variable de incremento.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: b)**

El bucle `while` ("mientras") evalúa una condición al inicio de cada iteración y repite el bloque mientras esa condición sea verdadera. Como no requiere un contador fijo, es perfecto para esperar eventos interactivos o entradas del usuario donde la cantidad total de repeticiones es indeterminada en tiempo de compilación.

</details>

---

## Pregunta 6

**¿Qué ocurre si la condición de un bucle `while` siempre evalúa como verdadera (`true`) y el código interno no modifica ninguna variable relacionada con esa condición?**

- [ ] a) El compilador detiene el programa marcando un error inmediato.
- [ ] b) El programa termina automáticamente tras completar 100 iteraciones por seguridad.
- [ ] c) Se genera un **bucle infinito**, el programa queda atrapado repitiendo el bloque sin parar y se puede congelar o requerir forzar su parada en OnlineGDB.
- [ ] d) El bucle se ignora por completo y pasa a la línea siguiente.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: c)**

Si la condición del bucle `while` nunca pasa a ser falsa (`false`), el programa entrará en un ciclo infinito de procesamiento. Para evitar esto, siempre debes asegurarte de que dentro del bloque de código del bucle exista alguna instrucción que modifique el estado de las variables evaluadas en la condición, permitiendo eventualmente la salida del ciclo.

</details>

---

## Pregunta 7

**¿Cuál es la función del operador de incremento `++` (por ejemplo, `i++`) en un bucle `for`?**

- [ ] a) Multiplica el valor de la variable por dos en cada ciclo.
- [ ] b) Compara si la variable es mayor que cero.
- [ ] c) Aumenta en 1 el valor actual de la variable en cada iteración del bucle.
- [ ] d) Salta al final de la lección para ejecutar el quiz.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: c)**

El operador `++` es una forma abreviada en Java para realizar la operación de incremento en uno: `i = i + 1`. Al usarse al final de la declaración del `for` (ej. `for(int i = 0; i < 5; i++)`), asegura que el contador avance paso a paso con cada repetición para evitar bucles infinitos.

</details>

---

## Pregunta 8

**¿Qué tipo de valor debe devolver la expresión colocada dentro de los paréntesis de un `if` (por ejemplo, `if (puntos > 100)`)?**

- [ ] a) Un número de tipo `int`.
- [ ] b) Un texto de tipo `String`.
- [ ] c) Un valor booleano (`true` o `false`).
- [ ] d) Ningún valor, debe ser de tipo `void`.

<details>
<summary>Ver respuesta</summary>

**Respuesta correcta: c)**

Java requiere estrictamente que la condición dentro del paréntesis de un `if` sea una expresión que evalúe a un valor lógico booleano (`true` o `false`). Por ejemplo, la expresión `puntos > 100` compara dos enteros y devuelve `true` si la puntuación es superior o `false` en caso contrario.

</details>

---

<p align="center">
  <img src="../../../assets/separator.png" alt="Separador visual del curso" width="100%">
</p>

---

## Diagnóstico de errores

### Caso A: El operador de asignación en condiciones

Un estudiante escribe el siguiente código para verificar si el jugador tiene la puntuación necesaria para ganar:

```java
int score = 5;
if (score = 10) {
    System.out.println("¡Has ganado!");
}
```

<details>
<summary>Ver respuesta</summary>

**Explicación del error:**

El estudiante usó un solo signo igual (`score = 10`) en lugar del operador de comparación de igualdad (`score == 10`). Un solo `=` intenta asignar el valor `10` a `score`. Como la asignación numérica no da como resultado un valor booleano, Java marca un error de compilación.

La solución correcta es cambiar el operador a `==`:
`if (score == 10) { ... }`

El error de compilación dirá:
`error: incompatible types: int cannot be converted to boolean`.

</details>

---

### Caso B: Bucle infinito por omisión de incremento

Un estudiante crea este bucle para contar del 1 al 5 en consola:

```java
int count = 1;
while (count <= 5) {
    System.out.println("Contando: " + count);
}
```

<details>
<summary>Ver respuesta</summary>

**Explicación del error:**

El bucle evalúa `count <= 5`. Al iniciar, `count` es `1`, lo cual es verdadero. Sin embargo, dentro del bucle imprimimos el mensaje pero nunca modificamos el valor de `count`. Por lo tanto, `count` siempre será `1` y la condición siempre será verdadera, creando un bucle infinito que llenará la consola con `"Contando: 1"`.

La solución correcta es agregar el incremento al final del bloque:
```java
while (count <= 5) {
    System.out.println("Contando: " + count);
    count++; // o count = count + 1;
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
- [ ] Entiendo cómo escribir condiciones lógicas simples usando `if` y `else`.
- [ ] Puedo leer y comprender el flujo de un bucle `for` básico en consola.

### Nivel básico
- [ ] Diferencio claramente cuándo utilizar el operador de asignación `=` y el de comparación `==`.
- [ ] Comprendo cómo evitar bucles infinitos en un bloque `while` modificando la variable de condición.

### Nivel sólido
- [ ] Puedo combinar múltiples condiciones lógicas complejas utilizando los operadores `&&` (AND) y `||` (OR).
- [ ] Diseñé soluciones en las que un bucle `while` interactúa con cambios de estados variables en tiempo de ejecución.

---

<div align="center">

**Volver al [plan de curso](../../../course-plan.md)**

</div>