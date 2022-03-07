package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEx {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Employee1 employee1 = new Employee1("Андрей", lock);
        Employee1 employee2 = new Employee1("Максим", lock);
        Employee1 employee3 = new Employee1("Евгений", lock);
        Employee1 employee4 = new Employee1("Михаил", lock);
        Employee1 employee5 = new Employee1("Константин", lock);

    }
}

class Employee1 extends Thread {
    private String name;
    private Lock lock;

    public Employee1(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
                lock.lock();
                System.out.println(name + " пользуется банкоматом");
                    Thread.sleep(2000);
                System.out.println(name + " закончил пользоваться банкоматом");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " не хочет ждать");
        }
    }
}
