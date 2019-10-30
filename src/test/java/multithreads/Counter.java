package multithreads;

public class Counter {
    private static int counter = 0;

    public void increment() {
        while (counter < 100) {
            System.out.println(Thread.currentThread().getName() + counter++);
        }
    }
}
