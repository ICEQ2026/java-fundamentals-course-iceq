<p align="center">
  <img src="../assets/banner.png" alt="Java Fundamentals Course" width="100%">
</p>

<div align="center">

# Lección 04: Métodos y entrada por consola

### Dividir problemas grandes en acciones pequeñas

[![Nivel](https://img.shields.io/badge/Nivel-Principiante-brightgreen?style=flat-square)](#)
[![Duración](https://img.shields.io/badge/Duración-10_min-blue?style=flat-square)](#)
[![Módulo](https://img.shields.io/badge/Módulo-Guion-orange?style=flat-square)](#)
[![Herramienta](https://img.shields.io/badge/Herramienta-Replit-blueviolet?style=flat-square)](#)

</div>

---

## Propósito del video

El video debe explicar **métodos, parámetros, return y Scanner** usando una demostración corta en Replit. La narración debe ser clara, técnica y cercana, sin convertir la sesión en una charla motivacional. La analogía principal será **una receta con pasos reutilizables**.

| Campo | Valor |
|---|---|
| Duración objetivo | 10 minutos |
| Producto visible | Calculadora simple |
| Archivo de partida | `starter-files/lesson-04-methods` |
| Solución de referencia | `completed-examples/lesson-04-methods` |

## Estructura de pantalla

| Zona | Uso |
|---|---|
| Editor online | Mostrar código, errores y ejecución. |
| Consola | Evidenciar salida o mensaje de error. |
| Narración | Explicar intención, regla y corrección. |
| Texto breve en pantalla | Mostrar solo nombres de conceptos y pasos. |

## Guion por escenas

### Escena 1: contexto del problema

**Visual:** editor online abierto, sin ejecutar todavía.

**Narración sugerida:**

> En esta lección vamos a trabajar métodos, parámetros, return y Scanner. Antes de escribir código, conviene entender qué problema estamos resolviendo: necesitamos producir Calculadora simple. Usaremos una comparación simple: una receta con pasos reutilizables. Esa imagen nos ayudará a ubicar cada instrucción dentro del programa.

### Escena 2: código incorrecto controlado

**Visual:** mostrar un error de compilación por omitir la importación de Scanner (ej: `error: cannot find symbol - class Scanner`).

**Narración sugerida:**

> En esta escena, intentamos usar la clase `Scanner` para leer la entrada del usuario, pero el compilador nos dice `error: cannot find symbol: class Scanner`. Esto pasa porque Java está organizado en paquetes y no carga todo automáticamente para mantener el programa ligero. Para usar la clase `Scanner`, debemos importarla explícitamente agregando la línea `import java.util.Scanner;` al inicio de nuestro archivo, fuera de la clase.

**Punto didáctico:** explicar que el compilador no reconoce clases externas si no se importan, y cómo agregar el `import` correspondiente en la línea 1.

### Escena 3: construcción de la solución mínima

**Visual:** corregir la importación de `Scanner` y crear un método auxiliar `public static int add(int firstNumber, int secondNumber)`.

**Narración sugerida:**

> Con la importación de `Scanner` resuelta, ahora organizamos el código. Para no sobrecargar el método `main`, delegamos la operación matemática de suma a un nuevo método estático llamado `add`. Este método recibe dos parámetros enteros y devuelve el resultado usando la instrucción `return`. Así, nuestro programa gana legibilidad y orden.

### Escena 4: ejecución y comprobación

**Visual:** presionar **Run**, escribir interactivamente dos números (ej: 12 y 8) en la consola de Replit y observar la salida "12 + 8 = 20".

**Narración sugerida:**

> Ejecutamos el programa. La consola nos pide ingresar el primer número. Escribo `12` y presiono Enter. Luego nos pide el segundo número, escribo `8` y presiono Enter. El programa lee ambos valores usando `scanner.nextInt()`, invoca a nuestro método `add` y muestra el resultado sumado en pantalla. ¡Acabamos de crear nuestro primer programa interactivo!

### Escena 5: cierre técnico

**Visual:** mostrar la sección de criterios de éxito de la práctica 4.

**Narración sugerida:**

> Al terminar tu laboratorio de la lección 4, verifica tres puntos clave: que hayas importado correctamente `Scanner`, que llames a tu método estático desde el bloque `main` pasándole los argumentos adecuados, y no olvides escribir `scanner.close()` al final para liberar la memoria. ¡Nos vemos en el próximo video!

## Lista de control de grabación

| Revisión | Estado |
|---|---|
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
