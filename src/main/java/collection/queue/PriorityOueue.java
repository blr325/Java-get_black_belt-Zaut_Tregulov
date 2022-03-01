package collection.queue;

import java.util.PriorityQueue;

public class PriorityOueue {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(32);
        priorityQueue.offer("Ян");
        priorityQueue.offer("Андрей");
        priorityQueue.offer("Михаил");
        priorityQueue.offer("Сергей");
        priorityQueue.offer("Федор");
        priorityQueue.offer("Sam");
        System.out.println("priorityQueue = " + priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}
