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

    }
}
