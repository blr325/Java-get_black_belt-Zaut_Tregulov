package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<String> queueLinkedList = new LinkedList<>();
        queueLinkedList.add("Андрей");
        queueLinkedList.offer("Михаил");
        queueLinkedList.add("Федор");
        queueLinkedList.add("Арсений");
        queueLinkedList.add("Сергей");
        System.out.println("queueLinkedList = " + queueLinkedList);
        System.out.println("queueLinkedList.element() = " + queueLinkedList.element());
        System.out.println("queueLinkedList.remove() = " + queueLinkedList.remove());
        System.out.println("queueLinkedList.remove(\"Арсений\") = " + queueLinkedList.remove("Арсений"));
        System.out.println("queueLinkedList = " + queueLinkedList);
        System.out.println("queueLinkedList.peek() = " + queueLinkedList.peek());
        System.out.println("queueLinkedList = " + queueLinkedList);
        System.out.println("queueLinkedList.poll() = " + queueLinkedList.poll());
        System.out.println("queueLinkedList = " + queueLinkedList);
    }
}
