<p align="center">
  <img src="../../../assets/lesson-05-banner.png" alt="Clases y objetos" width="100%">
</p>

<div align="center">

# Lección 05: Clases y objetos

### Modelar una idea con datos y comportamiento

[![Nivel](https://img.shields.io/badge/Nivel-Intermedio_inicial-brightgreen?style=flat-square)](#)
[![Duración](https://img.shields.io/badge/Duración-12_min-blue?style=flat-square)](#)
[![Módulo](https://img.shields.io/badge/Módulo-Teoría-orange?style=flat-square)](#)
[![Editor](https://img.shields.io/badge/Editor-OnlineGDB-blueviolet?style=flat-square)](#)
[![Sin_instalación](https://img.shields.io/badge/Sin_instalación-Navegador-lightgrey?style=flat-square)](#)

</div>


---

<p align="center">
  <img src="../../../assets/separator.png" alt="Separador visual del curso" width="100%">
</p>

## Punto de partida

El proyecto ya tiene datos, reglas e interacción. Ahora necesita un modelo. En lugar de tener variables sueltas, agrupas nombre, puntaje y comportamiento en una clase.

> [!TIP]
> [!NOTE]
> **Analogía de la lección**: Una clase es un plano. Un objeto es una construcción concreta hecha con ese plano. Puedes tener muchos jugadores desde la misma clase.

Antes de abrir OnlineGDB, mira el objetivo técnico de esta sesión: al terminar deberías poder **crear una clase Player, instanciar objetos y llamar métodos**. No memorices cada palabra del código; identifica qué responsabilidad cumple cada bloque.

## Conceptos de la sesión

### Clase
Una clase describe qué datos y comportamientos tendrá un tipo de objeto. No es el objeto; es el diseño.

### Objeto
Un objeto existe en memoria cuando se usa `new`. Tiene valores propios, aunque comparta la misma clase con otros objetos.

### Atributo
Un atributo guarda estado. En `Player`, el nombre y el puntaje son parte del estado del jugador.

### Constructor
El constructor prepara un objeto al nacer. Si un jugador necesita nombre inicial, el constructor debe recibirlo.

## Lectura guiada de código

Distingue plano y objeto: `class Player` define el plano; `new Player("Alex")` construye un jugador concreto.

El siguiente ejemplo está mal a propósito. En un curso para principiantes, ver el error primero ayuda a entender la regla.

~~~java
public class Player {
    String name;
}

public class Main {
    public static void main(String[] args) {
        Player.name = "Alex";
    }
}
~~~

**Qué ocurre:** El atributo `name` pertenece a cada objeto `Player`, no a la clase en abstracto. Primero se crea un objeto con `new`; luego se usan sus datos y métodos.

Ahora observa una versión correcta y mínima:

~~~java
public class Player {
    String name;
    int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void showStatus() {
        System.out.println(name + " tiene " + score + " puntos.");
    }
}

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Alex");
        player.showStatus();
    }
}
~~~

### Señales que debes reconocer

- La estructura principal se mantiene estable.
- Los nombres comunican intención.
- El código se puede ejecutar en OnlineGDB sin instalación local.
- El ejemplo prepara una pieza del proyecto final, no es una actividad aislada.

## Pausa de comprensión

Responde en una libreta o en un comentario del Repl:

1. ¿Qué línea produce el resultado visible?
2. ¿Qué parte del código no deberías modificar todavía?
3. ¿Qué error sería más fácil de cometer en esta lección?

## Material externo opcional

- OnlineGDB se usará como editor principal porque permite ejecutar desde el navegador.
- Dev.java y Oracle Java Tutorials se usan como referencia técnica para validar sintaxis y conceptos.


## Por qué aparece la Programación Orientada a Objetos

Hasta la lección anterior, los datos podían vivir como variables sueltas:

~~~java
String playerName = "Alex";
int playerScore = 0;
int playerEnergy = 80;
~~~

Eso funciona para un solo jugador. El problema aparece cuando el programa crece.

Imagina que quieres tener tres jugadores:

~~~java
String playerOneName = "Alex";
int playerOneScore = 0;

String playerTwoName = "Valeria";
int playerTwoScore = 0;

String playerThreeName = "Diego";
int playerThreeScore = 0;
~~~

El código empieza a repetir nombres y estructuras. Si agregas energía, nivel o vidas, debes duplicar más variables.

La Programación Orientada a Objetos propone otra forma de pensar:

```text
En vez de tener datos sueltos,
crea un modelo que agrupe datos relacionados.
```

Ese modelo será una clase.

---

## Clase como plano

Una clase es un plano. Describe qué datos y comportamientos tendrá un objeto.

```text
Clase Player
 |
 |-- name
 |-- score
 |-- showStatus()
```

La clase no es todavía un jugador concreto. Es la definición.

~~~java
public class Player {
    String name;
    int score;

    public void showStatus() {
        System.out.println(name + " tiene " + score + " puntos.");
    }
}
~~~

Esta clase dice:

- todo jugador tendrá nombre;
- todo jugador tendrá puntaje;
- todo jugador podrá mostrar su estado.

---

## Objeto como instancia

Un objeto es una versión concreta de una clase.

~~~java
Player player = new Player();
~~~

Aquí Java crea un objeto `Player`.

Mapa:

```text
Clase: Player
       |
       v
new Player()
       |
       v
Objeto: player
```

Si creas dos objetos:

~~~java
Player firstPlayer = new Player();
Player secondPlayer = new Player();
~~~

ambos vienen del mismo plano, pero pueden guardar valores distintos.

---

## Atributos

Los atributos son variables que pertenecen al objeto.

~~~java
public class Player {
    String name;
    int score;
}
~~~

`name` y `score` describen estado.

Estado significa:

```text
qué datos tiene el objeto en este momento
```

Ejemplo mental:

```text
player
 |
 |-- name = "Alex"
 |-- score = 0

otherPlayer
 |
 |-- name = "Valeria"
 |-- score = 10
```

La clase es la misma. Los objetos pueden tener valores distintos.

---

## Comportamiento

Los métodos dentro de una clase representan comportamiento.

~~~java
public void showStatus() {
    System.out.println(name + " tiene " + score + " puntos.");
}
~~~

Este método usa datos del objeto.

Si `name` vale `"Alex"` y `score` vale `0`, imprime:

```text
Alex tiene 0 puntos.
```

Si otro objeto tiene `name = "Valeria"` y `score = 10`, el mismo método puede imprimir:

```text
Valeria tiene 10 puntos.
```

Esa es una idea poderosa: mismo comportamiento, distinto estado.

---

## Constructor

Un constructor prepara el objeto al momento de crearlo.

Sin constructor explícito:

~~~java
Player player = new Player();
player.name = "Alex";
player.score = 0;
~~~

Con constructor:

~~~java
Player player = new Player("Alex");
~~~

La creación queda más clara.

Ejemplo:

~~~java
public class Player {
    String name;
    int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }
}
~~~

### ¿Qué significa `this`?

`this` se refiere al objeto actual.

~~~java
this.name = name;
~~~

Lectura:

```text
El atributo name de este objeto recibe el parámetro name.
```

Sin `this`, puede ser difícil distinguir atributo y parámetro cuando tienen el mismo nombre.

---

## Archivos separados

En esta lección hay más de un archivo:

```text
lesson-05-classes-objects/
 |
 |-- Main.java
 |-- Player.java
 |-- TreasureRoom.java
```

Cada clase pública vive en su propio archivo.

| Archivo | Responsabilidad |
|---|---|
| `Main.java` | Iniciar la práctica y crear objetos. |
| `Player.java` | Representar al jugador. |
| `TreasureRoom.java` | Representar una sala simple del juego. |

Esta organización prepara el proyecto final, donde habrá varias clases colaborando.

---

## Error común: usar atributo como si fuera de clase

Código incorrecto:

~~~java
Player.name = "Alex";
~~~

Problema:

`name` pertenece a un objeto, no a la clase en abstracto.

Corrección:

~~~java
Player player = new Player("Alex");
~~~

o, en una versión sin constructor:

~~~java
Player player = new Player();
player.name = "Alex";
~~~

La primera opción es más ordenada.

---

## Error común: olvidar `new`

Código incorrecto:

~~~java
Player player;
player.showStatus();
~~~

Problema:

Declaraste una referencia, pero no creaste el objeto.

Corrección:

~~~java
Player player = new Player("Alex");
player.showStatus();
~~~

---

## Error común: constructor con argumentos incorrectos

Si el constructor es:

~~~java
public Player(String name) {
    this.name = name;
    this.score = 0;
}
~~~

Esta llamada falla:

~~~java
Player player = new Player();
~~~

Java puede decir:

```text
constructor Player in class Player cannot be applied to given types
```

Traducción:

> El constructor pide un `String`, pero no recibió nada.

Corrección:

~~~java
Player player = new Player("Alex");
~~~

---

## Diseño de un objeto para principiantes

Para diseñar una clase básica, responde:

1. ¿Qué representa?
2. ¿Qué datos necesita guardar?
3. ¿Qué acciones puede realizar?
4. ¿Cómo se crea correctamente?

Aplicado a `Player`:

| Pregunta | Respuesta |
|---|---|
| ¿Qué representa? | Un jugador. |
| ¿Qué datos guarda? | Nombre y puntaje. |
| ¿Qué acciones realiza? | Mostrar estado, sumar puntos. |
| ¿Cómo se crea? | Con un nombre inicial. |

---

## Clase `TreasureRoom`

El archivo `TreasureRoom.java` introduce otra clase:

~~~java
public class TreasureRoom {
    String roomName;
    int secretLimit;

    public TreasureRoom(String roomName, int secretLimit) {
        this.roomName = roomName;
        this.secretLimit = secretLimit;
    }

    public String getDescription() {
        return "Sala: " + roomName + " | Números posibles: 1 a " + secretLimit;
    }
}
~~~

Esta clase representa una sala del juego.

Datos:

- `roomName`;
- `secretLimit`.

Comportamiento:

- `getDescription()`.

La idea no es complicar la lección. La idea es mostrar que una aplicación puede tener más de un tipo de objeto.

---

## Mapa entre objetos

```text
Main
 |
 |-- crea Player
 |       |
 |       |-- name
 |       |-- score
 |       |-- showStatus()
 |
 |-- crea TreasureRoom
         |
         |-- roomName
         |-- secretLimit
         |-- getDescription()
```

`Main` coordina. Los objetos guardan datos y ofrecen comportamientos.

---

## Relación con encapsulación

En esta lección los atributos pueden aparecer sin `private` para simplificar. En la siguiente lección se protegerán.

Hoy:

~~~java
String name;
int score;
~~~

Siguiente lección:

~~~java
private String name;
private int score;
~~~

El paso natural es:

```text
crear objetos -> entender estado -> proteger estado
```

No tiene sentido hablar de encapsulación si primero no se entiende qué estado se protege.

---

## Apoyo visual

El siguiente diagrama muestra cómo varias clases pueden colaborar en un programa pequeño. En esta lección interesa observar la idea de clase, objeto, datos y métodos; los detalles completos del flujo se integran en la lección final.

![Modelo simple de clases](../../../assets/images/oop-game-model.svg)

---

## Checklist antes del laboratorio

- [ ] Sé diferenciar clase y objeto.
- [ ] Sé explicar qué es un atributo.
- [ ] Sé explicar qué es un constructor.
- [ ] Sé crear un objeto con `new`.
- [ ] Sé llamar un método de un objeto.
- [ ] Sé distinguir `Player.java` y `Main.java`.
- [ ] Sé explicar por qué `Player.name` no es correcto en esta lección.
- [ ] Sé conectar objetos con el proyecto final.

---

<div align="center">

**Siguiente:** [Laboratorio en OnlineGDB](part-02-practice.md)

</div>



