/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * Clase que implementa Runnable para crear hilos con la interfaz Runnable.
 */
public class Hilor implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración " + i + " " + Thread.currentThread().getName());
        }
        System.out.println("Termina el " + Thread.currentThread().getName());
    }
}
