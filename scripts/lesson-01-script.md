<p align="center">
  <img src="../assets/banner.png" alt="Java Fundamentals Course" width="100%">
</p>

<div align="center">

# Lección 01: Primer programa en Java

### Del navegador al primer mensaje en consola

[![Nivel](https://img.shields.io/badge/Nivel-Principiante-brightgreen?style=flat-square)](#)
[![Duración](https://img.shields.io/badge/Duración-7_min-blue?style=flat-square)](#)
[![Módulo](https://img.shields.io/badge/Módulo-Guion-orange?style=flat-square)](#)
[![Herramienta](https://img.shields.io/badge/Herramienta-Replit-blueviolet?style=flat-square)](#)

</div>

---

## Propósito del video

El video debe explicar **estructura mínima, método main y salida con System.out.println** usando una demostración corta en Replit. La narración debe ser clara, técnica y cercana, sin convertir la sesión en una charla motivacional. La analogía principal será **un director de escena que ordena cuándo empieza la función**.

| Campo | Valor |
|---|---|
| Duración objetivo | 7 minutos |
| Producto visible | Mensaje en consola |
| Archivo de partida | `starter-files/lesson-01-hello-world` |
| Solución de referencia | `completed-examples/lesson-01-hello-world` |

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

> En esta lección vamos a trabajar estructura mínima, método main y salida con System.out.println. Antes de escribir código, conviene entender qué problema estamos resolviendo: necesitamos producir Mensaje en consola. Usaremos una comparación simple: un director de escena que ordena cuándo empieza la función. Esa imagen nos ayudará a ubicar cada instrucción dentro del programa.

### Escena 2: código incorrecto controlado

**Visual:** mostrar el bloque de código incorrecto (falta de punto y coma en System.out.println) en Replit.

**Narración sugerida:**

> Observa este código en pantalla. A primera vista parece completo, pero si intentamos ejecutarlo, la consola nos arrojará un error inmediato: `error: ';' expected`. En Java, el punto y coma es el delimitador oficial para indicar el fin de una instrucción. Sin él, el compilador se confunde y no puede avanzar. Aprender a leer este error es nuestro primer paso como desarrolladores.

**Punto didáctico:** señalar la línea marcada por el compilador, resaltar el símbolo faltante y explicar que el compilador ayuda a corregir.

### Escena 3: construcción de la solución mínima

**Visual:** agregar el punto y coma al final de la línea e inspeccionar la clase Main y el método main.

**Narración sugerida:**

> Corregimos el error simplemente colocando el punto y coma al final de `System.out.println("Hello, World")`. Nota que todo nuestro código vive dentro de la clase `Main`, la cual debe llamarse exactamente igual que nuestro archivo `Main.java`. Además, está envuelto en el bloque `public static void main`, que funciona como el punto de inicio que Java busca para ejecutar el programa.

### Escena 4: ejecución y comprobación

**Visual:** presionar el botón **Run** y ver "Hello, World" en la consola. Luego, cambiar el texto a "Bienvenido a Java" y ejecutar de nuevo.

**Narración sugerida:**

> Al presionar **Run**, la consola muestra limpiamente nuestro mensaje. ¡Nuestra primera compilación exitosa! Ahora hagamos una prueba de control: cambiemos el texto entre las comillas dobles por "Bienvenido a Java" y ejecutemos de nuevo. La salida cambia inmediatamente, demostrando que controlamos el flujo de salida.

### Escena 5: cierre técnico

**Visual:** mostrar la sección de criterios de éxito de la práctica 1.

**Narración sugerida:**

> Antes de avanzar a la lección 2, realiza tu autoevaluación: asegúrate de que tu Repl compile de forma limpia, que comprendas el papel de la clase `Main` y el método `main`, y que hayas experimentado provocando y solucionando el error del punto y coma. ¡Nos vemos en el próximo video!

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