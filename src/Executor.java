import java.lang.Thread;
import java.util.concurrent.*;

public class Executor {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Callable<Integer> task = () -> {
            Thread.sleep(1000);
            return 100;
        };

        Future<Integer> future = executor.submit(task);
        System.out.println("Doing other work...");
        Integer result = future.get();
        System.out.println("Result: " + result);
        executor.shutdown();
    }
}
