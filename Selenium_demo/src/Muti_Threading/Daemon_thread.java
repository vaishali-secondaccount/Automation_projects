package Muti_Threading;
class MyThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Daemon_thread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setDaemon(true);  // Set thread as daemon
        t.start();

        try {
            Thread.sleep(1500);  // Main thread sleeps
            System.out.println("Main thread finished.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
