package multithreading;

import java.util.ArrayList;
import java.util.concurrent.*;

public class CallableExercise {
    private static final long VALUE = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ArrayList<Future<Long>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            long from = VALUE/10 * i +1;
            long to = VALUE/10 * (i+1);
            Future<Long> localSum = executorService.submit(new PartialSum(to,from));
            list.add(localSum);
        }
        for (Future<Long> localSum : list) {
            try {
                sum += localSum.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
        System.out.println("sum = " + sum);
    }
}
class PartialSum implements Callable<Long>{
    private long to;
    private long from;
    private long localSum = 0;

    public PartialSum(long to, long from) {
        this.to = to;
        this.from = from;
    }

    @Override
    public Long call() {
        for (long i = from; i <= to; i++) {
            localSum +=i;
        }
        System.out.println("Sum from " + from + " to " + to + " = " + localSum);
        return localSum;
    }
}
