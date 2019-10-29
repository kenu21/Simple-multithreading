package multithreads;

public class Common {
    private static int integer = 0;

    public void increment() {
        while (integer < 100) {
            System.out.println(Thread.currentThread().getName() + integer++);
        }
    }
}
