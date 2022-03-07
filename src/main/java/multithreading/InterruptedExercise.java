package multithreading;

public class InterruptedExercise {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread(), "My_Thread");
        thread.start();
        try {
            Thread.sleep(2000);
            thread.interrupt();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread " + Thread.currentThread().getName() + "has been interrupted");
        }

    }

}

class MyThread implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        System.out.printf("%s started\n", Thread.currentThread().getName());
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Loop = " + count++);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " has been interrupted");
                break;
            }
        }
        System.out.println("Loop finished, count = " + count);
        System.out.printf("%s finished\n", Thread.currentThread().getName());
    }
}
