package threads.userthreads;

class MyThread implements Runnable {
    @Override
    public void run() {
        // Code to be executed in the thread
        System.out.println(" Thread is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start(); // Start the thread
    }
}

