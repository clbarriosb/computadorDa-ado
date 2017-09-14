/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador;

/**
 *
 * @author Carmen_Lucia3
 */
public class node {

    String data;
    node next;

    node(String x) {
        data = x;
        next = null;
    }
}

class stack {

    node start;

    public stack() {
        start = null;
    }

    public boolean emptyStack() {
        if (start == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String data) {
        node newNode;
        newNode = new node(data);
        newNode.next = start;
        start = newNode;
    }

    public void removeAndPrint() {
        String data;
        while (!emptyStack()) {
            data = start.data;
            System.out.print(data);
            start = start.next;
        }
    }
}

class queue {

    node start;
    node end;

    public queue() {
        start = null;
        end = start;
    }

    public boolean emptyQueue() {
        if (start == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String data) {
        node newNode;
        newNode = new node(data);
        if (emptyQueue()) {
            start = newNode;
        } else {
            end.next = newNode;
        }
        end = newNode;
    }

    public void removeAndPrint() {
        String data;
        while (!emptyQueue()) {
            data = start.data;
            System.out.print(data);
            start = start.next;
        }
    }
}
