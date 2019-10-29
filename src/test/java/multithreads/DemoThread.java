package multithreads;

public class DemoThread {
    public static void main(String[] args) throws InterruptedException {
        MyThreadR myThreadR = new MyThreadR();
        MyThreadE myThreadE = new MyThreadE();
        myThreadE.join();
        myThreadE.join();
    }
}
