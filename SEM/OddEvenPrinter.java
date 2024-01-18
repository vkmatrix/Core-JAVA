class OddThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            synchronized (OddEvenPrinter.class) {
                System.out.println("Odd: " + i);
                try {
                    // Notify the other thread to proceed
                    OddEvenPrinter.class.notify();
                    // Wait for the other thread to notify before proceeding
                    OddEvenPrinter.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class EvenThread implements Runnable {

    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            synchronized (OddEvenPrinter.class) {
                System.out.println("Even: " + i);
                try {
                    // Notify the other thread to proceed
                    OddEvenPrinter.class.notify();
                    // Wait for the other thread to notify before proceeding
                    OddEvenPrinter.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class OddEvenPrinter{

    public static void main(String[] args) {
        // Create two threads
        Thread oddThread = new Thread(new OddThread());
        Thread evenThread = new Thread(new EvenThread());

        // Start the threads
        oddThread.start();
        evenThread.start();
    }
}