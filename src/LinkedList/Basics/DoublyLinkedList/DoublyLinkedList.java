package LinkedList.Basics.DoublyLinkedList;

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
