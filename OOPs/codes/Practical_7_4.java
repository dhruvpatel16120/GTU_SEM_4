package OOPs.codes;

/* Practical No: 7.4
Title: Parallel Sum using Threads

Practical Statement:
- Thread 1 → sum from 1 to 1000
- Thread 2 → sum from 1001 to 2000
- Run both threads in parallel
- Return result using getter
- Use join() and print final sum
*/

// Thread 1
class SumThread1 extends Thread {
    private int sum = 0;

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
    }

    public int getSum() {
        return sum;
    }
}

// Thread 2
class SumThread2 extends Thread {
    private int sum = 0;

    public void run() {
        for (int i = 1001; i <= 2000; i++) {
            sum += i;
        }
    }

    public int getSum() {
        return sum;
    }
}

// Main class
public class Practical_7_4 {
    public static void main(String[] args) {

        SumThread1 t1 = new SumThread1();
        SumThread2 t2 = new SumThread2();

        // Start both threads (parallel execution)
        t1.start();
        t2.start();

        try {
            // Wait for both threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }

        // Get partial sums
        int sum1 = t1.getSum();
        int sum2 = t2.getSum();

        // Final sum
        int total = sum1 + sum2;

        System.out.println("Sum (1 to 1000): " + sum1);
        System.out.println("Sum (1001 to 2000): " + sum2);
        System.out.println("Final Total Sum (1 to 2000): " + total);
    }
}