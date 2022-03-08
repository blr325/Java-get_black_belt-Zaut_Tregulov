package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        Employee employee1 = new Employee("Андрей", callBox);
        Employee employee2 = new Employee("Николай", callBox);
        Employee employee3 = new Employee("Сергей", callBox);
        Employee employee4 = new Employee("Павел", callBox);
        Employee employee5 = new Employee("Михаил", callBox);

        employee1.start();
        employee2.start();
        employee3.start();
        employee4.start();
        employee5.start();
    }
}

class Employee extends Thread {
    private String name;
    private Semaphore callBox;


    public Employee(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждет...");
            callBox.acquire();
            System.out.println(name + " разговаривает по телефону");
            sleep(3000);
            System.out.println(name + " закончил разговаривать по телефону");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
}