public class Synchronization {

    static class Counter {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        };

        java.lang.Thread t1 = new java.lang.Thread(task);
        java.lang.Thread t2 = new java.lang.Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();  // Fixed typo

        System.out.println("Final count: " + counter.getCount()); // Should be 10
    }
}