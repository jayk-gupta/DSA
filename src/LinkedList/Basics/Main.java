package LinkedList.Basics;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(7);
        list.insertFirst(5);
        list.insertFirst(3);
        list.insertLast(9);
        list.insertLast(12);
        list.insertAtIndex(3,32);
//LinkedList$Node@5f184fc6,
        list.displayList();
//        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        list.displayList();
    }
}
