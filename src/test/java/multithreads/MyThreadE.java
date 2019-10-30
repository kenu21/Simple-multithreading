package multithreads;

public class MyThreadE extends Thread {
    private Counter counter;

    public MyThreadE(Counter counter) {
        setName("MyThread by extends: ");
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.increment();
        try {
            sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
