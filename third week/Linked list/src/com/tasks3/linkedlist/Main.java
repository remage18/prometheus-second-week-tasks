package com.tasks3.linkedlist;

public class Main {

    public static void main(String[] args) {
	    LinkedList test = new LinkedList();
	    test.add((Integer) 1);
        test.add((Integer) 2);
        test.add((Integer) 3);
        test.add((Integer) 4);
        test.add((Integer) 5);
        System.out.println(test.get(0));
        test.delete(0);
        System.out.println(test.get(0));
        System.out.println("Linked list size is " + test.size());
    }
}
