import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorCallableExample {
    private static Callable<Integer> squareTask(int number) {
        return () -> number * number;
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Callable<Integer>> tasks = List.of(
                squareTask(4),
                squareTask(7),
                squareTask(9)
        );

        try {
            List<Future<Integer>> results = new ArrayList<>();

            for (Callable<Integer> task : tasks) {
                results.add(executor.submit(task));
            }

            for (Future<Integer> result : results) {
                System.out.println("Result: " + result.get());
            }
        } catch (Exception ex) {
            System.out.println("Task failed: " + ex.getMessage());
        } finally {
            executor.shutdown();
        }
    }
}
