<p align="center">
  <img src="../assets/banner.png" alt="Java Fundamentals Course" width="100%">
</p>

<div align="center">

# Lección 06: Encapsulación y proyecto final

### Proteger reglas internas en una aplicación pequeña

[![Nivel](https://img.shields.io/badge/Nivel-Principiante-brightgreen?style=flat-square)](#)
[![Duración](https://img.shields.io/badge/Duración-12_min-blue?style=flat-square)](#)
[![Módulo](https://img.shields.io/badge/Módulo-Guion-orange?style=flat-square)](#)
[![Herramienta](https://img.shields.io/badge/Editor-OnlineGDB-blueviolet?style=flat-square)](#)

</div>

---

## Propósito del video

El video debe explicar **private, getters, métodos públicos, arrays y proyecto integrado** usando una demostración corta en OnlineGDB. La narración debe ser clara, técnica y cercana, sin convertir la sesión en una charla motivacional. La analogía principal será **una caja fuerte con ventanilla para pedir operaciones sin tocar el interior**.

| Campo | Valor |
|---|---|
| Duración objetivo | 12 minutos |
| Producto visible | Aventura del Número Secreto |
| Archivo de partida | `starter-files/lesson-06-final-project` |
| Solución de referencia | `completed-examples/lesson-06-final-project` |

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

> En esta lección vamos a trabajar private, getters, métodos públicos, arrays y proyecto integrado. Antes de escribir código, conviene entender qué problema estamos resolviendo: necesitamos producir Aventura del Número Secreto. Usaremos una comparación simple: una caja fuerte con ventanilla para pedir operaciones sin tocar el interior. Esa imagen nos ayudará a ubicar cada instrucción dentro del programa.

### Escena 2: código incorrecto controlado

**Visual:** mostrar un fallo lógico en el juego donde el jugador pierde todas sus vidas pero la ronda continúa pidiéndole números (ej. el bucle del juego no verifica si `player.hasLives()` es verdadero).

**Narración sugerida:**

> Observa este comportamiento inesperado. El jugador se ha quedado sin vidas, pero el juego le sigue pidiendo que intente adivinar el número. Esto es un error de lógica. El código compila perfectamente, pero no se comporta como queremos porque omitimos controlar el estado del jugador dentro de la condición de continuidad del bucle.

**Punto didáctico:** diferenciar entre errores de compilación y errores lógicos (bugs de comportamiento) en tiempo de ejecución, y cómo identificarlos probando el programa con casos límite.

### Escena 3: construcción de la solución mínima

**Visual:** corregir la condición del bucle en `Game.java` agregando `&& player.hasLives()`, y mostrar la estructura del proyecto con múltiples archivos cooperando.

**Narración sugerida:**

> Para solucionarlo, añadimos la comprobación `&& player.hasLives()` tanto en el bucle del nivel como en el de intentos. Ahora, el flujo se detendrá inmediatamente si el jugador pierde su última vida. Nota cómo este proyecto final se divide en varios archivos: `Main` inicia, `Game` coordina, `Player` guarda el estado, `InputHelper` valida la entrada y `GameMessage` maneja los textos. Esta estructura modular hace que el código sea mantenible.

### Escena 4: ejecución y comprobación

**Visual:** ejecutar el juego completo e interactuar en consola pasando de nivel al acertar el número, mostrando el cálculo dinámico de puntaje y el mensaje final de victoria.

**Narración sugerida:**

> Ejecutamos la "Aventura del Número Secreto". Ingreso mi nombre, juego el primer nivel buscando un número del 1 al 10. Acierto y gano puntos. Al avanzar al nivel 2, el límite aumenta a 20. Todo el flujo interactivo, la validación de que no ingrese letras y el cálculo de puntaje funcionan perfectamente en la consola. ¡El proyecto integrador está completo y responde con total precisión!

### Escena 5: cierre técnico

**Visual:** mostrar la sección de criterios de éxito del proyecto final.

**Narración sugerida:**

> ¡Felicitaciones por llegar al final! Al completar este proyecto, asegúrate de que todos tus archivos (`Main.java`, `Game.java`, `Player.java`, `InputHelper.java`, `GameMessage.java`) compilen de manera conjunta en OnlineGDB y que el juego termine limpiamente cuando el jugador gane o se quede sin vidas. Estás listo para compartir tu creación. ¡Hasta la próxima!

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