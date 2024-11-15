/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * Clase que extiende Thread para crear hilos que imprimen mensajes.
 */
public class Hilo extends Thread {

    public Hilo(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración " + i + " hilo " + getName());
        }
        System.out.println("Termina " + getName());
    }
}
