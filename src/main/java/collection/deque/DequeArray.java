package collection.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class DequeArray {
    public static void main(String[] args) {
        ArrayDeque<Integer> integerDeque = new ArrayDeque<>();
        integerDeque.addFirst(1);
        integerDeque.addLast(13);
        integerDeque.addLast(23);
        integerDeque.addLast(45);
        integerDeque.offerFirst(12);
        integerDeque.offerLast(12);
        System.out.println("integerQueue = " + integerDeque);
        System.out.println("integerDeque.peekFirst() = " + integerDeque.peekFirst());
        System.out.println("integerDeque.peekLast() = " + integerDeque.peekLast());
        System.out.println("integerDeque = " + integerDeque);
        System.out.println("integerDeque.pollFirst() = " + integerDeque.pollFirst());
        System.out.println("integerDeque.pollLast() = " + integerDeque.pollLast());
        System.out.println("integerDeque = " + integerDeque);
        System.out.println("integerDeque.getFirst() = " + integerDeque.getFirst());
        System.out.println("integerDeque.getLast() = " + integerDeque.getLast());
        System.out.println("integerDeque = " + integerDeque);
    }
}
