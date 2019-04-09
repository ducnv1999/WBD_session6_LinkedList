package com.code.gym;

public class MyLinkListtest {
    public static void main(String[] args) {
        System.out.println("----------TEST MY LINKED LIST----------");
        MyLinkList list = new MyLinkList(3);
        list.addFirst(4);
        list.addFirst(5);
        list.printList();
        System.out.println(list.getNumNodes());
    }
}
