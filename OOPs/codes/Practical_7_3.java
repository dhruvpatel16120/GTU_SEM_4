package OOPs.codes;

/* Practical No: 7.3
Title: Synchronized Method for Table Printing

Practical Statement:
- Two threads print tables (5 and 7)
- Use synchronized method to avoid mixed output
*/

// Shared class
class Table {

    // Synchronized method
    synchronized void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));

            try {
                Thread.sleep(200); // small delay
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        System.out.println();
    }
}

// Thread 1
class ThreadA extends Thread {
    Table t;

    ThreadA(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

// Thread 2
class ThreadB extends Thread {
    Table t;

    ThreadB(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(7);
    }
}

// Main class
public class Practical_7_3 {
    public static void main(String[] args) {

        Table obj = new Table();

        ThreadA t1 = new ThreadA(obj);
        ThreadB t2 = new ThreadB(obj);

        t1.start();
        t2.start();
    }
}