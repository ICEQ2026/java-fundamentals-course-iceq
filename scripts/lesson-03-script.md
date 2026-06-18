<p align="center">
  <img src="../assets/banner.png" alt="Java Fundamentals Course" width="100%">
</p>

<div align="center">

# Lección 03: Condiciones y bucles

### Decidir y repetir sin duplicar instrucciones

[![Nivel](https://img.shields.io/badge/Nivel-Principiante-brightgreen?style=flat-square)](#)
[![Duración](https://img.shields.io/badge/Duración-10_min-blue?style=flat-square)](#)
[![Módulo](https://img.shields.io/badge/Módulo-Guion-orange?style=flat-square)](#)
[![Herramienta](https://img.shields.io/badge/Editor-OnlineGDB-blueviolet?style=flat-square)](#)

</div>

---

## Propósito del video

El video debe explicar **if, else, operadores relacionales y for** usando una demostración corta en OnlineGDB. La narración debe ser clara, técnica y cercana, sin convertir la sesión en una charla motivacional. La analogía principal será **guardias que revisan reglas y tornos que repiten el acceso**.

| Campo | Valor |
|---|---|
| Duración objetivo | 10 minutos |
| Producto visible | Evaluación de aprobación |
| Archivo de partida | `starter-files/lesson-03-if-loops` |
| Solución de referencia | `completed-examples/lesson-03-if-loops` |
| Material de teoría | [Lesson_3.pptx](https://docs.google.com/presentation/d/1ALH1pRKjewmX0ygyONVt7DwzcqxJeEGRN0p28dCHrG8/edit?usp=sharing) |

## Reparto del tiempo

| Bloque | Duración aprox. | Pantalla |
|---|---|---|
| Bloque A — Teoría con diapositivas | 5 min (mitad) | Presentación `Lesson_3.pptx` completa, de la primera a la última diapositiva |
| Bloque B — Codificación en vivo | 5 min (mitad) | OnlineGDB, escenas de este guion |

> La persona que grabe debe abrir [Lesson_3.pptx](https://docs.google.com/presentation/d/1ALH1pRKjewmX0ygyONVt7DwzcqxJeEGRN0p28dCHrG8/edit?usp=sharing) en Google Slides, compartir pantalla en modo presentación y recorrerla completa antes de abrir OnlineGDB. Solo al terminar la última diapositiva se cambia de pantalla para iniciar el Bloque B.

## Estructura de pantalla

| Zona | Uso |
|---|---|
| Diapositivas (Bloque A) | Explicar teoría: condicionales if/else, operadores relacionales y bucle for, apoyándose en `Lesson_3.pptx`. |
| Editor online (Bloque B) | Mostrar código, errores y ejecución. |
| Consola | Evidenciar salida o mensaje de error. |
| Narración | Explicar intención, regla y corrección. |
| Texto breve en pantalla | Mostrar solo nombres de conceptos y pasos. |

## Guion por escenas

### Bloque A — Teoría con diapositivas

**Visual:** presentación `Lesson_3.pptx` en modo presentación, de inicio a fin.

**Narración sugerida:**

> Antes de tocar el editor, vamos a ver con calma cómo un programa toma decisiones con if y else, qué operadores relacionales existen para comparar valores, y cómo un bucle for repite instrucciones controladamente. Recorre cada diapositiva explicando el concepto que muestra y, si la diapositiva trae un ejemplo de código, léelo en voz alta señalando cada parte antes de pasar a la siguiente.

**Punto didáctico:** este bloque es expositivo, sin editor de código en pantalla. Sirve para que la persona que mira entienda el "por qué" antes del "cómo".

### Bloque B — Codificación en vivo en OnlineGDB

#### Escena 1: contexto del problema

**Visual:** editor online abierto, sin ejecutar todavía.

**Narración sugerida:**

> En esta lección vamos a trabajar if, else, operadores relacionales y for. Antes de escribir código, conviene entender qué problema estamos resolviendo: necesitamos producir Reglas y repeticiones con número esperado. Usaremos una comparación simple: guardias que revisan reglas y tornos que repiten el acceso. Esa imagen nos ayudará a ubicar cada instrucción dentro del programa.

#### Escena 2: código incorrecto controlado

**Visual:** mostrar un error de compilación en OnlineGDB al usar `=` de asignación en lugar de `==` de comparación (ej: `if (guess = expectedNumber)`).

**Narración sugerida:**

> Mira con atención la condición dentro del bloque `if`. Hemos usado un solo signo igual. En Java, un solo signo igual significa "guardar un valor en una variable", es decir, asignación. Al intentar compilar, Java nos dirá que no puede convertir un número entero en un valor lógico verdadero o falso. Para realizar comparaciones de igualdad, la regla de oro es utilizar el doble signo igual: `==`.

**Punto didáctico:** explicar la diferencia entre asignar con `=` y comparar con `==`, y cómo el compilador de Java previene errores lógicos en tiempo de ejecución.

#### Escena 3: construcción de la solución mínima

**Visual:** cambiar `=` por `==` en la comparación y estructurar el bucle `for` (`for (int attempt = 1; attempt <= 5; attempt++)`).

**Narración sugerida:**

> Corregimos la comparación cambiando el operador a `==`. Ahora, construimos un bucle `for` para repetir nuestros intentos de adivinación. La estructura básica del `for` consta de tres partes: dónde empezamos con `int attempt = 1`, la regla de parada `attempt <= 5` y el incremento paso a paso `attempt++`. Todo lo que esté dentro de las llaves se ejecutará repetidamente bajo estas reglas.

#### Escena 4: ejecución y comprobación

**Visual:** ejecutar el programa en OnlineGDB, mostrando cómo itera a través de los números `{3, 9, 7, 2, 1}` y se detiene en el intento 3 al encontrar el `7` gracias a la instrucción `break`.

**Narración sugerida:**

> Presionamos **Run**. Observa en la consola cómo el programa recorre los intentos. Al llegar al intento número 3, encuentra que el número propuesto es exactamente el esperado. En ese momento, se ejecuta la instrucción `break`. Esto detiene el bucle inmediatamente y salta fuera de él, evitando que realicemos los intentos restantes. ¡El flujo responde con total precisión!

#### Escena 5: cierre técnico

**Visual:** mostrar la sección de criterios de éxito de la práctica 3.

**Narración sugerida:**

> Antes de avanzar a la lección 4, completa el laboratorio en OnlineGDB: escribe el bucle, implementa las pistas condicionales con `else if` para avisar si el número esperado es mayor o menor, y asegúrate de entender cómo y cuándo entra en acción el `break`. ¡Te veo en la próxima sesión!

## Lista de control de grabación

| Revisión | Estado |
|---|---|
| Se presenta `Lesson_3.pptx` completa antes de abrir el editor. | |
| El Bloque A (teoría) y el Bloque B (código) ocupan, cada uno, aproximadamente la mitad del tiempo objetivo. | |
| Se muestra el editor online indicado. | |
| Se lee un error real o un error preparado. | |
| Se explica el porqué antes de mostrar la solución. | |
| Se ejecuta el programa al menos una vez. | |
| Se menciona el archivo starter y la solución completa. | |
| La narración evita frases exageradas y mantiene tono técnico accesible. | |

## Enlace pendiente

| Recurso | URL |
|---|---|
| Video YouTube no listado | Pendiente |
| Editor online precargado | Pendiente |
