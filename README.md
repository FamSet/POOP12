POOP12 - Documentación del Código
Este proyecto implementa una aplicación en Java que crea y gestiona múltiples hilos para demostrar el uso de la clase Thread y la implementación de la interfaz Runnable. Permite la creación de hilos que imprimen mensajes en la consola de manera concurrente.

Índice
Descripción General
Clases
POOP12
Hilo
Hilor
Ejecución del Programa
Descripción General
El proyecto POOP12 está diseñado para mostrar cómo se pueden crear y manejar hilos en Java de dos maneras distintas: extendiendo la clase Thread y usando la interfaz Runnable. Los hilos ejecutan una tarea que imprime iteraciones numeradas junto con el nombre del hilo. Esta aplicación permite comprender cómo los hilos pueden ejecutarse concurrentemente y gestionar múltiples procesos.

Clases
POOP12
La clase POOP12 es la clase principal del proyecto y contiene el método main. Su objetivo es iniciar la ejecución de los hilos y demostrar el uso de Thread y Runnable.

Funcionalidades:

Crea y ejecuta instancias de la clase Hilor implementada con Runnable.
Gestiona la creación de hilos y su ejecución concurrente.
Métodos:

public static void main(String[] args): Inicia la ejecución de varios hilos creados con Runnable.
Hilo
La clase Hilo hereda de Thread y sobrescribe el método run() para definir la lógica de los hilos. Imprime iteraciones y el nombre del hilo.

Atributos:

String name: Nombre del hilo, heredado de Thread.
Métodos:

Hilo(String name): Constructor que inicializa el hilo con un nombre específico.
public void run(): Sobrescribe el método run() de Thread para definir el comportamiento del hilo, imprimiendo 10 iteraciones y finalizando con un mensaje.
Ejemplo de uso:
