package multithreading;

public class WaitNotifyEx {
    public static void main(String[] args) {
        Market market = new Market();
        Consumer consumer = new Consumer(market);
        Producer producer = new Producer(market);
        Thread thread1 = new Thread(consumer);
        Thread thread2 = new Thread(producer);
        thread1.start();
        thread2.start();
    }
}

class Market {
    private int breadCount = 0;

    public synchronized void getBread() {
        while (breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("Потребитель купил 1 хлеб");
        System.out.println("Количество хлеба в магазине = " + breadCount);
        notify();

    }

    public synchronized void putBread() {
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("Производитель добавил 1 хлеб");
        System.out.println("Количество хлеба в магазине = " + breadCount);
        notify();
    }
}

class Consumer implements Runnable {
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}


class Producer implements Runnable {
    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}