package multithreads;

public class DemoThread {
    private static Counter counter = new Counter();
    public static void main(String[] args) throws InterruptedException {
        new MyThreadE(counter).start();
        new MyThreadR(counter).getThread().start();
    }
}
