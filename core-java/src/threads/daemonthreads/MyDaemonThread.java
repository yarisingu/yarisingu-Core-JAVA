package threads.daemonthreads;

class  Main extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Main thread is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MyDaemonThread {
    public static void main(String[] args) {
        Main main = new Main();
        main.setDaemon(true); // Set the thread as daemon
        main.start(); // Start the thread

        // Simulating the main thread
        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("MyDaemonThread thread finished");
    }
}
