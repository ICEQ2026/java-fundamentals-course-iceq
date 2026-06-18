<p align="center">
  <img src="../assets/banner.png" alt="Java Fundamentals Course" width="100%">
</p>

<div align="center">

# Lección 05: Clases y objetos

### Modelar datos con comportamiento

[![Nivel](https://img.shields.io/badge/Nivel-Principiante-brightgreen?style=flat-square)](#)
[![Duración](https://img.shields.io/badge/Duración-12_min-blue?style=flat-square)](#)
[![Módulo](https://img.shields.io/badge/Módulo-Guion-orange?style=flat-square)](#)
[![Herramienta](https://img.shields.io/badge/Editor-OnlineGDB-blueviolet?style=flat-square)](#)

</div>

---

## Propósito del video

El video debe explicar **clases, objetos, atributos, constructores y new** usando una demostración corta en OnlineGDB. La narración debe ser clara, técnica y cercana, sin convertir la sesión en una charla motivacional. La analogía principal será **un plano de arquitectura y las casas construidas desde ese plano**.

| Campo | Valor |
|---|---|
| Duración objetivo | 12 minutos |
| Producto visible | Modelo de jugador |
| Archivo de partida | `starter-files/lesson-05-classes-objects` |
| Solución de referencia | `completed-examples/lesson-05-classes-objects` |
| Material de teoría | [Lesson_5.pptx](https://docs.google.com/presentation/d/1raVBHI2qWbQCTI_lIZZjC_1B1Wn4pghPyYe1Qa-oe00/edit?usp=sharing) |

## Reparto del tiempo

| Bloque | Duración aprox. | Pantalla |
|---|---|---|
| Bloque A — Teoría con diapositivas | 6 min (mitad) | Presentación `Lesson_5.pptx` completa, de la primera a la última diapositiva |
| Bloque B — Codificación en vivo | 6 min (mitad) | OnlineGDB, escenas de este guion |

> La persona que grabe debe abrir [Lesson_5.pptx](https://docs.google.com/presentation/d/1raVBHI2qWbQCTI_lIZZjC_1B1Wn4pghPyYe1Qa-oe00/edit?usp=sharing) en Google Slides, compartir pantalla en modo presentación y recorrerla completa antes de abrir OnlineGDB. Solo al terminar la última diapositiva se cambia de pantalla para iniciar el Bloque B.

## Estructura de pantalla

| Zona | Uso |
|---|---|
| Diapositivas (Bloque A) | Explicar teoría: clases, objetos, atributos, constructores y new, apoyándose en `Lesson_5.pptx`. |
| Editor online (Bloque B) | Mostrar código, errores y ejecución. |
| Consola | Evidenciar salida o mensaje de error. |
| Narración | Explicar intención, regla y corrección. |
| Texto breve en pantalla | Mostrar solo nombres de conceptos y pasos. |

## Guion por escenas

### Bloque A — Teoría con diapositivas

**Visual:** presentación `Lesson_5.pptx` en modo presentación, de inicio a fin.

**Narración sugerida:**

> Antes de tocar el editor, vamos a ver con calma qué es una clase, qué es un objeto, cómo se declaran atributos, qué hace un constructor y por qué usamos new para crear instancias. Recorre cada diapositiva explicando el concepto que muestra y, si la diapositiva trae un ejemplo de código, léelo en voz alta señalando cada parte antes de pasar a la siguiente.

**Punto didáctico:** este bloque es expositivo, sin editor de código en pantalla. Sirve para que la persona que mira entienda el "por qué" antes del "cómo".

### Bloque B — Codificación en vivo en OnlineGDB

#### Escena 1: contexto del problema

**Visual:** editor online abierto, sin ejecutar todavía.

**Narración sugerida:**

> En esta lección vamos a trabajar clases, objetos, atributos, constructores y new. Antes de escribir código, conviene entender qué problema estamos resolviendo: necesitamos producir Modelo de jugador. Usaremos una comparación simple: un plano de arquitectura y las casas construidas desde ese plano. Esa imagen nos ayudará a ubicar cada instrucción dentro del programa.

#### Escena 2: código incorrecto controlado

**Visual:** mostrar un error de compilación en OnlineGDB al intentar acceder directamente a un campo privado (ej: `firstPlayer.score = 50;` en `Main.java`).

**Narración sugerida:**

> Observa el error en pantalla: `error: score has private access in Player`. Esto ocurre porque hemos declarado el atributo `score` como `private` dentro de la clase `Player`. En Programación Orientada a Objetos, esto se llama encapsulación: protegemos los datos de un objeto para evitar que código externo los modifique sin control. Intentar saltarse esta regla provoca un error de compilación inmediato.

**Punto didáctico:** explicar que el modificador `private` restringe el acceso directo y obliga a usar métodos controlados (interfaz pública de la clase).

#### Escena 3: construcción de la solución mínima

**Visual:** modificar el código para llamar al método público `addScore(50)` y revisar la declaración del constructor y getters en `Player.java`.

**Narración sugerida:**

> Para solucionarlo, usamos la interfaz pública de la clase llamando al método `firstPlayer.addScore(50)`. Además, revisemos la clase `Player`: usamos un constructor para inicializar el nombre mediante `this.name = name`, y proveemos métodos "getters" públicos como `getName()` y `getScore()` para permitir una lectura segura del estado interno de nuestro objeto.

#### Escena 4: ejecución y comprobación

**Visual:** ejecutar el programa en OnlineGDB, instanciando a "Valeria" y "Mateo", mostrando cómo cada objeto mantiene su puntaje de forma aislada.

**Narración sugerida:**

> Presionamos **Run**. La consola muestra que Valeria tiene 50 puntos y Mateo 30. Aunque ambos se crearon a partir de la misma plantilla o clase `Player`, cada uno es un objeto independiente en memoria. Si modificamos el puntaje de Valeria, el de Mateo permanece inalterado. ¡Esta es la magia de la instanciación!

#### Escena 5: cierre técnico

**Visual:** mostrar la sección de Criterios de éxito de la práctica 5.

**Narración sugerida:**

> Para superar la lección 5, completa tu laboratorio: implementa los atributos privados en la clase `Player`, inicialízalos en el constructor y escribe los getters públicos. Asegúrate también de instanciar y usar la clase de apoyo `TreasureRoom` desde tu clase principal. ¡Nos vemos en el proyecto final!

## Lista de control de grabación

| Revisión | Estado |
|---|---|
| Se presenta `Lesson_5.pptx` completa antes de abrir el editor. | |
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
