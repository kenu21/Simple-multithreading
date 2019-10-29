package multithreads;

public class MyThreadE extends Thread {
    private Common common;

    public MyThreadE(Common common) {
        setName("MyThread by extends: ");
        start();
        this.common = common;
    }

    @Override
    public void run() {
        common.increment();
        try {
            sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
