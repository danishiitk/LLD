package multithreading.shared;

/**
 * Hello world!
 *
 */
public class LearnThread {
    public static void main(String[] args) throws InterruptedException {
        //learnJoin();
        learnConcurrency();

    }
    public static void learnJoin() throws InterruptedException{
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Start the threads
        t1.start();
        t2.start();

        // Main thread waits for t1 to complete
        t1.join();

        //Main thread continues here after t1 completes
        System.out.println("Main thread completed");
    }
    public static void learnConcurrency() throws InterruptedException{
        final SharedResource counter = new SharedResource();
        // Creating multiple threads that access the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Starting the threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // After both threads have finished, print the final count
        System.out.println("Final count: " + counter.getCount());
    }
}
