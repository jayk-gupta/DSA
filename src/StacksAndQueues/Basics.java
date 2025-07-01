package StacksAndQueues;

import java.util.*;

public class Basics {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(3);
//        stack.push(34);
//        stack.push(32);
//        stack.push(12);
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack);

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(6);
//        queue.add(12);
//        queue.add(24);
//        System.out.println(queue);
//        System.out.println(queue.peek());
//        System.out.println(queue.remove()); //3
//        System.out.println(queue.remove()); //6
//        System.out.println(queue.remove()); //12
//        System.out.println(queue.remove()); //24

//        Deque (deck)
//        no capacity restriction
//        faster than stack and linked list
        Deque<Integer> d = new ArrayDeque<>();
        d.add(56);
        d.addFirst(6);
        d.addLast(5);
        d.addLast(8);
        System.out.println(d);

    }
}
