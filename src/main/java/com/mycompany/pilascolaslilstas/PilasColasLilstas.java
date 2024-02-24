/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilascolaslilstas;

/**
 *
 * @author WilsonMundo
 */
public class PilasColasLilstas {

    public static void main(String[] args) {
        System.out.println("Tarea 1");
        System.out.println("Arbol Binario");
        ListaArbolBinario arbol = new ListaArbolBinario();
        arbol.insert(100);
        arbol.insert(20);
        arbol.insert(50);
        arbol.insert(10);
        arbol.insert(60);
        arbol.insert(55);
        arbol.insert(70);
        arbol.insert(0);
        System.out.println("El recorrido inorden del arbol binario es:");
        arbol.inOrder();
        System.out.println("pila");
        Pilas pila = new Pilas();
        pila.push(100);
        pila.push(20);
        pila.push(50);
        pila.push(10);
        pila.push(60);
        System.out.println("Recorriendo la pila hasta dejarla vacia");
        pila.LimpiarPila();
        System.out.println("cola");
        Colas cola = new Colas();
        cola.enqueue(100);
        cola.enqueue(20);
        cola.enqueue(50);
        cola.enqueue(10);
        cola.enqueue(60);
        
        System.out.println("Recorriendo la cola");
        cola.LimpiandoCola();
    }
}
