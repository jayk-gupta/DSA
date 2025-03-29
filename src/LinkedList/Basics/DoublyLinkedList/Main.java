package LinkedList.Basics.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList l = new DoublyLinkedList();
        l.insertFirst(1);
        l.insertFirst(12);
        l.insertLast(2);
        l.insertLast(3);
        l.insertAtIndex(2,4);
        l.displayList();
    }
}
