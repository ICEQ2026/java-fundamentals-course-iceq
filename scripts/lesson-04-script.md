<p align="center">
  <img src="../assets/banner.png" alt="Java Fundamentals Course" width="100%">
</p>

<div align="center">

# Lección 04: Métodos y entrada por consola

### Dividir problemas grandes en acciones pequeñas

[![Nivel](https://img.shields.io/badge/Nivel-Principiante-brightgreen?style=flat-square)](#)
[![Duración](https://img.shields.io/badge/Duración-10_min-blue?style=flat-square)](#)
[![Módulo](https://img.shields.io/badge/Módulo-Guion-orange?style=flat-square)](#)
[![Herramienta](https://img.shields.io/badge/Editor-OnlineGDB-blueviolet?style=flat-square)](#)

</div>

---

## Propósito del video

El video debe explicar **métodos, parámetros, return y Scanner** usando una demostración corta en OnlineGDB. La narración debe ser clara, técnica y cercana, sin convertir la sesión en una charla motivacional. La analogía principal será **una receta con pasos reutilizables**.

| Campo | Valor |
|---|---|
| Duración objetivo | 10 minutos |
| Producto visible | Calculadora simple |
| Archivo de partida | `starter-files/lesson-04-methods` |
| Solución de referencia | `completed-examples/lesson-04-methods` |
| Material de teoría | [Lesson_4.pptx](https://docs.google.com/presentation/d/1IPBxFwuU-O2OF1JNLGSi1J6Ta6m7MVzgdIubuaqNOGM/edit?usp=sharing) |

## Reparto del tiempo

| Bloque | Duración aprox. | Pantalla |
|---|---|---|
| Bloque A — Teoría con diapositivas | 5 min (mitad) | Presentación `Lesson_4.pptx` completa, de la primera a la última diapositiva |
| Bloque B — Codificación en vivo | 5 min (mitad) | OnlineGDB, escenas de este guion |

> La persona que grabe debe abrir [Lesson_4.pptx](https://docs.google.com/presentation/d/1IPBxFwuU-O2OF1JNLGSi1J6Ta6m7MVzgdIubuaqNOGM/edit?usp=sharing) en Google Slides, compartir pantalla en modo presentación y recorrerla completa antes de abrir OnlineGDB. Solo al terminar la última diapositiva se cambia de pantalla para iniciar el Bloque B.

## Estructura de pantalla

| Zona | Uso |
|---|---|
| Diapositivas (Bloque A) | Explicar teoría: métodos, parámetros, return y Scanner, apoyándose en `Lesson_4.pptx`. |
| Editor online (Bloque B) | Mostrar código, errores y ejecución. |
| Consola | Evidenciar salida o mensaje de error. |
| Narración | Explicar intención, regla y corrección. |
| Texto breve en pantalla | Mostrar solo nombres de conceptos y pasos. |

## Guion por escenas

### Bloque A — Teoría con diapositivas

**Visual:** presentación `Lesson_4.pptx` en modo presentación, de inicio a fin.

**Narración sugerida:**

> Antes de tocar el editor, vamos a ver con calma qué es un método, cómo se le envían parámetros, cómo devuelve un valor con return y cómo Scanner nos permite leer datos escritos por el usuario. Recorre cada diapositiva explicando el concepto que muestra y, si la diapositiva trae un ejemplo de código, léelo en voz alta señalando cada parte antes de pasar a la siguiente.

**Punto didáctico:** este bloque es expositivo, sin editor de código en pantalla. Sirve para que la persona que mira entienda el "por qué" antes del "cómo".

### Bloque B — Codificación en vivo en OnlineGDB

#### Escena 1: contexto del problema

**Visual:** editor online abierto, sin ejecutar todavía.

**Narración sugerida:**

> En esta lección vamos a trabajar métodos, parámetros, return y Scanner. Antes de escribir código, conviene entender qué problema estamos resolviendo: necesitamos producir Calculadora simple. Usaremos una comparación simple: una receta con pasos reutilizables. Esa imagen nos ayudará a ubicar cada instrucción dentro del programa.

#### Escena 2: código incorrecto controlado

**Visual:** mostrar un error de compilación por omitir la importación de Scanner (ej: `error: cannot find symbol - class Scanner`).

**Narración sugerida:**

> En esta escena, intentamos usar la clase `Scanner` para leer la entrada del usuario, pero el compilador nos dice `error: cannot find symbol: class Scanner`. Esto pasa porque Java está organizado en paquetes y no carga todo automáticamente para mantener el programa ligero. Para usar la clase `Scanner`, debemos importarla explícitamente agregando la línea `import java.util.Scanner;` al inicio de nuestro archivo, fuera de la clase.

**Punto didáctico:** explicar que el compilador no reconoce clases externas si no se importan, y cómo agregar el `import` correspondiente en la línea 1.

#### Escena 3: construcción de la solución mínima

**Visual:** corregir la importación de `Scanner` y crear un método auxiliar `public static int add(int firstNumber, int secondNumber)`.

**Narración sugerida:**

> Con la importación de `Scanner` resuelta, ahora organizamos el código. Para no sobrecargar el método `main`, delegamos la operación matemática de suma a un nuevo método estático llamado `add`. Este método recibe dos parámetros enteros y devuelve el resultado usando la instrucción `return`. Así, nuestro programa gana legibilidad y orden.

#### Escena 4: ejecución y comprobación

**Visual:** presionar **Run**, escribir interactivamente dos números (ej: 12 y 8) en la consola de OnlineGDB y observar la salida "12 + 8 = 20".

**Narración sugerida:**

> Ejecutamos el programa. La consola nos pide ingresar el primer número. Escribo `12` y presiono Enter. Luego nos pide el segundo número, escribo `8` y presiono Enter. El programa lee ambos valores usando `scanner.nextInt()`, invoca a nuestro método `add` y muestra el resultado sumado en pantalla. ¡Acabamos de crear nuestro primer programa interactivo!

#### Escena 5: cierre técnico

**Visual:** mostrar la sección de criterios de éxito de la práctica 4.

**Narración sugerida:**

> Al terminar tu laboratorio de la lección 4, verifica tres puntos clave: que hayas importado correctamente `Scanner`, que llames a tu método estático desde el bloque `main` pasándole los argumentos adecuados, y no olvides escribir `scanner.close()` al final para liberar la memoria. ¡Nos vemos en el próximo video!

## Lista de control de grabación

| Revisión | Estado |
|---|---|
| Se presenta `Lesson_4.pptx` completa antes de abrir el editor. | |
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
