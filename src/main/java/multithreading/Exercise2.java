package multithreading;

public class Exercise2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThreadEx1());
        Thread thread2 = new Thread(new MyThreadEx2());
        thread1.setName("thread 1");
        thread2.setName("thread 2");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread1.start();
        thread2.start();
        System.out.println("Method main. Thread name: " + Thread.currentThread().getName() +
                " priority: " + Thread.currentThread().getPriority() +
                " ID: " + Thread.currentThread().getId());

    }
}

class MyThreadEx1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Method run. Thread name: " + Thread.currentThread().getName() +
                " priority: " + Thread.currentThread().getPriority() +
                " ID: " + Thread.currentThread().getId());
    }
}

class MyThreadEx2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Method run. Thread name: " + Thread.currentThread().getName() +
                " priority: " + Thread.currentThread().getPriority() +
                " ID: " + Thread.currentThread().getId());
    }
}

