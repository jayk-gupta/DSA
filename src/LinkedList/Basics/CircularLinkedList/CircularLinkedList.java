package LinkedList.Basics.CircularLinkedList;

import LinkedList.Basics.LinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        this.size = 0;
    }

    //    INSERT
//    insert first
    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
        }
        node.next = head;
        tail.next = node;
        tail = node;
    }

    // insert last
    public void insertLast(int val) {
//        if there is no node present
        if (tail == null) {
            insertFirst(val);
        } else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }

    }

    // Node
    private class Node {
        private int value;
        private Node next;

        //        constructors
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
