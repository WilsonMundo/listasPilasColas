/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilascolaslilstas;


/**
 *
 * @author WilsonMundo
 */
public class ListaArbolBinario {

    private Node root;

    private class Node {

        int value;
        Node left, right;

        public Node(int item) {
            value = item;
            left = right = null;
        }
    }

    private Node insertNodeRec(Node root, int value) {

        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertNodeRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertNodeRec(root.right, value);
        }

        return root;
    }

    private void inOrderNodeRec(Node root) {
        if (root != null) {
            inOrderNodeRec(root.left);
            System.out.println(root.value);
            inOrderNodeRec(root.right);
        }
    }

    public ListaArbolBinario() {
        root = null;
    }

    public void inOrder() {
        inOrderNodeRec(root);
    }

    public void insert(int value) {
        root = insertNodeRec(root, value);
    }

}
