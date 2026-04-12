package OOPs.codes;

/* Practical No: 7.1
Title: Multithreading Example

Practical Statement:
- Thread 1 → prints 1 to 10 (interval: 1 second)
- Thread 2 → prints 11 to 20 (interval: 500 ms)
*/

public class Practical_7_1 {

    // Thread 1
    static class ThreadOne extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(1000); // 1 second
                } catch (InterruptedException e) {
                    System.out.println("Thread 1 Interrupted");
                }
            }
        }
    }

    // Thread 2
    static class ThreadTwo extends Thread {
        @Override
        public void run() {
            for (int i = 11; i <= 20; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(500); // 500 ms
                } catch (InterruptedException e) {
                    System.out.println("Thread 2 Interrupted");
                }
            }
        }
    }

    // Main class
    public static void main(String[] args) {

        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        // Start threads
        t1.start();
        t2.start();
    }
}
