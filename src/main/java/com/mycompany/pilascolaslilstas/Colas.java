/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilascolaslilstas;

/**
 *
 * @author WilsonMundo
 */
public class Colas {
    private Node front;
    private Node rear;
   private class Node {
        int value;
        Node right;

        public Node(int value) {
            this.value = value;
            this.right = null;
        }
    }
    public Colas() {
        this.front = null;
        this.rear = null;
    }
     public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.right = newNode;
            rear = newNode;
        }
    }
      public int dequeue() {
        if (front == null) {
            throw new RuntimeException("La cola esta vacia");
        }
        int value = front.value;
        front = front.right;
        if (front == null) {
            rear = null;
        }
        return value;
    }
      
    public int peek() {
        if (front == null) {
            throw new RuntimeException("La cola esta vacia");
        }
        return front.value;
    }
      public void LimpiandoCola() {
        while (front != null) {
            System.out.println("Valor saliendo de la cola " + dequeue());
        }
    }
}
