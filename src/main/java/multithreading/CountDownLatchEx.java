package multithreading;

import java.util.concurrent.CountDownLatch;
import static multithreading.CountDownLatchEx.countDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    public static void main(String[] args) throws InterruptedException {
        People people1 = new People("Andrei", countDownLatch);
        People people2 = new People("Alex", countDownLatch);
        People people3 = new People("Nikolay", countDownLatch);

        people1.start();
        people2.start();
        people3.start();

        MarketEx market = new MarketEx();
        market.marketStaffIsOnPlace();
        market.everythingIsReady();
        market.openMarket();

    }
}

class MarketEx {
    public MarketEx() {
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    public void marketStaffIsOnPlace() {
        try {
            Thread.sleep(2000);
            System.out.println("Market staff came to work");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    public void everythingIsReady() {
        try {
            Thread.sleep(2000);
            System.out.println("everything is ready,so let's open market");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    public void openMarket() {
        try {
            Thread.sleep(2000);
            System.out.println("Market is opened");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }
}

class People extends Thread {
    private String name;
    private CountDownLatch countDownLatch;

    public People(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " started shopping");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

