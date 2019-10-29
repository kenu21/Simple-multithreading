package multithreads;

public class MyThreadR implements Runnable {
    private Thread thread;

    public MyThreadR() {
        thread = new Thread(this,"MyThread by implements: ");
        thread.start();
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println(thread.getName() + i);
            try {
                thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
