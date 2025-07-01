package StacksAndQueues;

public class CustomStack {
    //    it is an array
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
//         CALL CustomStack CONSTRUCTOR
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop from empty stack");
        }
        int removedItem = data[ptr];
        ptr--;
        return removedItem;
//        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot peek from empty stack");
        }
        return data[ptr];
    }


    private boolean isFull() {
        return ptr == data.length - 1;
    }

    private boolean isEmpty() {
        return ptr == -1;
    }
    //  method to display stack elements
    public boolean display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return false;
        }
        System.out.print("Stack elements (top to bottom): [");
        for (int i = ptr; i >= 0; i--) { // Iterate from top (ptr) down to bottom (0)
            System.out.print(data[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        return false;
    }
}
