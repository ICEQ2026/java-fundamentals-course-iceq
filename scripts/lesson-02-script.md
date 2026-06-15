<p align="center">
  <img src="../assets/banner.png" alt="Java Fundamentals Course" width="100%">
</p>

<div align="center">

# Lección 02: Variables y tipos de datos

### Guardar información con precisión

[![Nivel](https://img.shields.io/badge/Nivel-Principiante-brightgreen?style=flat-square)](#)
[![Duración](https://img.shields.io/badge/Duración-9_min-blue?style=flat-square)](#)
[![Módulo](https://img.shields.io/badge/Módulo-Guion-orange?style=flat-square)](#)
[![Herramienta](https://img.shields.io/badge/Herramienta-Replit-blueviolet?style=flat-square)](#)

</div>

---

## Propósito del video

El video debe explicar **String, int, double, boolean y concatenación** usando una demostración corta en Replit. La narración debe ser clara, técnica y cercana, sin convertir la sesión en una charla motivacional. La analogía principal será **cajas fuertes etiquetadas para guardar cada tipo de dato**.

| Campo | Valor |
|---|---|
| Duración objetivo | 9 minutos |
| Producto visible | Ficha de estudiante |
| Archivo de partida | `starter-files/lesson-02-variables` |
| Solución de referencia | `completed-examples/lesson-02-variables` |

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

> En esta lección vamos a trabajar String, int, double, boolean y concatenación. Antes de escribir código, conviene entender qué problema estamos resolviendo: necesitamos producir Ficha de estudiante. Usaremos una comparación simple: cajas fuertes etiquetadas para guardar cada tipo de dato. Esa imagen nos ayudará a ubicar cada instrucción dentro del programa.

### Escena 2: código incorrecto controlado

**Visual:** mostrar un error de discrepancia de tipos en Replit (por ejemplo, declarar `int age = "quince";`).

**Narración sugerida:**

> En esta escena, observa lo que sucede si intentamos guardar el texto `"quince"` dentro de una variable de tipo `int`. Al ejecutar, Java nos arrojará un error de tipos incompatibles: `error: incompatible types: String cannot be converted to int`. A diferencia de otros lenguajes, Java tiene tipado estático, lo que significa que debemos ser estrictamente claros sobre qué tipo de caja fuerte usamos para cada tipo de dato.

**Punto didáctico:** señalar el error en la consola, explicar la diferencia entre números enteros y texto con comillas, y por qué falló la compilación.

### Escena 3: construcción de la solución mínima

**Visual:** corregir la asignación a `int age = 15;` y declarar variables adicionales (`String studentName`, `double averageGrade`, `boolean active`).

**Narración sugerida:**

> Para resolverlo, asignamos el valor numérico `15` a nuestra variable `age`. Además, declaramos `studentName` como `String` para textos, `averageGrade` como `double` para decimales y `active` como `boolean` para valores lógicos de verdadero o falso. Ahora cada caja fuerte tiene la etiqueta y el contenido correspondiente.

### Escena 4: ejecución y comprobación

**Visual:** imprimir los datos en la consola usando la concatenación con el operador `+`. Ejecutar y ver los datos mostrados con etiquetas claras.

**Narración sugerida:**

> Ahora unimos nuestros datos usando el operador `+` para la concatenación, por ejemplo: `"Nombre: " + studentName`. Al presionar **Run**, la consola imprime una hermosa ficha del estudiante con etiquetas legibles. Los datos dinámicos guardados en memoria ahora son visibles en la interfaz.

### Escena 5: cierre técnico

**Visual:** mostrar la sección de criterios de éxito de la práctica 2.

**Narración sugerida:**

> Antes de pasar a la lección 3, completa la práctica: crea tus propias variables, experimenta combinando texto y números al imprimir, y verifica que comprendes la diferencia entre tipos primitivos como `int` y tipos complejos como `String`. ¡Nos vemos en el siguiente módulo!

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