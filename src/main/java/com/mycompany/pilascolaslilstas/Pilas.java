/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilascolaslilstas;

/**
 *
 * @author WilsonMundo
 */
public class Pilas {
    private Node top;
    
    private class Node {
        int value;
        Node right;

        public Node(int value) {
            this.value = value;
            this.right = null;
        }
    }
    public Pilas() {
        this.top = null;
    }
     public void push(int value) {
        Node newNode = new Node(value);
        newNode.right = top;
        top = newNode;
    }
      public int pop() {
        if (top == null) {
            throw new RuntimeException("Pila Vacia");
        }
        int value = top.value;
        top = top.right;
        return value;
    }
    public int peek() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        return top.value;
    }  
    public void LimpiarPila() {
        while (top != null) {
            System.out.println("Valor saliendo de la pila " + String.format("%d", pop()));
        }
    }
}
