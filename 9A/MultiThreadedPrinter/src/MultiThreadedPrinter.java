import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultiThreadedPrinter {

    private static final int MAX_NUMBER = 15;
    private int currentNumber = 1; // The number to be printed
    private final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        MultiThreadedPrinter printer = new MultiThreadedPrinter();
        
        // Create threads for each of the print functions
        Thread t2 = new Thread(printer::printTwo);
        Thread t3 = new Thread(printer::printThree);
        Thread t4 = new Thread(printer::printFour);
        Thread t5 = new Thread(printer::printFive);
        Thread tNum = new Thread(printer::printNumber);
        
        // Start all threads
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        tNum.start();
    }

    // Function to print if the number is divisible by 2
    public void printTwo() {
        while (true) {
            lock.lock();
            try {
                if (currentNumber > MAX_NUMBER) return;
                if (currentNumber % 2 == 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
                    System.out.println("Divisible by 2: " + currentNumber);
                    currentNumber++;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    // Function to print if the number is divisible by 3
    public void printThree() {
        while (true) {
            lock.lock();
            try {
                if (currentNumber > MAX_NUMBER) return;
                if (currentNumber % 3 == 0 && currentNumber % 2 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
                    System.out.println("Divisible by 3: " + currentNumber);
                    currentNumber++;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    // Function to print if the number is divisible by 4
    public void printFour() {
        while (true) {
            lock.lock();
            try {
                if (currentNumber > MAX_NUMBER) return;
                if (currentNumber % 4 == 0 && currentNumber % 2 != 0 && currentNumber % 3 != 0 && currentNumber % 5 != 0) {
                    System.out.println("Divisible by 4: " + currentNumber);
                    currentNumber++;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    // Function to print if the number is divisible by 5
    public void printFive() {
        while (true) {
            lock.lock();
            try {
                if (currentNumber > MAX_NUMBER) return;
                if (currentNumber % 5 == 0 && currentNumber % 2 != 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0) {
                    System.out.println("Divisible by 5: " + currentNumber);
                    currentNumber++;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    // Function to print the number if none of the conditions match
    public void printNumber() {
        while (true) {
            lock.lock();
            try {
                if (currentNumber > MAX_NUMBER) return;
                if (currentNumber % 2 != 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
                    System.out.println("Number: " + currentNumber);
                    currentNumber++;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
