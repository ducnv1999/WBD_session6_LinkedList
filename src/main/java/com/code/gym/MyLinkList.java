package com.code.gym;

public class MyLinkList {
    private Node head;
    private int numNodes;

    MyLinkList(Object data) {
        head = new Node(data);
    }


    public int getNumNodes() {
        return numNodes;
    }

    public void setNumNodes(int numNodes) {
        this.numNodes = numNodes;
    }


    private class Node {
        private Node next;
        private Object data;

        Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;

        setNumNodes(getNumNodes() + 1);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        setNumNodes(getNumNodes() + 1);

    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
