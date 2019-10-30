package multithreads;

public class MyThreadR implements Runnable {
    private Thread thread;
    private static Counter counter;

    public MyThreadR(Counter counter) {
        thread = new Thread(this,"MyThread by implements: ");
        thread.start();
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.increment();
        try {
            thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
