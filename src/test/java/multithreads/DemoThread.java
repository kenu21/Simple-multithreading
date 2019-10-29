package multithreads;

public class DemoThread {
    private static Common common = new Common();
    public static void main(String[] args) throws InterruptedException {
        MyThreadR myThreadR = new MyThreadR(common);
        MyThreadE myThreadE = new MyThreadE(common);
        myThreadE.join();
        myThreadE.join();
    }
}
