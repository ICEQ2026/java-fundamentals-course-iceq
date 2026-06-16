# Guía de entorno OnlineGDB

OnlineGDB es el editor principal del curso porque permite escribir y ejecutar Java desde el navegador. No se necesita instalar Java, JDK, IntelliJ, Eclipse ni extensiones locales.

## Qué se necesita

| Recurso | Uso |
|---|---|
| Navegador moderno | Abrir OnlineGDB y ejecutar los laboratorios. |
| Cuenta de OnlineGDB | Guardar avances y proyectos (opcional y gratuito). |
| Archivos de `starter-files` | Código inicial de cada lección (disponibles en los enlaces oficiales). |
| Archivos de `completed-examples` | Soluciones completas para comparar después del intento propio. |

## Cómo ejecutar tu código en OnlineGDB

1. Abre el enlace de la lección correspondiente desde la tabla de recursos.
2. Selecciona **Java** en el menú desplegable "Language" en la esquina superior derecha si no está seleccionado por defecto.
3. Edita el código directamente en la ventana central.
4. Presiona el botón **Run** (o la tecla **F9**) en el menú superior para compilar y ejecutar tu programa.
5. La consola de entrada y salida se abrirá en la parte inferior de la pantalla.

## Regla de `Main.java`

En Java, un archivo con una clase pública debe tener el mismo nombre que esa clase. En OnlineGDB, la clase por defecto es `Main` y debe estar contenida en el archivo principal `Main.java`.

Correcto:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World");
    }
}
```

Error frecuente:

```text
class Program is public, should be declared in a file named Program.java
```

Ese error aparece cuando intentas renombrar la clase pública `Main` a otro nombre sin renombrar el archivo correspondiente. En este curso introductorio, te recomendamos mantener siempre la clase como `public class Main` y trabajar sobre el archivo principal.

## Cómo trabajar durante un laboratorio

```text
Leer -> Ejecutar -> Cambiar poco -> Ejecutar -> Corregir -> Explicar
```

| Paso | Acción |
|---|---|
| Leer | Revisar el objetivo del archivo y los comentarios del código inicial. |
| Ejecutar | Presionar **Run** antes de comenzar a editar. |
| Cambiar poco | Resolver una parte pequeña del ejercicio paso a paso. |
| Ejecutar | Verificar si el cambio funcionó sin errores. |
| Corregir | Leer el error en la consola si aparece para saber qué cambiar. |
| Explicar | Comprender qué hace cada línea modificada. |

## Errores iniciales comunes

| Error literal o síntoma | Causa probable | Solución |
|---|---|---|
| `class Main is public, should be declared in a file named Main.java` | Se cambió el nombre de la clase `Main` a otra palabra. | Mantener `public class Main` en el código principal. |
| `cannot find symbol` | Nombre de variable, método o clase escrito de forma distinta (mayúsculas/minúsculas). | Revisar mayúsculas, minúsculas y ortografía exacta de la instrucción. |
| `';' expected` | Falta un punto y coma al final de una instrucción de asignación o impresión. | Revisar la línea indicada y añadir `;`. |
| `reached end of file while parsing` | Falta una llave de cierre `}` en la clase o método. | Contar y cerrar las llaves correspondientes. |
| La consola no muestra nada | El programa no imprime o espera que ingreses un dato. | Presionar la consola inferior e ingresar el dato si usa `Scanner`. |
