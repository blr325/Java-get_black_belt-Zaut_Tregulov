package multithreading;

public class SynchronizedBlockEx {
    static final Object lock = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnanbleImplMobile());
        Thread thread2 = new Thread(new RunnanbleImplSkype());
        Thread thread3 = new Thread(new RunnanbleImplViber());

        thread1.start();
        thread2.start();
        thread3.start();
    }

    public void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            for (int i = 1; i <= 3; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
            System.out.println("Mobile call ends");
        }
    }

    public void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
            System.out.println("Skype call ends");
        }
    }

    public void viberCall() {
        synchronized (lock) {
            System.out.println("Viber call starts");
            for (int i = 1; i <= 4; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
            System.out.println("Viber call ends");
        }
    }
}

class RunnanbleImplMobile implements Runnable {
    @Override
    public void run() {
        new SynchronizedBlockEx().mobileCall();
    }
}

class RunnanbleImplSkype implements Runnable {
    @Override
    public void run() {
        new SynchronizedBlockEx().skypeCall();
    }
}

class RunnanbleImplViber implements Runnable {
    @Override
    public void run() {
        new SynchronizedBlockEx().viberCall();
    }
}

