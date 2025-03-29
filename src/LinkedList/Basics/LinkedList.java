package LinkedList.Basics;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    //    methods
//    Insert element at first/start of list
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

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
//   go till index - 1 node
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }



    // DELETE
//    Delete first
    public int deleteFirst() {
        int val = head.value;
//        make the next node as head by taking the value of it from the head
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
//        return the node value that is deleted
        return val;
    }

    // delete last
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        secondLast.next = null;
        return val;
    }

    //    get node
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
//    Delete at index
    public int deleteAtIndex(int index) {
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size) {
            return deleteLast();
        }
//        index
//   go till index - 1 node
        Node prev= get(index-1);
        int val = prev.next.value; // 7
        prev.next = prev.next.next; // 9
        size--;
        return val;
    }

    ////////////////////////////////////////////////////
    //  Display list
    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    //    Node
    private class Node {
        private int value;
        private Node next;

        //     constructors
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
