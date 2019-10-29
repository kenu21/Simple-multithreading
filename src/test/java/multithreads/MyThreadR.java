package multithreads;

public class MyThreadR implements Runnable {
    private Thread thread;
    private static Common common;

    public MyThreadR(Common common) {
        thread = new Thread(this,"MyThread by implements: ");
        thread.start();
        this.common = common;
    }

    @Override
    public void run() {
        common.increment();
        try {
            thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
