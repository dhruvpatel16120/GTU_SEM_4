package OOPs.codes;

/* Practical No: 7.2
Title: Sequential Thread Execution

Practical Statement:
- T1 → prints 1 to 100
- T2 → prints 101 to 200
- T3 → prints 201 to 300
- Ensure sequential execution using join()
*/

// Thread 1
class T1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}

// Thread 2
class T2 extends Thread {
    public void run() {
        for (int i = 101; i <= 200; i++) {
            System.out.println(i);
        }
    }
}

// Thread 3
class T3 extends Thread {
    public void run() {
        for (int i = 201; i <= 300; i++) {
            System.out.println(i);
        }
    }
}

// Main class
public class Practical_7_2 {
    public static void main(String[] args) {

        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

        try {
            // Start T1 and wait
            t1.start();
            t1.join();

            // Start T2 and wait
            t2.start();
            t2.join();

            // Start T3
            t3.start();
            t3.join();

        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}