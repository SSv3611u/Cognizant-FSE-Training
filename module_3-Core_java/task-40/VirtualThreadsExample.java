public class VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread[] threads = new Thread[100_000];
        for (int i = 0; i < threads.length; i++) {
            int taskNumber = i + 1;
            threads[i] = Thread.startVirtualThread(() -> {
                if (taskNumber <= 10) {
                    System.out.println("Virtual thread " + taskNumber + " is running");
                }
            });
        }

        for (Thread thread : threads) {
            thread.join();
        }

        long end = System.currentTimeMillis();
        System.out.println("Completed in " + (end - start) + " ms");
    }
}
