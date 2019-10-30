package multithreads;

public class DemoThread {
    private static Counter counter = new Counter();
    public static void main(String[] args) throws InterruptedException {
        MyThreadR myThreadR = new MyThreadR(counter);
        MyThreadE myThreadE = new MyThreadE(counter);
    }
}
