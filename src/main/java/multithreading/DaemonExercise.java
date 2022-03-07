package multithreading;

public class DaemonExercise {
    public static void main(String[] args) {
        System.out.println("Method main begins");
        UserThread userThread = new UserThread();
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        System.out.println("userThread.isDaemon() = " + userThread.isDaemon());
        System.out.println("daemonThread.isDaemon() = " + daemonThread.isDaemon());
        userThread.start();
        daemonThread.start();
        try {
            userThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nMethod main ends");
    }
}

class UserThread extends Thread {
    @Override
    public void run() {
        for (char i = 'A'; i <= 'Z'; i++) {
            try {
                System.out.print(i + " ");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.print(i + " ");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

