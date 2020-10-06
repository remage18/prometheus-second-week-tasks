package com.tasks3.linkedlist;

public class LinkedList {

    private Node head, tail;

    public LinkedList() {
        //PUT YOUR CODE HERE
        //PUT YOUR CODE HERE
    }

    public void add(Integer data) {
        //PUT YOUR CODE HERE
        Node node = new Node();
        node.setData(data);
        if(head == null){
            head = node;
        }
        else{
            tail.setNext(node);
        }
        tail = node;
        //PUT YOUR CODE HERE
    }

    public Integer get(int index) {
        //PUT YOUR CODE HERE
        Node current = head;
        for(int i = 0; i < index; i++){
            current = current.getNext();
        }
        return current.getData();
        //PUT YOUR CODE HERE
    }

    public boolean delete(int index) {
        //PUT YOUR CODE HERE
        if(index == 0){
            head = head.getNext();
            return true;
        }
        Node previous = null, current = head;
        while(current != null){
            if(current.getData().equals(index - 1)){
                if(previous != null){
                    previous.setNext(current.getNext());
                    if(current.getNext() == null){
                        tail = previous;
                    }
                }
                else{
                    head = head.getNext();
                    if(head == null){
                        tail = null;
                    }
                }
                return true;
            }
            previous = current;
            current = current.getNext();
        }
        return false;
        //PUT YOUR CODE HERE
    }

    public int size() {
        //PUT YOUR CODE HERE
        Node current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.getNext();
        }
        return count;
        //PUT YOUR CODE HERE
    }
}
