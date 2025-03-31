package LinkedList.Basics.DoublyLinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.size = 0;
    }

    ///////////////////////////////////////////////////////
//    INSERT
//    INSERT FIRST
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
//        list is not empty
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // INSERT LAST
    public void insertLast(int val) {
        if (head == null) {
            insertFirst(val);
        } else {
            Node node = new Node(val);
            tail.next = node;
            node.prev = tail;
            tail = node;
            size++;
        }
    }

    // INSERT AT INDEX
    public void insertAtIndex(int index, int val) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
//        index
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp, temp.next);
        temp.next.prev = node;
        temp.next = node;
        size++;

    }

    // DELETE
//    Delete first
    public int deleteFirst() {
//        if list is empty
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
//        store node value
        int val = head.value;
//        if there is only one node
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
//        return deleted node
        return val;
    }

    // Delete last
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        int val = tail.value;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }
    public int deleteAtIndex(int index){
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size) {
            return deleteLast();
        }
        Node node = get(index-1);
        int val = node.value;
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
        return val;
    }
// get
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
// find
    public Node find(int value){
        Node node = head;
        while (node!=null){
            if(node.value == value) return node;
            node = node.next;
        }
        return node;
    }
    //////////////////////////////////////////////////////
    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    ////////////////////////////////////////////////////////////////
    // Node
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
