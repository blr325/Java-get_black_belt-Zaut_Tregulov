package multithreading;

public class VolatileEx extends Thread {
    volatile boolean a = true;

    public void run() {
        System.out.println("Method run begins");
        long count = 0;
        while (a) {
            count++;
        }
        System.out.println("Method run ends, counter = " + count);
    }

    public static void main(String[] args) {
        VolatileEx thread = new VolatileEx();
        System.out.println("Method main begins");
        thread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After 3 seconds it is time to wake up !");
        thread.a = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Methods main ends");
    }
}

