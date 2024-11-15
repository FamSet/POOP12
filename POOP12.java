/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 * Clase principal que ejecuta los hilos.
 */
public class POOP12 {
    public static void main(String[] args) {
        // Inicia hilos usando Runnable
        new Thread(new Hilor(), "Hilor1").start();
        new Thread(new Hilor(), "Hilor2").start();
        new Thread(new Hilor(), "Hilor3").start();
    }
}
