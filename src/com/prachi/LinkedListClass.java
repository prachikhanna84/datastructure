package com.prachi;

public class LinkedListClass {

    private Node head;
    private Node current;
    private Node next;

    LinkedListClass(){
        this.head=new Node("Head Node");
        current=head;
    }

    LinkedListClass(String data){
        this.head=new Node(data);
        current=head;
    }

    void addElement(String data){
        next = new Node(data);
        current.setNext(next);
        next.setNext(null);
    }

    void display(){

        Node start = head;
        while (start != null){

            System.out.println(start.getData());
            start = start.getNext();
        }
    }

    private class Node{

        private String data;
        private Node next;

        public String getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        Node(String data){
            this.data= data;
            this.next=null;
        }

    }


}
