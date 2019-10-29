package multithreads;

public class MyThreadE extends Thread {
    public MyThreadE() {
        setName("MyThread by extends: ");
        start();
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println(getName() + i);
            try {
                sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
